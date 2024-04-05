package com.alec.spring.rest.controller;

import com.alec.spring.rest.entity.Chat;

import com.alec.spring.rest.exeptionHeadling.NoSuchEmployeeException;
import com.alec.spring.rest.service.ChatService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class MyRESTController {
    @Autowired
    private ChatService chatService;

    @GetMapping("/messages")
    public List<Chat> showAllMessages() {

        List<Chat> allMessages = chatService.getAllMessages();

        return allMessages;
    }





@PostMapping("/messages")
public  Chat addNewMessage(@RequestBody Chat chat){


    chatService.saveMessage(chat);



        return chat;
}





    }







