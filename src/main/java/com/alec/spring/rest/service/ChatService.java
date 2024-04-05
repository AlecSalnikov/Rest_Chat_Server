package com.alec.spring.rest.service;
import com.alec.spring.rest.entity.Chat;


import java.util.List;
public interface ChatService {
    public List<Chat> getAllMessages();

    public void saveMessage(Chat Chat);




}
