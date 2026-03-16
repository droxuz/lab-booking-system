package com.reservation_system.userRepository;

import com.reservation_system.model.user;
import com.reservation_system.patterns.factory.UserFactory;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {
    private final Path filePath;

    public UserRepository(String filePath) {
        this.filePath = Paths.get(filePath);
        ensureFileExists();
    }

    private void ensureFileExists() {
        try {
            if (Files.notExists(filePath.getParent())) {
                Files.createDirectories(filePath.getParent());
            }

            if (Files.notExists(filePath)) {
                Files.createFile(filePath);
                try (BufferedWriter writer = Files.newBufferedWriter(filePath)) {
                    writer.write("name,id,email,password,type");
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to initialize users.csv", e);
        }
    }

    public List<user> getAllUsers() {
        List<user> users = new ArrayList<>();

        try (BufferedReader reader = Files.newBufferedReader(filePath)) {
            String line = reader.readLine(); 

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");

                if (parts.length < 5) {
                    continue;
                }

                String name = parts[0].trim();
                int id = Integer.parseInt(parts[1].trim());
                String email = parts[2].trim();
                String password = parts[3].trim();
                String type = parts[4].trim();

                user user = UserFactory.createUser(type, id, name, email, password);
                users.add(user);
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to read users from CSV", e);
        }

        return users;
    }

    public void saveAllUsers(List<user> users) {
        try (BufferedWriter writer = Files.newBufferedWriter(filePath)) {
            writer.write("name,id,email,password,type");
            writer.newLine();

            for (user user : users) {
                writer.write(String.format("%s,%d,%s,%s,%s",
                        user.getName(),
                        user.getID(),
                        user.getEmail(),
                        user.getPassword(),
                        user.getUserType()
                ));
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to save users to CSV", e);
        }
    }

    public void addUser(user user) {
        List<user> users = getAllUsers();
        users.add(user);
        saveAllUsers(users);
    }

    public Optional<user> findByEmail(String email) {
        return getAllUsers().stream()
                .filter(user -> user.getEmail().equalsIgnoreCase(email))
                .findFirst();
    }

    public boolean emailExists(String email) {
        return findByEmail(email).isPresent();
    }

    public int getNextID() {
        return getAllUsers().stream()
                .mapToInt(user::getID)
                .max()
                .orElse(0) + 1;
    }
}
