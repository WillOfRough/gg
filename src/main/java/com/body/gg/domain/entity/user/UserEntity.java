package com.body.gg.domain.entity.user;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class UserEntity {
    private Long no;
    private String username;
    private String nickname;
    private String email;
    private String password;
    private String gender;

    @Builder
    public UserEntity(Long no, String username, String nickname, String email, String password, String gender) {
        this.no = no;
        this.username=username;
        this.nickname=nickname;
        this.email = email;
        this.password = password;
        this.gender = gender;
    }
}
