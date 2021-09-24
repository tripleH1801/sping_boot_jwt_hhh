package com.example.sping_boot_jwt_hhh.service;

import com.example.sping_boot_jwt_hhh.authen.UserPrincipal;
import com.example.sping_boot_jwt_hhh.entity.User;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}
