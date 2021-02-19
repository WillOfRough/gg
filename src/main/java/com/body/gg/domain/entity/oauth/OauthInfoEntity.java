package com.body.gg.domain.entity.oauth;

import lombok.Builder;
import lombok.Getter;

@Getter
public class OauthInfoEntity {
    private String token;
    private String infoUrl;

    @Builder
    OauthInfoEntity(String token, String infoUrl){
        this.token = token;
        this.infoUrl =infoUrl;
    }
}