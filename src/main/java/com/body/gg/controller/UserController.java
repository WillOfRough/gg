package com.body.gg.controller;

import com.body.gg.common.APIResponseCode;
import com.body.gg.common.jwt.JwtTokenUtil;
import com.body.gg.common.response.JwtTokenError;
import com.body.gg.service.UserInfoService;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
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


    @PostMapping("/user/gender")
    public Map<String, Object> UpdateUserGender(HttpServletRequest request,@RequestBody Map<String, String> params) throws ParseException {
        String requestTokenHeader = request.getHeader("Authorization");
        requestTokenHeader = requestTokenHeader.substring(6);
        String gender = params.get("gender");
        int u_id = jwtTokenUtil.getIdFromToken(requestTokenHeader);
        Map<String, Object> resultReturn = userInfoService.UpdateUserGender(u_id,gender);
        return resultReturn;
    }

    @GetMapping("/user/gender")
    public Map<String, Object> SelectUserGender(HttpServletRequest request) throws ParseException {
        String requestTokenHeader = request.getHeader("Authorization");
        requestTokenHeader = requestTokenHeader.substring(6);
        int u_id = jwtTokenUtil.getIdFromToken(requestTokenHeader);
        Map<String, Object> resultReturn = userInfoService.SelectUserGender(u_id);
        return resultReturn;
    }


    @GetMapping("/check/first")
    public Map<String, Object> checkFirstUser(HttpServletRequest request) throws ParseException {
        String requestTokenHeader = request.getHeader("Authorization");
        requestTokenHeader = requestTokenHeader.substring(6);
        int uId = jwtTokenUtil.getIdFromToken(requestTokenHeader);
        Map<String, Object> resultReturn = userInfoService.checkFirstUser(uId);
        return resultReturn;
    }


}
