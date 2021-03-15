package com.body.gg.service;

import com.body.gg.common.APIResponseCode;
import com.body.gg.domain.entity.body.BodyEntity;
import com.body.gg.domain.mapper.BodyInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Service
public class BodyInfoService {

    private APIResponseCode apiResponseCode;

    @Autowired
    private BodyInfoMapper bodyInfoMapper;

    @Transactional
    public Map<String,Object> BodyInfoSelect(int _id, String _table){
        BodyEntity bodyEntity = bodyInfoMapper.bodyInfoSelect(_id,_table);
        Map<String,Object> serviceResult = new HashMap<>();
        serviceResult.put("reason",apiResponseCode.G_SUCCESS.getReason());
        serviceResult.put("code",apiResponseCode.G_SUCCESS.getKey());
        serviceResult.put("data",bodyEntity);
        return serviceResult;
    }

    @Transactional
    public Map<String,Object> BodyInfoSelectAll(int _id){
        BodyEntity bodyEntity = bodyInfoMapper.bodyInfoSelectAll(_id);
        Map<String,Object> serviceResult = new HashMap<>();
        serviceResult.put("reason",apiResponseCode.G_SUCCESS.getReason());
        serviceResult.put("code",apiResponseCode.G_SUCCESS.getKey());
        serviceResult.put("data",bodyEntity);
        return serviceResult;
    }
    @Transactional
    public Map<String,Object> UserInfoUpdate(int _id, String _table, String _key, Double _value){
        int mapperResult = bodyInfoMapper.updateUserNumInfo(_id,_table,_key,_value);
        Map<String,Object> serviceResult = new HashMap<>();
        serviceResult.put("reason",apiResponseCode.G_SUCCESS.getReason());
        serviceResult.put("code",apiResponseCode.G_SUCCESS.getKey());
        return serviceResult;
    }
}
