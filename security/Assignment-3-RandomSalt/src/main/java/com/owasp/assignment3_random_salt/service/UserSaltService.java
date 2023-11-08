package com.owasp.assignment3_random_salt.service;

import com.owasp.assignment3_random_salt.Dto.UserSaltDto;
import com.owasp.assignment3_random_salt.entity.UserSalt;
import com.owasp.assignment3_random_salt.repository.UserSaltRepository;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSaltService {
    @Autowired
    private UserSaltRepository userRepository;

    public void registerUser(UserSaltDto userDTO) {
        String salt = BCrypt.gensalt();
        String passwordHash = BCrypt.hashpw(userDTO.getPassword(), salt);

        UserSalt user = new UserSalt();
        user.setUsername(userDTO.getUsername());
        user.setPasswordHash(passwordHash);
        user.setSalt(salt);

        userRepository.save(user);
    }

    public boolean isPasswordValid(String username, String password) {
        UserSalt user = userRepository.findByUsername(username);
        if (user == null) {
            return false;
        }
        return BCrypt.checkpw(password, user.getPasswordHash());
    }
}
