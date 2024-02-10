package com.whatsapp.whatsappauthservice.service;

import java.util.List;
import java.util.Optional;

import com.whatsapp.whatsappauthservice.entity.Chat;
import com.whatsapp.whatsappauthservice.entity.Message;
import com.whatsapp.whatsappauthservice.entity.User;

public interface ChatService {
    Optional<Chat> getChat(Long senderId, Long receiverId);

    List<Message> getMessagesInChat(Long senderId, Long receiverId);

    Chat getUnwrappedChat(Long senderId, Long receiverId);

    Chat addMessageToChat(Optional<Chat> chat, User sender, User receiver, Message message);
}
