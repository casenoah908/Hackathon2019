package com.example.hackathon2019;

import java.io.Serializable;

public class Thread implements Serializable {

    private String title;
    private String type;
    private String dateTime;
    private UserAccount user;
    private String description;

    public Thread(String title, String type, String dateTime, UserAccount user, String description){
        this.title = title;
        this.type = type;
        this.dateTime = dateTime;
        this.user = user;
        this.description = description;
    }

    public String getTitle(){
        return title;
    }
    public String getType(){
        return type;
    }
    public String getDateTime(){
        return dateTime;
    }
    public String getUserName(){
        return user.getUsername();
    }
    public int getUserDays(){
        return user.getDays();
    }
    public String getDescription(){
        return description;
    }

}
