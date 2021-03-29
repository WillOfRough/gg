package com.body.gg.controller;

import com.body.gg.common.jwt.JwtTokenUtil;
import com.body.gg.common.response.JwtTokenError;
import com.body.gg.service.PartInfoService;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
public class PartInfoController {

    @Autowired
    JwtTokenUtil jwtTokenUtil;

    @Autowired
    JwtTokenError jwtTokenError;

    @Autowired
    PartInfoService partInfoService;

    @GetMapping("/info/part/{table}")
    public Map<String, Object> PartInfoSelect(HttpServletRequest request, @PathVariable String _table) {
        Map<String, Object> result = partInfoService.selectInfoTableOfPart(_table);
        return result;
    }

    @PostMapping("/info/part")
    public Map<String, Object> PartInfoInsert(HttpServletRequest request,@RequestBody Map<String, String> params) throws ParseException {
        String sTable = "";
        String requestTokenHeader = request.getHeader("Authorization");
        requestTokenHeader = requestTokenHeader.substring(6);
        int u_id = jwtTokenUtil.getIdFromToken(requestTokenHeader);
        String pName = params.get("pName");
        String pTable = params.get("pTable");
        String type = params.get("type");
        String mmtName = params.get("mmtName");
        String comment = params.get("comment");
        if(type.equals("text")){
            sTable = "st_part";
        }
        else{
            sTable = pTable;
        }
        Map<String, Object> result = partInfoService.insertInfoPart(pName,pTable,sTable,mmtName,comment);
        return result;
    }

}
