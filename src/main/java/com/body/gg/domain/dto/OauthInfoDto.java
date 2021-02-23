package com.body.gg.domain.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
public class OauthInfoDto {

    private String token;
    private String infoUrl;

    @Builder
    OauthInfoDto(String token, String infoUrl){
        this.token = token;
        this.infoUrl =infoUrl;
    }
}
