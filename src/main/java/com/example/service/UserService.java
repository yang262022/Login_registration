package com.example.service;

import com.example.mapper.UserMapper;
import com.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    // 用户注册
    public void registerUser(User user) {
        userMapper.registerUser(user);
    }

    // 根据ID查询用户
    public User findUserById(Long id) {
        return userMapper.findUserById(id);
    }
}
