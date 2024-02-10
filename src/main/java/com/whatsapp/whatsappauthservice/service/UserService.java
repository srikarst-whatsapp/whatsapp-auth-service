package com.whatsapp.whatsappauthservice.service;

import java.util.List;

import com.whatsapp.whatsappauthservice.entity.User;

public interface UserService {
    User saveUser(User user);

    User getUser(Long id);

    List<User> getUsers();
}
