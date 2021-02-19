package com.body.gg.service;

import com.body.gg.common.jwt.JwtTokenUtil;
import com.body.gg.domain.dto.JwtDto;
import com.body.gg.domain.entity.user.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class UserOauthInfoService {

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

//    @Transactional
//    public String login(String token) {
//        String result;
//
//        UserEntity userEntity = userRepository.findByUsername(username)                                    //해당 아이디값 추출
//                .orElse(UserEntity.builder().build());
//        if(userEntity != null) {                                                                            //해당 아이디가 있는지
//
//            result = jwtTokenUtil.generateToken(new JwtDto(userEntity.getNo(),userEntity.getUsername(), "nickname1", userEntity.getEmail(), userEntity.getPassword()));
//        }
//        return result;
//    }
//
//    @Transactional
//    public boolean checkId(String username) {
//        Optional<UserEntity> userEntityWrapper = userRepository.findByUsername(username);
//        boolean check = userEntityWrapper.isPresent();
//
//        return check;
//    }
}