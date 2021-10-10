package com.example.project.domain;

import javax.persistence.*;

@Entity
public class Message {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    private String name;
    @Column(name = "password")
    private String password;
    @Column(name = "token")
    private String token;

    public Message() {
    }

    public Message(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public Message(String name, String password, String token) {
        this.name = name;
        this.password = password;
        this.token = token;
    }

    public Message(String token) {
        this.token = token;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }


}
