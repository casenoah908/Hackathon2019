package com.example.hackathon2019;

import java.io.Serializable;

public class UserAccount implements Serializable {

    private String username;
    private String password;
    private int days;

    public UserAccount(String username, String password, int days){
        this.username=username;
        this.password=password;
        this.days = days;
    }

    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public int getDays(){
        return days;
    }
}
