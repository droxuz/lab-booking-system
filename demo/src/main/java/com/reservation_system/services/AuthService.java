package com.reservation_system.services;

import com.reservation_system.model.User;
import com.reservation_system.repository.UserRepository;

public class AuthService {
    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User login(String email, String password) {
        User user = userRepository.findByEmail(email).orElseThrow(() -> new IllegalArgumentException("No user found with that email."));

        if (!user.getPassword().equals(password)) {
            throw new IllegalArgumentException("Incorrect password.");
        }

        return user;
    }
}
