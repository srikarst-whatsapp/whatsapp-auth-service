package com.whatsapp.whatsappauthservice.service;

import java.util.Optional;

import com.whatsapp.whatsappauthservice.entity.User;

public interface UserService {
    Optional<User> getUser(String phone);

    User getUnwrappedUser(String phone);

    User saveUser(User user);
}