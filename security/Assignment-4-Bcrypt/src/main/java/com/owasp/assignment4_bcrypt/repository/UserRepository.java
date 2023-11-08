package com.owasp.assignment4_bcrypt.repository;

import com.owasp.assignment4_bcrypt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
