package com.reservation_system.model;

public class researcher extends user {
    public researcher(int id, String name, String email, String password) {
        super(id, name, email, password);
    }

    @Override
    public String getUserType() {
        return "Researcher";
    }
}
