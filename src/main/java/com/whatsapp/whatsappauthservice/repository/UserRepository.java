package com.whatsapp.whatsappauthservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.whatsapp.whatsappauthservice.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
}