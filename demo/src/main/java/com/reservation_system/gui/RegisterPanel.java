package com.reservation_system.gui;

import com.reservation_system.services.RegistrationService;

import javax.swing.*;
import java.awt.*;

public class RegisterPanel extends JPanel {

    private final MainUI mainUI;
    private final RegistrationService registrationService;

    private final JTextField nameField;
    private final JTextField emailField;
    private final JPasswordField passwordField;
    private final JComboBox<String> typeComboBox;

    public RegisterPanel(MainUI mainUI, RegistrationService registrationService) {
        this.mainUI = mainUI;
        this.registrationService = registrationService;

        setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Register", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(titleLabel, BorderLayout.NORTH);

        JPanel formPanel = new JPanel(new GridLayout(5, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createEmptyBorder(30, 80, 30, 80));

        nameField = new JTextField();
        emailField = new JTextField();
        passwordField = new JPasswordField();

        typeComboBox = new JComboBox<>(new String[]{
                "student",
                "faculty",
                "researcher",
                "guest",
                "headlabcoordinator"
        });

        formPanel.add(new JLabel("Name:"));
        formPanel.add(nameField);

        formPanel.add(new JLabel("Email:"));
        formPanel.add(emailField);

        formPanel.add(new JLabel("Password:"));
        formPanel.add(passwordField);

        formPanel.add(new JLabel("User Type:"));
        formPanel.add(typeComboBox);

        JButton registerButton = new JButton("Register");
        JButton goToLoginButton = new JButton("Back to Login");

        formPanel.add(registerButton);
        formPanel.add(goToLoginButton);

        add(formPanel, BorderLayout.CENTER);

        registerButton.addActionListener(e -> handleRegister());
        goToLoginButton.addActionListener(e -> mainUI.showScreen("login"));
    }

    private void handleRegister() {
        try {
            String name = nameField.getText().trim();
            String email = emailField.getText().trim();
            String password = new String(passwordField.getPassword());
            String type = (String) typeComboBox.getSelectedItem();

            registrationService.registerUser(type, name, email, password);

            JOptionPane.showMessageDialog(
                    this,
                    "Registration successful. You can now log in.",
                    "Success",
                    JOptionPane.INFORMATION_MESSAGE
            );

            clearFields();
            mainUI.showScreen("login");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    this,
                    ex.getMessage(),
                    "Registration Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    private void clearFields() {
        nameField.setText("");
        emailField.setText("");
        passwordField.setText("");
        typeComboBox.setSelectedIndex(0);
    }
}
