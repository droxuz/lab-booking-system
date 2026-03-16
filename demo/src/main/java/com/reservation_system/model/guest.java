package com.reservation_system.model;

public class guest extends user {
    public guest(int id, String name, String email, String password) {
        super(id, name, email, password);
    }

    @Override
    public String getUserType() {
        return "Guest";
    }
}