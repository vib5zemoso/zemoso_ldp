package com.example.mapping.mappingdemo.controller;

import com.example.mapping.mappingdemo.dto.UserDto;
import com.example.mapping.mappingdemo.entity.User;
import com.example.mapping.mappingdemo.service.UserService;
import com.example.mapping.mappingdemo.utils.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public UserDto registerUser(@RequestBody UserDto userDto){
        try {
            UserDto user = userService.addUser(userDto);
            return user;
        } catch (Exception e) {
            throw e;
        }

    }

}
