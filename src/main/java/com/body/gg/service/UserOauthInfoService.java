package com.body.gg.service;

import com.body.gg.common.jwt.JwtTokenUtil;
import com.body.gg.domain.dto.JwtDto;
import com.body.gg.domain.dto.UserDto;
import com.body.gg.domain.entity.user.UserEntity;
import com.body.gg.domain.mapper.UserMapper;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserOauthInfoService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Transactional
    public String login(String token,String oauth) throws ParseException {
        String result = null;
        String apiURL = null;
        try{
            if(oauth=="kakao"){
                apiURL = "https://kapi.kakao.com/v2/user/me";
            }
            else if(oauth.equals("naver")){
                apiURL = "https://openapi.naver.com/v1/nid/me";
            }
            else if(oauth == "google"){
                apiURL = "https://www.googleapis.com/oauth2/v3/userinfo";
            }
            else{
                return result;
            }

            String header = "Bearer " + token; // Bearer 다음에 공백 추가
            Map<String, String> requestHeaders = new HashMap<>();
            requestHeaders.put("Authorization", header);
            String responseJson = responseJson(apiURL,requestHeaders);
            JwtDto jwtDto = getDto(responseJson,oauth);
            result = jwtTokenUtil.generateToken(jwtDto);
        }
        catch (ExceptionInInitializerError error){
            System.out.println(error);
        }
        return result;
    }
    private JwtDto getDto(String responseJson,String oauth) throws ParseException {
        String uEmail;
        String uName;
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject)parser.parse(responseJson);
//        uEmail = jsonObject.get("email").toString();
//        uName = jsonObject.get("name").toString();
        uEmail = "9guyu77@naver.com";
        uName = "Lim";
        UserEntity userEntity = userMapper.findUser(uEmail,oauth);
        if(userEntity == null){
            int user = userMapper.insertUser(uEmail,oauth,uName);
            System.out.println(user);
        }
        JwtDto jwtDto = JwtDto.builder()
                .uEmail(uEmail)
                .no(userEntity.getU_id())
                .uName(userEntity.getU_name())
                .build();
        return jwtDto;
    }

    private static String responseJson(String apiUrl, Map<String, String> requestHeaders){
        HttpURLConnection con = connect(apiUrl);
        try {
            con.setRequestMethod("GET");
            for(Map.Entry<String, String> header :requestHeaders.entrySet()) {
                con.setRequestProperty(header.getKey(), header.getValue());
            }

            int responseCode = con.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) { // 정상 호출
                return readBody(con.getInputStream());
            } else { // 에러 발생
                return readBody(con.getErrorStream());
            }
        } catch (IOException e) {
            throw new RuntimeException("API 요청과 응답 실패", e);
        } finally {
            con.disconnect();
        }
    }

    private static HttpURLConnection connect(String apiUrl){
        try {
            URL url = new URL(apiUrl);
            return (HttpURLConnection)url.openConnection();
        } catch (MalformedURLException e) {
            throw new RuntimeException("API URL이 잘못되었습니다. : " + apiUrl, e);
        } catch (IOException e) {
            throw new RuntimeException("연결이 실패했습니다. : " + apiUrl, e);
        }
    }

    private static String readBody(InputStream body){
        InputStreamReader streamReader = new InputStreamReader(body);

        try (BufferedReader lineReader = new BufferedReader(streamReader)) {
            StringBuilder responseBody = new StringBuilder();

            String line;
            while ((line = lineReader.readLine()) != null) {
                responseBody.append(line);
            }

            return responseBody.toString();
        } catch (IOException e) {
            throw new RuntimeException("API 응답을 읽는데 실패했습니다.", e);
        }
    }
}