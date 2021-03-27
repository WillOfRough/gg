package com.body.gg.domain.mapper;

import com.body.gg.domain.entity.MeasurementEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface MeasurementMapper {
    List<MeasurementEntity> selectInfoMeasurement(String _mName);
}
