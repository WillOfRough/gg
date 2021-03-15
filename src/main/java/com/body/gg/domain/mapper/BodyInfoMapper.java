package com.body.gg.domain.mapper;

import com.body.gg.domain.entity.body.BodyEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface BodyInfoMapper {
    BodyEntity bodyInfoSelect(int _id,String _table);
    BodyEntity bodyInfoSelectAll(int _id);
    int updateUserNumInfo(int _id,String _table,String _key, double _value);
    int updateUserTextInfo(int _id,String _table,String _key, String _value);
}
