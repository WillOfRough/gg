package com.body.gg.domain.entity.body;

import com.body.gg.domain.entity.user.UserEntity;
import lombok.*;
import org.apache.ibatis.type.Alias;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Data
@Alias("bot")
@Table(name = "bot")
public class BotEntity {

    @Id
    private int u_id;
    private double waist_section;
    private double waist_round;
    private double bot_rise;
    private double knee_round;
    private double thigh_section;
    private double thigh_round;
    private double bot_length;
    private double leg_opening;
}
