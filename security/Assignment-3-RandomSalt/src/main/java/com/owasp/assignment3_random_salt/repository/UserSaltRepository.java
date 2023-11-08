package com.owasp.assignment3_random_salt.repository;

import com.owasp.assignment3_random_salt.entity.UserSalt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSaltRepository extends JpaRepository<UserSalt, Integer> {
    UserSalt findByUsername(String username);
}
