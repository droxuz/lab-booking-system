package com.reservation_system.patterns.factory;

import com.reservation_system.model.student;
import com.reservation_system.model.faculty;
import com.reservation_system.model.researcher;
import com.reservation_system.model.guest;
import com.reservation_system.model.user;

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
            default:
                throw new IllegalArgumentException("Invalid user type: " + type);
        }
    }
}
