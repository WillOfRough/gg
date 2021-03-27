package com.body.gg.domain.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Data
@Alias("body")
public class BodyInfoEntity {
    int u_id;
    String p_name;
    double size;
    String c_date;
    String m_name;
    String p_table;
}
