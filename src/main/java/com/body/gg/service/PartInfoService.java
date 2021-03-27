package com.body.gg.service;

import com.body.gg.common.APIResponseCode;
import com.body.gg.domain.entity.MeasurementEntity;
import com.body.gg.domain.entity.PartEntity;
import com.body.gg.domain.mapper.PartInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PartInfoService {

    private APIResponseCode apiResponseCode;

    @Autowired
    PartInfoMapper partInfoMapper;

    @Transactional
    public Map<String,Object> selectInfoTableOfPart(String _pTable){
        Map<String,Object> serviceResult = new HashMap<>();
        try{
            List<PartEntity> partEntityList = partInfoMapper.selectInfoTableOfPart(_pTable);
            serviceResult.put("data",partEntityList);
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
    public Map<String,Object> insertInfoPart(String _pTable){
        Map<String,Object> serviceResult = new HashMap<>();
        try{
            List<PartEntity> partEntityList = partInfoMapper.selectInfoTableOfPart(_pTable);
            serviceResult.put("data",partEntityList);
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
