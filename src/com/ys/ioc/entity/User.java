package com.ys.ioc.entity;

public class User {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*public User(String name) {
        this.name = name;
    }*/

    public void addUser(){
        System.out.println("addMethod......");
    }
}
