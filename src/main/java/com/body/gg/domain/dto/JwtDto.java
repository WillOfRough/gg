package com.body.gg.domain.dto;


import com.body.gg.domain.entity.user.UserEntity;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Data
public class JwtDto {
    private Long no;
    private String uName;
    private String uEmail;

    public UserEntity toEntity(){
        return UserEntity.builder()
                .uName(uName)
                .uEmail(uEmail)
                .build();
    }

    @Builder
    public JwtDto(Long no, String uName, String uEmail) {
        this.no=no;
        this.uName=uName;
        this.uEmail=uEmail;
    }
}