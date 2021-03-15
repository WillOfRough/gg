package com.body.gg.service;

import com.body.gg.common.APIResponseCode;
import com.body.gg.domain.entity.body.BotEntity;
import com.body.gg.domain.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserInfoService {

    private APIResponseCode apiResponseCode;

    @Autowired
    private UserMapper userMapper;

    @Transactional
    public Map<String,Object> UserInfoInsert(int u_id, String u_gender){
        Map<String,Object> serviceResult = new HashMap<>();
        try{
            userMapper.insertUserInfo(u_id, u_gender);
            userMapper.insertUserHead(u_id);
            userMapper.insertUserTop(u_id);
            userMapper.insertUserBot(u_id);
            userMapper.insertUserFoot(u_id);
            serviceResult.put("reason",apiResponseCode.G_SUCCESS.getReason());
            serviceResult.put("code",apiResponseCode.G_SUCCESS.getKey());
        }
        catch(Exception e){
            System.out.println(e);
            serviceResult.put("reason",apiResponseCode.G_INTERNAL_ERROR.getReason());
            serviceResult.put("code",apiResponseCode.G_INTERNAL_ERROR.getKey());
        }
        return serviceResult;
    }
}
