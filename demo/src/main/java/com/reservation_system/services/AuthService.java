package com.reservation_system.services;

import com.reservation_system.model.user;
import com.reservation_system.userRepository.UserRepository;

public class AuthService {
    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public user login(String email, String password) {
        user user = userRepository.findByEmail(email).orElseThrow(() -> new IllegalArgumentException("No user found with that email."));

        if (!user.getPassword().equals(password)) {
            throw new IllegalArgumentException("Incorrect password.");
        }

        return user;
    }
}
