package com.whatsapp.whatsappauthservice.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.whatsapp.whatsappauthservice.entity.Chat;
import com.whatsapp.whatsappauthservice.entity.ChatId;

public interface ChatRepository extends CrudRepository<Chat, ChatId> {
    Optional<Chat> findBySenderIdAndReceiverIdOrReceiverIdAndSenderId(Long senderId, Long receiverId, Long receiverId2,
            Long senderId2);
}