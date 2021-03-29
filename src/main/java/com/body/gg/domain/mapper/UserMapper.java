package com.body.gg.domain.mapper;

import com.body.gg.domain.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {
    UserEntity findUser(String email, String oauth);
    UserEntity checkFirstUser(int _uId);
    int updateUserGender(int _uId, String _gender);
    int updateUserFirst(int _uId);
    UserEntity selectUserGender(int _uId);
    int insertUser(String email, String oauth, String name);

    int deleteUser();
    int updateUser();
}
