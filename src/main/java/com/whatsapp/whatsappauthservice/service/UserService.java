package com.whatsapp.whatsappauthservice.service;

import com.whatsapp.whatsappauthservice.entity.User;

public interface UserService {
    User getUser(Long id);

    User getUser(String username);

    User saveUser(User user);
}