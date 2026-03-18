package com.reservation_system.patterns.factory;

import com.reservation_system.model.*;

public class UserFactory {

    public static User createUser(
        String type,
        int id,
        String name,
        String email,
        String password,
        boolean approved) {

    if (type == null) {
        throw new IllegalArgumentException("User type cannot be null.");
    }

    switch (type.trim().toLowerCase()) {
        case "student":
            return new Student(id, name, email, password, approved);
        case "faculty":
            return new Faculty(id, name, email, password, approved);
        case "researcher":
            return new Researcher(id, name, email, password, approved);
        case "guest":
            return new Guest(id, name, email, password, approved);
        case "headlabcoordinator":
            return new HeadLabCoordinator(id, name, email, password, approved);
        case "labmanager":
            return new LabManager(id, name, email, password, approved);
        default:
            throw new IllegalArgumentException("Invalid user type: " + type);
    }
}
}
