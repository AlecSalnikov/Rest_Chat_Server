package com.alec.spring.rest.dao;

import com.alec.spring.rest.entity.Chat;

import java.util.List;

public interface ChatDAO {
    public List<Chat> getAllMessages();

    public void saveMessage(Chat chat);




}
