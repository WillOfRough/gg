package com.body.gg.service;

import com.body.gg.common.APIResponseCode;
import com.body.gg.domain.entity.BodyInfoEntity;
import com.body.gg.domain.entity.PartEntity;
import com.body.gg.domain.mapper.BodyInfoMapper;
import com.body.gg.domain.mapper.PartInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BodyInfoService {

    private APIResponseCode apiResponseCode;

    @Autowired
    private BodyInfoMapper bodyInfoMapper;

    @Autowired
    private PartInfoMapper partInfoMapper;
    @Transactional
    public Map<String,Object> BodyInfoSelectAll(int _id){
        Map<String, Object> serviceResult = new HashMap<>();
        try {
            List<BodyInfoEntity> bodyEntity = bodyInfoMapper.bodyInfoSelectAll(_id);
            serviceResult.put("reason", apiResponseCode.G_SUCCESS.getReason());
            serviceResult.put("code", apiResponseCode.G_SUCCESS.getKey());
            serviceResult.put("data", bodyEntity);
        }
        catch(Exception e){
            serviceResult.put("reason",apiResponseCode.G_INTERNAL_ERROR.getReason());
            serviceResult.put("code",apiResponseCode.G_INTERNAL_ERROR.getKey());
        }
        return serviceResult;
    }
    @Transactional
    public Map<String,Object> UserInfoInsert(int _uId, String _partName, String _size, String _mmtName){
        Map<String,Object> serviceResult = new HashMap<>();
        PartEntity partEntity = partInfoMapper.selectInfoPart(_partName,_mmtName);
        if(partEntity == null){
            serviceResult.put("reason",apiResponseCode.G_INTERNAL_ERROR.getReason());
            serviceResult.put("code",apiResponseCode.G_INTERNAL_ERROR.getKey());
            return serviceResult;
        }
        String table = partEntity.getS_table();
        BodyInfoEntity bodyInfoEntity = bodyInfoMapper.selectInfoBody(_uId,table,_partName,_mmtName);
        if(bodyInfoEntity == null){
            int mapperResult = bodyInfoMapper.insertUserInfo(_uId,table,_partName,_size,_mmtName);
        }
        else{
            int mapperResult = bodyInfoMapper.updateUserInfo(_uId,table,_partName,_size,_mmtName);
        }
        serviceResult.put("reason",apiResponseCode.G_SUCCESS.getReason());
        serviceResult.put("code",apiResponseCode.G_SUCCESS.getKey());
        return serviceResult;
    }
}
