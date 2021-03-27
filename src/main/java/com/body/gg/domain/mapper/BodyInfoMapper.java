package com.body.gg.domain.mapper;

import com.body.gg.domain.entity.BodyInfoEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface BodyInfoMapper {
    List<BodyInfoEntity> bodyInfoSelectAll(int _uId);
    List<BodyInfoEntity> bodyInfoSelectPart(int _uId,String _table);
    BodyInfoEntity selectInfoBody(int _uId, String _table, String _pName, String _mmtName);
    int insertUserInfo(int _uId,String _table,String _part,String _size, String _mmt);
    int updateUserInfo(int _uId,String _table,String _part,String _size, String _mmt);
}
