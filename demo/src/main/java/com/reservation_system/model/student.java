package com.reservation_system.model;

public class student extends user {
    public student(int id, String name, String email, String password){
        super(id,name,email,password);
    }

    @Override
    public String getUserType() {
        return "Student";
    }
}
