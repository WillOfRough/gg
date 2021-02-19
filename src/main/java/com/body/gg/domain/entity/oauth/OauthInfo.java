package com.body.gg.domain.entity.oauth;

public enum OauthInfo {
    KAKAO{
        public OauthInfoEntity Builder(String token){
            OauthInfoEntity oauthInfoEntity = OauthInfoEntity.builder()
                    .token(token)
                    .infoUrl("https://kapi.kakao.com/v2/user/me")
                    .build();
            return oauthInfoEntity;
        }
    },
    NAVER{
        public OauthInfoEntity Builder(String token){
            OauthInfoEntity oauthInfoEntity = OauthInfoEntity.builder()
                    .token(token)
                    .infoUrl("https://openapi.naver.com/v1/nid/me")
                    .build();
            return oauthInfoEntity;
        }
    },
    GOOGLE{
        public OauthInfoEntity Builder(String token){
            OauthInfoEntity oauthInfoEntity = OauthInfoEntity.builder()
                    .token(token)
                    .infoUrl("https://www.googleapis.com/oauth2/v3/userinfo")
                    .build();
            return oauthInfoEntity;
        }
    },
    FACEBOOK{
        public OauthInfoEntity Builder(String token){
            OauthInfoEntity oauthInfoEntity = OauthInfoEntity.builder()
                    .token(token)
                    .infoUrl("https://graph.facebook.com/me?fields=id,name,email")
                    .build();
            return oauthInfoEntity;
        }
    }
}
