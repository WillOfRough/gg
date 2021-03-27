package com.body.gg.domain.entity;

import lombok.*;
import org.apache.ibatis.type.Alias;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Data
@Alias("user")
public class UserEntity {
    private Long u_id;
    private String u_email;
    private String u_name;
    private String u_nickname;
    private String u_age;
    private int u_start;
    private String u_oauth;
    private String u_gender;

    @Builder
    public UserEntity(Long uId, String uName, String uEmail, String uGender,int uStart) {
        this.u_id = uId;
        this.u_name=uName;
        this.u_email=uEmail;
        this.u_gender = uGender;
        this.u_start = uStart;
    }
}
