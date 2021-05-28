package com.example.lab09_androidmobile_crud_api;

import java.io.Serializable;

public class Users implements Serializable {

    private String userName;
    private String userMail;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public Users() {

    }

    public Users(String userName, String userMail) {
        this.userName = userName;
        this.userMail = userMail;
    }
}
