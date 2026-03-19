package com.reservation_system.gui;

import com.reservation_system.model.User;
import com.reservation_system.services.CoordinatorAccountService;

import javax.swing.*;
import java.awt.*;

public class GenerateLabManagerPanel extends JPanel {

    private final MainUI mainUI;
    private final CoordinatorAccountService coordinatorAccountService;

    private User currentUser;

    private final JTextField nameField;
    private final JTextField emailField;
    private final JPasswordField passwordField;

    public GenerateLabManagerPanel(MainUI mainUI, CoordinatorAccountService coordinatorAccountService) {
        this.mainUI = mainUI;
        this.coordinatorAccountService = coordinatorAccountService;

        setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Generate Lab Manager Account", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 22));
        add(titleLabel, BorderLayout.NORTH);

        JPanel formPanel = new JPanel(new GridLayout(4, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createEmptyBorder(30, 80, 30, 80));

        nameField = new JTextField();
        emailField = new JTextField();
        passwordField = new JPasswordField();

        JButton createButton = new JButton("Create Lab Manager");
        JButton backButton = new JButton("Back");

        formPanel.add(new JLabel("Name:"));
        formPanel.add(nameField);

        formPanel.add(new JLabel("Email:"));
        formPanel.add(emailField);

        formPanel.add(new JLabel("Password:"));
        formPanel.add(passwordField);

        formPanel.add(createButton);
        formPanel.add(backButton);

        add(formPanel, BorderLayout.CENTER);

        createButton.addActionListener(e -> handleCreateLabManager());
        backButton.addActionListener(e -> mainUI.showDashboard(currentUser));
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    private void handleCreateLabManager() {
        try {
            String name = nameField.getText().trim();
            String email = emailField.getText().trim();
            String password = new String(passwordField.getPassword());

            coordinatorAccountService.autoGenerateLabManagerAccount(
                    currentUser,
                    name,
                    email,
                    password
            );

            JOptionPane.showMessageDialog(
                    this,
                    "Lab manager account created successfully.",
                    "Success",
                    JOptionPane.INFORMATION_MESSAGE
            );

            clearFields();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    this,
                    ex.getMessage(),
                    "Creation Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    private void clearFields() {
        nameField.setText("");
        emailField.setText("");
        passwordField.setText("");
    }
}
