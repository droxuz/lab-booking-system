package com.reservation_system.gui;

import com.reservation_system.model.User;

import javax.swing.*;
import java.awt.*;

public class DashboardPanel extends JPanel {

    private final MainUI mainUI;
    private User currentUser;

    private final JLabel welcomeLabel;
    private final JLabel roleLabel;
    private final JTextArea infoArea;
    private final JButton logoutButton;
    private final JButton generateLabManagerButton;
    private final JButton manageEquipmentButton;
    private final JButton makeReservationButton;

    public DashboardPanel(MainUI mainUI) {
        this.mainUI = mainUI;

        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new GridLayout(2, 1));
        welcomeLabel = new JLabel("Welcome", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 22));
        roleLabel = new JLabel("Role", SwingConstants.CENTER);
        roleLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        topPanel.add(welcomeLabel);
        topPanel.add(roleLabel);

        infoArea = new JTextArea();
        infoArea.setEditable(false);
        infoArea.setLineWrap(true);
        infoArea.setWrapStyleWord(true);
        infoArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        infoArea.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JPanel bottomPanel = new JPanel(new FlowLayout());

        generateLabManagerButton = new JButton("Generate Lab Manager Account");
        generateLabManagerButton.setVisible(false);
        generateLabManagerButton.addActionListener(e -> {
            if (currentUser != null) mainUI.showGenerateLabManagerPanel(currentUser);
        });

        manageEquipmentButton = new JButton("Manage Equipment");
        manageEquipmentButton.setVisible(false);
        manageEquipmentButton.addActionListener(e -> {
            if (currentUser != null) mainUI.showLabManagerPanel(currentUser);
        });

        makeReservationButton = new JButton("Make Reservation");
        makeReservationButton.setVisible(false);
        makeReservationButton.addActionListener(e -> {
            if (currentUser != null) mainUI.showReservationPanel(currentUser);
        });

        logoutButton = new JButton("Logout");
        logoutButton.addActionListener(e -> mainUI.showScreen("login"));

        bottomPanel.add(generateLabManagerButton);
        bottomPanel.add(manageEquipmentButton);
        bottomPanel.add(makeReservationButton);
        bottomPanel.add(logoutButton);

        add(topPanel, BorderLayout.NORTH);
        add(new JScrollPane(infoArea), BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
    }

    public void setUser(User user) {
        this.currentUser = user;

        welcomeLabel.setText("Welcome, " + user.getName());
        roleLabel.setText("Role: " + user.getUserType());

        String type = user.getUserType().toLowerCase();
        StringBuilder message = new StringBuilder();

        message.append("Account Details\n");
        message.append("-----------------------------\n");
        message.append("ID: ").append(user.getID()).append("\n");
        message.append("Email: ").append(user.getEmail()).append("\n");
        message.append("Approved: ").append(user.isApproved()).append("\n\n");

        generateLabManagerButton.setVisible(false);
        manageEquipmentButton.setVisible(false);
        makeReservationButton.setVisible(false);

        switch (type) {
            case "student":
            case "faculty":
            case "researcher":
            case "guest":
                message.append("Available actions:\n");
                message.append("- Reserve available equipment\n");
                message.append("- Modify or cancel bookings before start\n");
                message.append("- Extend reservation if equipment remains free\n");
                makeReservationButton.setVisible(true);
                break;

            case "labmanager":
                message.append("Available actions:\n");
                message.append("- Add equipment\n");
                message.append("- Enable equipment\n");
                message.append("- Disable equipment\n");
                message.append("- Mark equipment for maintenance\n");
                manageEquipmentButton.setVisible(true);
                break;

            case "headlabcoordinator":
                message.append("Available actions:\n");
                message.append("- Generate lab manager accounts\n");
                message.append("- Access coordinator-level account management\n");
                generateLabManagerButton.setVisible(true);
                break;

            default:
                message.append("No role-specific actions defined.");
                break;
        }

        infoArea.setText(message.toString());
    }
}