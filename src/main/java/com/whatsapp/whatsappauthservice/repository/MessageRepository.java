package com.whatsapp.whatsappauthservice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.whatsapp.whatsappauthservice.entity.Message;

public interface MessageRepository extends CrudRepository<Message, Long> {
    List<Message> findBySenderIdAndReceiverId(Long senderId, Long receiverId);
}