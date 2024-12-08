package com.example.mapper;

import com.example.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    void registerUser(User user);

    User findUserById(Long id);
}
