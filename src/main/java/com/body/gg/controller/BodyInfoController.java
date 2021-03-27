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

    @GetMapping("/body/all")
    public Map<String, Object> BodyInfoSelectAll(HttpServletRequest request) throws ParseException {
        String requestTokenHeader = request.getHeader("Authorization");
        requestTokenHeader = requestTokenHeader.substring(6);
        int u_id = jwtTokenUtil.getIdFromToken(requestTokenHeader);
        Map<String, Object> result = bodyInfoService.BodyInfoSelectAll(u_id);
        return result;
    }

    @PostMapping("/body/info")
    public Map<String, Object> BodyInfoInsert(HttpServletRequest request, @RequestBody Map<String, String> params) throws ParseException {
        String requestTokenHeader = request.getHeader("Authorization");
        requestTokenHeader = requestTokenHeader.substring(6);
        int uId = jwtTokenUtil.getIdFromToken(requestTokenHeader);
        String part = params.get("part");
        String size = params.get("size");
        String mmtName = params.get("mmtName");
        Map<String, Object> result = bodyInfoService.UserInfoInsert(uId,part,size,mmtName);
        return result;
    }
}
