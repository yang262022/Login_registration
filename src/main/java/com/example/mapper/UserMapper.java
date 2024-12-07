package com.example.mapper;

import com.example.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Insert("INSERT INTO users (username, password) VALUES (#{username}, #{password})")
    void registerUser(User user);

    @Select("SELECT * FROM users WHERE id = #{id}")
    User findUserById(Long id);
}
