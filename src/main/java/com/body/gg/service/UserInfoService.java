package com.body.gg.service;

import com.body.gg.domain.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserInfoService {

    @Autowired
    private UserMapper userMapper;

//    @Transactional
//    public Map<Object,Object> UserInfoInsert(int u_id, String u_gender){
//        userMapper.insertUserInfo(u_id, u_gender);
//        Map<String,Object> serviceResult = new HashMap<>();
//    }

}
