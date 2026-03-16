package com.reservation_system.services;

import com.reservation_system.model.user;
import com.reservation_system.patterns.factory.UserFactory;
import com.reservation_system.userRepository.UserRepository;

public class RegistrationService {
    private final UserRepository userRepository;

    public RegistrationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public user registerUser(String type, String name, String email, String password) {
        validateRegistrationInput(type, name, email, password);

        if (userRepository.emailExists(email)) {
            throw new IllegalArgumentException("Email is already registered.");
        }

        int newId = userRepository.getNextID();
        user user = UserFactory.createUser(type, newId, name, email, password);
        userRepository.addUser(user);

        return user;
    }

    private void validateRegistrationInput(String type, String name, String email, String password) {
        if (type == null || type.isBlank()) {
            throw new IllegalArgumentException("User type is required.");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name is required.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email is required.");
        }
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Email format is invalid.");
        }
        if (password == null || password.length() < 4) {
            throw new IllegalArgumentException("Password must be at least 4 characters.");
        }
    }
}
