package com.example.mapping.mappingdemo.service;

import com.example.mapping.mappingdemo.dto.UserDto;
import com.example.mapping.mappingdemo.entity.User;
import com.example.mapping.mappingdemo.repository.UserRepository;
import com.example.mapping.mappingdemo.utils.Converter;
import org.springframework.security.crypto.password.MessageDigestPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    private PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository,PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserDto addUser(UserDto userDto) {
        try {
            User user = Converter.convertToEntity(userDto, User.class);
            String encodedPassword = this.passwordEncoder.encode(user.getPassword());
            user.setPassword(encodedPassword);
            User savedUser = this.userRepository.save(user);
            UserDto savedUserDto = Converter.convertToDTO(savedUser, UserDto.class);
            return savedUserDto;
        } catch (Exception e) {
            throw e;
        }
    }
}
