package com.anderson.aprender.springboot.webapp.springboot.models.dto;

import com.anderson.aprender.springboot.webapp.springboot.models.User;

public class UserDTO {
    private String  title;
    public User user;
    
    public UserDTO(String title, User user) {
        this.title = title;
        this.user = user;
    }
    
    public UserDTO() {
        // Empty constructor
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public User getUser() {
        return user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }

}
