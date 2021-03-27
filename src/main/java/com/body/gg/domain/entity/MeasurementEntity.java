package com.body.gg.domain.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Data
@Alias("measurement")
public class MeasurementEntity {
    int m_id;
    String m_name;
    int g_id;
}
