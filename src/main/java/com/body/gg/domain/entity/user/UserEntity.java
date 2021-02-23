package com.body.gg.domain.entity.user;

import lombok.*;
import org.apache.ibatis.type.Alias;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Data
@Alias("user")
public class UserEntity {
    private Long u_id;
    private String u_name;
    private String u_email;
    private String u_gender;

    @Builder
    public UserEntity(Long uId, String uName, String uEmail, String uGender) {
        this.u_id = uId;
        this.u_name=uName;
        this.u_email=uEmail;
        this.u_gender = uGender;
    }
}
