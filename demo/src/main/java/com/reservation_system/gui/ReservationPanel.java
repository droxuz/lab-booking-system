package com.reservation_system.gui;

import com.reservation_system.Equipment.Equipment;
import com.reservation_system.Equipment.EquipmentStatus;
import com.reservation_system.model.Reservation;
import com.reservation_system.model.User;
import com.reservation_system.patterns.observer.EquipmentObserver;
import com.reservation_system.patterns.strategy.CreditCardPayment;
import com.reservation_system.patterns.strategy.DebitCardPayment;
import com.reservation_system.patterns.strategy.InstitutionalPayment;
import com.reservation_system.patterns.strategy.PaymentStrategy;
import com.reservation_system.services.ReservationService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;
import java.util.stream.Collectors;

public class ReservationPanel extends JPanel implements EquipmentObserver {

    private final MainUI mainUI;
    private final ReservationService reservationService;
    private User currentUser;
    private List<Equipment> currentEquipmentList;

    private final DefaultTableModel equipmentModel;
    private final JTable equipmentTable;

    private final DefaultTableModel reservationModel;
    private final JTable reservationTable;

    private final JSpinner hoursSpinner;
    private final JComboBox<String> paymentBox;

    public ReservationPanel(MainUI mainUI, ReservationService reservationService) {
        this.mainUI             = mainUI;
        this.reservationService = reservationService;

        setLayout(new BorderLayout(8, 8));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel title = new JLabel("Book Equipment", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 22));
        add(title, BorderLayout.NORTH);

        JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        split.setDividerLocation(480);

        equipmentModel = new DefaultTableModel(
                new String[]{"Description", "Type", "Location", "Status"}, 0) {
            @Override public boolean isCellEditable(int r, int c) { return false; }
        };
        equipmentTable = new JTable(equipmentModel);
        equipmentTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane eqScroll = new JScrollPane(equipmentTable);
        eqScroll.setBorder(BorderFactory.createTitledBorder("Available Equipment"));
        split.setLeftComponent(eqScroll);

        JPanel form = new JPanel(new GridLayout(6, 2, 10, 10));
        form.setBorder(BorderFactory.createTitledBorder("New Booking"));

        hoursSpinner = new JSpinner(new SpinnerNumberModel(1, 1, 12, 1));
        paymentBox   = new JComboBox<>(new String[]{
                "Credit Card", "Debit Card", "Institutional Account"
        });

        JButton bookBtn        = new JButton("Book & Pay Deposit");
        JButton cancelBtn      = new JButton("Cancel Booking");
        JButton payBalanceBtn  = new JButton("Pay Balance");
        JButton backBtn        = new JButton("Back to Dashboard");

        form.add(new JLabel("Hours:"));
        form.add(hoursSpinner);
        form.add(new JLabel("Payment Method:"));
        form.add(paymentBox);
        form.add(bookBtn);
        form.add(cancelBtn);
        form.add(payBalanceBtn);
        form.add(backBtn);
        form.add(new JLabel("<html><i>Rates: Student $10 · Faculty $15<br>Researcher $20 · Guest $30 /hr</i></html>"));
        form.add(new JLabel(""));

        split.setRightComponent(form);
        add(split, BorderLayout.CENTER);

        reservationModel = new DefaultTableModel(
                new String[]{"ID", "Equipment", "Location", "Hours", "Deposit", "Total", "Status"}, 0) {
            @Override public boolean isCellEditable(int r, int c) { return false; }
        };
        reservationTable = new JTable(reservationModel);
        reservationTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane resScroll = new JScrollPane(reservationTable);
        resScroll.setBorder(BorderFactory.createTitledBorder("My Reservations"));
        resScroll.setPreferredSize(new Dimension(0, 160));
        add(resScroll, BorderLayout.SOUTH);

