package com.reservation_system.patterns.factory;

import com.reservation_system.model.*;

public class UserFactory {

    public static user createUser(String type, int id, String name, String email, String password) {
        if (type == null) {
            throw new IllegalArgumentException("User type cannot be null.");
        }

        switch (type.trim().toLowerCase()) {
            case "student":
                return new student(id, name, email, password);
            case "faculty":
                return new faculty(id, name, email, password);
            case "researcher":
                return new researcher(id, name, email, password);
            case "guest":
                return new guest(id, name, email, password);
            case "headlabcoordinator":
                return new headlabcoordinator(id, name, email, password);
            case "labmanager":
                return new labmanager(id, name, email, password);
            default:
                throw new IllegalArgumentException("Invalid user type: " + type);
        }
    }
}
