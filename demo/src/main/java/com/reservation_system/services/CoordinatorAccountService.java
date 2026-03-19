package com.reservation_system.services;

import com.reservation_system.model.HeadLabCoordinator;
import com.reservation_system.model.User;
import com.reservation_system.repository.UserRepository;
import com.reservation_system.patterns.factory.UserFactory;

public class CoordinatorAccountService {
    private final UserRepository userRepository;
    public CoordinatorAccountService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public User createHeadLabCoordinator(String name, String email, String password) {
        validateBasicFields(name, email, password);

        if (userRepository.headLabCoordinatorExists()) {
            throw new IllegalStateException("Only one head lab coordinator account is allowed.");
        }

        if (userRepository.emailExists(email)) {
            throw new IllegalArgumentException("Email is already registered.");
        }

        int id = userRepository.getNextID();

        User coordinator = UserFactory.createUser(
                "headlabcoordinator",
                id,
                name,
                email,
                password,
                true
        );

        userRepository.addUser(coordinator);
        return coordinator;
    }
    
    public User autoGenerateLabManagerAccount(User currentUser, String name, String email, String password) {
        validateBasicFields(name, email, password);

        if (!(currentUser instanceof HeadLabCoordinator)) {
            throw new IllegalArgumentException("Only the head lab coordinator can generate lab manager accounts.");
        }

        if (!currentUser.isApproved()) {
            throw new IllegalStateException("Head lab coordinator account is not approved.");
        }

        if (userRepository.emailExists(email)) {
            throw new IllegalArgumentException("Email is already registered.");
        }

        int id = userRepository.getNextID();

        User labManager = UserFactory.createUser(
                "labmanager",
                id,
                name,
                email,
                password,
                true
        );

        userRepository.addUser(labManager);
        return labManager;
    }

    private void validateBasicFields(String name, String email, String password) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name is required.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email is required.");
        }
        if (password == null || password.isBlank()) {
            throw new IllegalArgumentException("Password is required.");
        }
    }
}
