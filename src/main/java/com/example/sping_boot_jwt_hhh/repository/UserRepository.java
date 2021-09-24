package com.example.sping_boot_jwt_hhh.repository;

import com.example.sping_boot_jwt_hhh.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
