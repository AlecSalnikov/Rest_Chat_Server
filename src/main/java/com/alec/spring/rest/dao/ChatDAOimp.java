package com.alec.spring.rest.dao;

import com.alec.spring.rest.entity.Chat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public class ChatDAOimp implements ChatDAO{

    @Autowired
    private SessionFactory sessionFactory;
    @Override

    public List <Chat> getAllMessages() {

        Session session = sessionFactory.getCurrentSession();
        Query <Chat> query = session.createQuery("from Chat",Chat.class);
        List<Chat> allMessages = query.getResultList();
        return allMessages;
    }

    @Override
    public void saveMessage(Chat chat) {
Session session =sessionFactory.getCurrentSession();
session.saveOrUpdate(chat);


    }

  //  @Override
  //  public Employee getEmployee(int id) {
      //  Session session = sessionFactory.getCurrentSession();

      //  Employee employee = session.get(Employee.class,id);
     //   return  employee;
  //  }

  //  @Override
////    public void deleteEmployee(int id) {
 //       Session session = sessionFactory.getCurrentSession();
  //      Query<Employee> query= session.createQuery("delete from Employee "+
  //              "where id =:employeeId");
   //     query.setParameter("employeeId",id);
   //     query.executeUpdate();
  //  }
}
