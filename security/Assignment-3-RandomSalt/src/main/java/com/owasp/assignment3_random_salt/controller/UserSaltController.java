package com.owasp.assignment3_random_salt.controller;

import com.owasp.assignment3_random_salt.Dto.UserSaltDto;
import com.owasp.assignment3_random_salt.service.UserSaltService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserSaltController {
    @Autowired
    private UserSaltService userService;

    @PostMapping("/register")
    public void registerUser(@RequestBody UserSaltDto userDTO) {
        userService.registerUser(userDTO);
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody UserSaltDto userDTO) {
        if (userService.isPasswordValid(userDTO.getUsername(), userDTO.getPassword())) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login failed");
        }
    }
}
