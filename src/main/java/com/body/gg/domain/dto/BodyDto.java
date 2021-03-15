package com.body.gg.domain.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class BodyDto {
    private int u_id;
    private String cup_size;
    private double chest_round;
    private double chest_section;
    private double top_length;
    private double shoulder_length;
    private double sleeve_length;
    private double wrist_round;
}