        bookBtn      .addActionListener(e -> handleBook());
        cancelBtn    .addActionListener(e -> handleCancel());
        payBalanceBtn.addActionListener(e -> handlePayBalance());
        backBtn      .addActionListener(e -> mainUI.showDashboard(currentUser));
    }

    public void setCurrentUser(User user) {
        this.currentUser = user;
        refreshReservations();
    }

    @Override
    public void onEquipmentListChanged(List<Equipment> allEquipment) {
        this.currentEquipmentList = allEquipment;
        refreshEquipmentTable();
    }

    private void handleBook() {
        int row = equipmentTable.getSelectedRow();
        if (row < 0) { error("Select a piece of equipment first."); return; }

        List<Equipment> available = getAvailableEquipment();
        if (row >= available.size()) return;
        Equipment eq = available.get(row);
        int hours    = (int) hoursSpinner.getValue();
        PaymentStrategy strategy = buildStrategy();
        double rate    = reservationService.getHourlyRate(currentUser);
        double deposit = rate;

        JTextField certField = new JTextField();
        String certLabel = getCertLabel();

        JPanel dialogPanel = new JPanel(new GridLayout(3, 2, 8, 8));
        dialogPanel.add(new JLabel(certLabel + ":"));
        dialogPanel.add(certField);
        dialogPanel.add(new JLabel("Deposit due now:"));
        dialogPanel.add(new JLabel(String.format("$%.2f (1 hour)", deposit)));
        dialogPanel.add(new JLabel("Total cost:"));
        dialogPanel.add(new JLabel(String.format("$%.2f (%d hours)", rate * hours, hours)));

        int result = JOptionPane.showConfirmDialog(this, dialogPanel,
                "Confirm Booking — " + eq.getDescription(),
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (result != JOptionPane.OK_OPTION) return;

        String certId = certField.getText().trim();

        try {
            Reservation r = reservationService.book(currentUser, eq, hours, certId, strategy);
            JOptionPane.showMessageDialog(this,
                    String.format("Booked! Deposit of $%.2f charged via %s.%nPay the balance when you arrive.",
                            r.getDeposit(), r.getPaymentStrategy().getMethodName()),
                    "Booking Confirmed", JOptionPane.INFORMATION_MESSAGE);
            refreshEquipmentTable();
            refreshReservations();
        } catch (Exception ex) { error(ex.getMessage()); }
    }

    private void handleCancel() {
        Reservation r = selectedReservation();
        if (r == null) return;
        try {
            reservationService.cancel(r);
            refreshEquipmentTable();
            refreshReservations();
        } catch (Exception ex) { error(ex.getMessage()); }
    }

    private void handlePayBalance() {
        Reservation r = selectedReservation();
        if (r == null) return;
        try {
            double balance = r.getTotalCost() - r.getDeposit();
            reservationService.payBalance(r);
            JOptionPane.showMessageDialog(this,
                    String.format("Balance of $%.2f paid via %s. Reservation is now ACTIVE.",
                            balance, r.getPaymentStrategy().getMethodName()),
                    "Payment Successful", JOptionPane.INFORMATION_MESSAGE);
            refreshEquipmentTable();
            refreshReservations();
        } catch (Exception ex) { error(ex.getMessage()); }
    }

    private String getCertLabel() {
        switch (currentUser.getUserType().toLowerCase()) {
            case "student":    return "Student ID";
            case "faculty":    return "Staff ID";
            case "researcher": return "Researcher ID";
            default:           return "Certification Number";
        }
    }

    private PaymentStrategy buildStrategy() {
        switch ((String) paymentBox.getSelectedItem()) {
            case "Debit Card":            return new DebitCardPayment();
            case "Institutional Account": return new InstitutionalPayment();
            default:                      return new CreditCardPayment();
        }
    }

    private List<Equipment> getAvailableEquipment() {
        if (currentEquipmentList == null) return List.of();
        return currentEquipmentList.stream()
                .filter(e -> e.getEquipmentStatus() == EquipmentStatus.AVAILABLE)
                .collect(Collectors.toList());
    }

    private void refreshEquipmentTable() {
        equipmentModel.setRowCount(0);
        for (Equipment eq : getAvailableEquipment()) {
            equipmentModel.addRow(new Object[]{
                    eq.getDescription(), eq.getEquipmentType(),
                    eq.getLabLocation(), eq.getEquipmentStatus()
            });
        }
    }

    private void refreshReservations() {
        reservationModel.setRowCount(0);
        if (currentUser == null) return;
        for (Reservation r : reservationService.getForUser(currentUser)) {
            reservationModel.addRow(new Object[]{
                    r.getId().toString().substring(0, 6).toUpperCase(),
                    r.getEquipment().getDescription(),
                    r.getEquipment().getLabLocation(),
                    r.getHours() + "h",
                    String.format("$%.0f paid", r.getDeposit()),
                    String.format("$%.0f total", r.getTotalCost()),
                    r.getStatus()
            });
        }
    }

    private Reservation selectedReservation() {
        int row = reservationTable.getSelectedRow();
        if (row < 0) { error("Select a reservation first."); return null; }
        List<Reservation> mine = reservationService.getForUser(currentUser);
        if (row >= mine.size()) return null;
        return mine.get(row);
    }

    private void error(String msg) {
        JOptionPane.showMessageDialog(this, msg, "Error", JOptionPane.ERROR_MESSAGE);
    }
}