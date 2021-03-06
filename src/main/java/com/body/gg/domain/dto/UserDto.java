package com.body.gg.domain.dto;

import com.body.gg.domain.entity.UserEntity;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class UserDto implements UserDetails {
    private Long no;
    private String username;
    private String email;
    private String nickname;
    private String password;
    private String gender;
    private boolean isEnabled;
    private boolean isAccountNonExpired;
    private boolean isAccountNonLocked;
    private boolean isCredentialsNonExpired;
    private Collection<? extends GrantedAuthority> authorities;

    public UserEntity toEntity(){
        return UserEntity.builder()
                .uId(no)
                .uName(username)
                .uEmail(email)
                .build();
    }

    @Builder
    public UserDto(Long no, String username, String nickname, String email, String password, String gender) {
        this.no = no;
        this.username=username;
        this.nickname=nickname;
        this.email = email;
        this.password = password;
        this.gender = gender;
    }
}
