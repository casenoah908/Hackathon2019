package com.example.hackathon2019;

public class Thread {

    private String title;
    private String type;
    private String dateTime;
    private UserAccount user;

    public Thread(String title, String type, String dateTime, UserAccount user){
        this.title = title;
        this.type = type;
        this.dateTime = dateTime;
        this.user = user;
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

}
