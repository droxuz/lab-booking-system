package com.reservation_system.model;

public class Researcher extends User {
    public Researcher(int id, String name, String email, String password, boolean approved) {
        super(id, name, email, password, approved);
    }

    @Override
    public String getUserType() {
        return "Researcher";
    }
}
