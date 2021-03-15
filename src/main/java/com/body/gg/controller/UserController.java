package com.body.gg.controller;

import com.body.gg.common.APIResponseCode;
import com.body.gg.common.jwt.JwtTokenUtil;
import com.body.gg.common.response.JwtTokenError;
import com.body.gg.domain.dto.BodyDto;
import com.body.gg.domain.entity.body.BotEntity;
import com.body.gg.domain.mapper.UserMapper;
import com.body.gg.service.UserInfoService;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {
    private APIResponseCode apiResponseCode;
    @Autowired
    UserInfoService userInfoService;

    @Autowired
    JwtTokenUtil jwtTokenUtil;

    @Autowired
    JwtTokenError jwtTokenError;


    @PostMapping("/info/user")
    public Map<String, Object> userInfoInsert(HttpServletRequest request,@RequestBody Map<String, String> params) throws ParseException {
        String requestTokenHeader = request.getHeader("Authorization");
        requestTokenHeader = requestTokenHeader.substring(6);
        String gender = params.get("gender");
        int u_id = jwtTokenUtil.getIdFromToken(requestTokenHeader);
        Map<String, Object> resultReturn = userInfoService.UserInfoInsert(u_id,gender);
        return resultReturn;
    }

//    @PostMapping("/info/bot")
//    public Map<String, Object> intoInfo(HttpServletRequest request, @ModelAttribute BotEntity botEntity) throws ParseException {
//        String requestTokenHeader = request.getHeader("jwt");
//        String name = jwtTokenUtil.getUsernameFromToken(requestTokenHeader);
//        String email = jwtTokenUtil.getEmailFromToken(requestTokenHeader);
//
//        Enumeration params = request.getParameterNames();
//        if(params.hasMoreElements()){
//            if(!parameterError.diaryGet(params)){
//                result.put("error",responseError.makeResponseError("param-003"));
//                result.put("result",false);
//                return result;
//            }
//        }
//        Map<String,String> tokenError = jwtTokenError.jwtErrorCheck(request);
//    }

}
