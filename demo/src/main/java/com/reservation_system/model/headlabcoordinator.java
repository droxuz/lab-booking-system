package com.reservation_system.model;

public class headlabcoordinator extends user {
    public headlabcoordinator(int id, String name, String email, String password) {
        super(id, name, email, password);
    }

    @Override
    public String getUserType() {
        return "headlabcoordinator";
    }
}