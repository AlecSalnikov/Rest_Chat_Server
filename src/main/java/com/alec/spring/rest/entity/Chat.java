package com.alec.spring.rest.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.Date;

//imp
//@Dataort javax.persistence.*;


@Entity
@Table(name="chat")
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

   @CreationTimestamp
    //@Column(name="data",nullable = false,updatable = false)
  // @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date data;
    @Column(name="message")
    private String message;

    @Column(name="userName")
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Chat() {

    }

    public Chat( Date data, String message, String userName) {
        this.userName=userName;
        this.data=data;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }





    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "id=" + id +

                ", data=" + data +
                ", message='" + message + '\'' +

                '}';
    }
}
