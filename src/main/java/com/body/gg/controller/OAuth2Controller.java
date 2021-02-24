package com.body.gg.controller;

import com.body.gg.common.APIResponseCode;
import com.body.gg.service.UserOauthInfoService;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
public class OAuth2Controller {

    private APIResponseCode apiResponseCode;
    @Autowired
    UserOauthInfoService userOauthInfoService;

    @PostMapping("/oauthlogin")
    public Map<String,Object> sendEmail (@RequestBody Map<String, String> params) throws ParseException {
        String token = params.get("token");
        String oauth = params.get("oauth");
        String jwt = userOauthInfoService.login(token,oauth);
        Map<String,Object> result = new HashMap<>();
        if(jwt == null){
            result.put("code",apiResponseCode.G_SUCCESS);
        }
        else{
            result.put(apiResponseCode.G_SUCCESS.getKey(),apiResponseCode.G_SUCCESS.getReason());
        }
        result.put("jwt",jwt);
        return result;
    }

    @GetMapping({"/loginSuccess", "/hello"})
    public String loginSuccess() {
        return "hello";
    }

    @GetMapping("/loginFailure")
    public String loginFailure() {
        return "loginFailure";
    }
}
