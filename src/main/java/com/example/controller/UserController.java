package com.example.controller;

import com.example.model.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    // 注册功能
    @PostMapping("/register")
    public Map<String, String> register(@RequestBody User user) {
        userService.registerUser(user);
        Map<String, String> response = new HashMap<>();
        response.put("message", "Registration successful!");
        return response;
    }

    // 根据ID查询用户
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.findUserById(id);
    }
}
