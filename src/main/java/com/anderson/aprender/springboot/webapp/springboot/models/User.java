package com.anderson.aprender.springboot.webapp.springboot.models;

public class User {

    private String name;
    private String lastname;

    public User() {
        // Empty constructor
    }

    public User(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

}