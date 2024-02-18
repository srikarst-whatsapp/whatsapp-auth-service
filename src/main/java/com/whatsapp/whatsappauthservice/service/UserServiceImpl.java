package com.whatsapp.whatsappauthservice.service;

import java.util.Optional;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.whatsapp.whatsappauthservice.entity.User;
import com.whatsapp.whatsappauthservice.exception.UserAlreadyExistsException;
import com.whatsapp.whatsappauthservice.exception.UserNotFoundException;
import com.whatsapp.whatsappauthservice.repository.UserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public Optional<User> getUser(String phone) {
        return userRepository.findByPhone(phone);
    }

    @Override
    public User getUnwrappedUser(String phone) {
        return unwrapUser(getUser(phone), phone);
    }

    @Override
    public User saveUser(User user) {
        if (getUser(user.getPhone()).isPresent())
            throw new UserAlreadyExistsException(user.getPhone());
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    static User unwrapUser(Optional<User> entity, String phone) {
        if (entity.isPresent())
            return entity.get();
        else
            throw new UserNotFoundException(phone);
    }

}
