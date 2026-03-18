package com.reservation_system.model;

public class Faculty extends User {
    public Faculty(int id, String name, String email, String password, boolean approved) {
        super(id, name, email, password, approved);
    }

    @Override
    public String getUserType() {
        return "Faculty";
    }
}