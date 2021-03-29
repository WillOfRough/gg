package com.body.gg.domain.mapper;

import com.body.gg.domain.entity.PartEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface PartInfoMapper {
    PartEntity selectInfoPart(String _pName,String _mmtName);
    PartEntity selectInfoMeasurementOfPart(String _pName,String _mmtName);
    List<PartEntity> selectInfoTableOfPart(String _table);
    int insertInfoPart(String _pName, String _pTable,String _sTable,int _gId,String _pComment);

}
