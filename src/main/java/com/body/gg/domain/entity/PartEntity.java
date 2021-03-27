package com.body.gg.domain.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Data
@Alias("part")
public class PartEntity {
    int p_id;
    String p_name;
    String p_table;
    String s_table;
    int g_id;
    String p_comment;
}
