package com.reservation_system.gui;

import com.reservation_system.model.User;
import com.reservation_system.services.AuthService;

import javax.swing.*;
import java.awt.*;

public class LoginPanel extends JPanel {

    private final MainUI mainUI;
    private final AuthService authenticationService;

    private final JTextField emailField;
    private final JPasswordField passwordField;

    public LoginPanel(MainUI mainUI, AuthService authenticationService) {
        this.mainUI = mainUI;
        this.authenticationService = authenticationService;

        setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Login", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(titleLabel, BorderLayout.NORTH);

        JPanel formPanel = new JPanel(new GridLayout(4, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createEmptyBorder(40, 80, 40, 80));

        emailField = new JTextField();
        passwordField = new JPasswordField();

        JButton loginButton = new JButton("Login");
        JButton goToRegisterButton = new JButton("Go to Register");

        formPanel.add(new JLabel("Email:"));
        formPanel.add(emailField);

        formPanel.add(new JLabel("Password:"));
        formPanel.add(passwordField);

        formPanel.add(loginButton);
        formPanel.add(goToRegisterButton);

        add(formPanel, BorderLayout.CENTER);

        loginButton.addActionListener(e -> handleLogin());
        goToRegisterButton.addActionListener(e -> mainUI.showScreen("register"));
    }

    private void handleLogin() {
        try {
            String email = emailField.getText().trim();
            String password = new String(passwordField.getPassword());

            User user = authenticationService.login(email, password);

            clearFields();
            mainUI.showDashboard(user);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    this,
                    ex.getMessage(),
                    "Login Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    private void clearFields() {
        emailField.setText("");
        passwordField.setText("");
    }
}
