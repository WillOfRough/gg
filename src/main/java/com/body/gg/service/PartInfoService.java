package com.body.gg.service;

import com.body.gg.common.APIResponseCode;
import com.body.gg.domain.entity.MeasurementEntity;
import com.body.gg.domain.entity.PartEntity;
import com.body.gg.domain.mapper.MeasurementMapper;
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

    @Autowired
    MeasurementMapper measurementMapper;

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
    public Map<String,Object> insertInfoPart(String _pName,String _pTable,String _sTable,String _mmtName, String _comment){
        int gId;
        Map<String,Object> serviceResult = new HashMap<>();
        Map<String,Object> dataResult = new HashMap<>();
        try{
            MeasurementEntity measurementEntity = measurementMapper.selectInfoGroupIdOfMeasurementName(_mmtName);
            gId = measurementEntity.getG_id();
            int result = partInfoMapper.insertInfoPart(_pName,_pTable,_sTable,gId,_comment);
            if(result == 1){
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
