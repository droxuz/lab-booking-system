package com.reservation_system.model;

public class faculty extends user {
    public faculty(int id, String name, String email, String password) {
        super(id, name, email, password);
    }

    @Override
    public String getUserType() {
        return "Faculty";
    }
}