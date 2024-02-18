package com.whatsapp.whatsappauthservice.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.whatsapp.whatsappauthservice.entity.User;

public interface UserRepository extends CrudRepository<User, String> {
    Optional<User> findByPhone(String phone);

    boolean existsByPhone(String phone);
}