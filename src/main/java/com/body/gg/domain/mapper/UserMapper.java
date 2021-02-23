package com.body.gg.domain.mapper;

import com.body.gg.domain.entity.user.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface UserMapper {
    UserEntity findUser(String email, String oauth);
    int insertUser(String email, String oauth, String name);
    int deleteUser();
    int updateUser();
}
