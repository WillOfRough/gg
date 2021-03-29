package com.body.gg.service;

import com.body.gg.common.APIResponseCode;
import com.body.gg.domain.entity.UserEntity;
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
    public Map<String,Object> UpdateUserGender(int u_id, String u_gender){
        Map<String,Object> serviceResult = new HashMap<>();
        Map<String,Object> dataResult = new HashMap<>();
        try{
            userMapper.updateUserGender(u_id, u_gender);
            userMapper.updateUserFirst(u_id);
            dataResult.put("result",true);
            serviceResult.put("data",dataResult);
            serviceResult.put("reason",apiResponseCode.G_SUCCESS.getReason());
            serviceResult.put("code",apiResponseCode.G_SUCCESS.getKey());
        }
        catch(Exception e){
            System.out.println(e);
            dataResult.put("result",false);
            serviceResult.put("data",dataResult);
            serviceResult.put("reason",apiResponseCode.G_INTERNAL_ERROR.getReason());
            serviceResult.put("code",apiResponseCode.G_INTERNAL_ERROR.getKey());
        }
        return serviceResult;
    }

    @Transactional
    public Map<String,Object> SelectUserGender(int u_id){
        Map<String,Object> serviceResult = new HashMap<>();
        try{
            UserEntity userEntity = userMapper.selectUserGender(u_id);
            serviceResult.put("data",userEntity);
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

    @Transactional
    public Map<String,Object> checkFirstUser(int _uId){
        Map<String,Object> serviceResult = new HashMap<>();
        Map<String,Object> dataResult = new HashMap<>();
        try{
            UserEntity userEntity = userMapper.checkFirstUser(_uId);
            if(userEntity.getU_start() == 1){
                dataResult.put("result",true);
            }
            else{
                dataResult.put("result",false);
            }
            serviceResult.put("data",dataResult);
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
