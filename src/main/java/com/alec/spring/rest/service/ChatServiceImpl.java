package com.alec.spring.rest.service;

import com.alec.spring.rest.dao.ChatDAO;

import com.alec.spring.rest.entity.Chat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ChatServiceImpl implements ChatService{
    @Autowired
    private ChatDAO chatDAO;

    @Override
    @Transactional
    public List<Chat> getAllMessages(){
return chatDAO.getAllMessages();

    }

    @Override
    @Transactional
    public void saveMessage(Chat chat) {
        chatDAO.saveMessage(chat);
    }

    //@Override
    //@Transactional
    //public Employee getEmployee(int id) {
      // return employeeDAO.getEmployee(id);
   }

  //  @Override
  //  @Transactional
  //  public void deleteEmployee(int id) {
  //      employeeDAO.deleteEmployee(id);

  //  }



