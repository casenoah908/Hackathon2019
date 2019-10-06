package com.example.hackathon2019;

import java.io.Serializable;

public class UserAccount implements Serializable {

    private String username;
    private String password;
    private String goal;
    private int days;

    public UserAccount(String username, String password, String goal, int days){
        this.goal=goal;
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
    public String getGoal(){
        return goal;
    }
    public int getDays(){
        return days;
    }


}
