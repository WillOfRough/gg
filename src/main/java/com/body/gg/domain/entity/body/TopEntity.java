package com.body.gg.domain.entity.body;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Data
@Alias("top")
public class TopEntity {
    private int u_id;
    private String cup_size;
    private double chest_round;
    private double chest_section;
    private double top_length;
    private double shoulder_length;
    private double sleeve_length;
    private double wrist_round;
}
