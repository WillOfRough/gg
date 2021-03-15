package com.body.gg.domain.entity.body;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Data
@Alias("body")
public class BodyEntity {
    private int u_id;

    //head
    private double head_circumference;
    private double head_Face_length;

    //top
    private String cup_size;
    private double chest_round;
    private double chest_section;
    private double top_length;
    private double shoulder_length;
    private double sleeve_length;
    private double wrist_round;

    //bot
    private double waist_section;
    private double waist_round;
    private double bot_rise;
    private double knee_round;
    private double thigh_section;
    private double thigh_round;
    private double bot_length;
    private double leg_opening;

    //foot
    private double foot_wide;
    private double foot_size;
}
