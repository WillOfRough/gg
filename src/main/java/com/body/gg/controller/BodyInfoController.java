package com.body.gg.controller;

import com.body.gg.common.jwt.JwtTokenUtil;
import com.body.gg.common.response.JwtTokenError;
import com.body.gg.service.BodyInfoService;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class BodyInfoController {
    @Autowired
    BodyInfoService bodyInfoService;

    @Autowired
    JwtTokenUtil jwtTokenUtil;

    @Autowired
    JwtTokenError jwtTokenError;

    @GetMapping("/body/{table}")
    public Map<String, Object> BodyInfoSelect(HttpServletRequest request,@PathVariable String table) {
        String requestTokenHeader = request.getHeader("Authorization");
        requestTokenHeader = requestTokenHeader.substring(6);
        int u_id = jwtTokenUtil.getIdFromToken(requestTokenHeader);
        Map<String, Object> result = new HashMap<>();
        result.put("data", bodyInfoService.BodyInfoSelect(u_id,table));
        return result;
    }

    @GetMapping("/body/All")
    public Map<String, Object> BodyInfoSelectAll(HttpServletRequest request) throws ParseException {
        String requestTokenHeader = request.getHeader("Authorization");
        requestTokenHeader = requestTokenHeader.substring(6);
        int u_id = jwtTokenUtil.getIdFromToken(requestTokenHeader);
        Map<String, Object> result = new HashMap<>();
        result.put("data", bodyInfoService.BodyInfoSelectAll(u_id));
        return result;
    }

    @PostMapping("/body/info")
    public Map<String, Object> BodyInfoUpdate(HttpServletRequest request, @RequestBody Map<String, String> params) throws ParseException {
        String requestTokenHeader = request.getHeader("Authorization");
        requestTokenHeader = requestTokenHeader.substring(6);
        int u_id = jwtTokenUtil.getIdFromToken(requestTokenHeader);
        String key = params.get("key");
        String type = params.get("type");
        String table = params.get("table");
        Double value = Double.parseDouble(params.get("value"));
        Map<String, Object> result = new HashMap<>();
        result.put("data", bodyInfoService.UserInfoUpdate(u_id,table,key,value));
        return result;
    }
}
