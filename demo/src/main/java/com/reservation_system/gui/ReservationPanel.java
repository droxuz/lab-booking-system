package com.reservation_system.gui;

import com.reservation_system.Equipment.Equipment;
import com.reservation_system.Equipment.EquipmentStatus;
import com.reservation_system.model.Reservation;
import com.reservation_system.model.User;
import com.reservation_system.patterns.observer.EquipmentObserver;
import com.reservation_system.patterns.observer.EquipmentRegistry;
import com.reservation_system.patterns.strategy.CreditCardPayment;
import com.reservation_system.patterns.strategy.DebitCardPayment;
import com.reservation_system.patterns.strategy.InstitutionalPayment;
import com.reservation_system.patterns.strategy.PaymentStrategy;
import com.reservation_system.services.ReservationService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

import com.reservation_system.patterns.strategy.GrantPayment;

public class ReservationPanel extends JPanel implements EquipmentObserver {

    private static final DateTimeFormatter DISPLAY_FMT =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    private final MainUI mainUI;
    private final ReservationService reservationService;
    private final EquipmentRegistry equipmentRegistry;
    private User currentUser;
    private List<Equipment> currentEquipmentList;

    private final DefaultTableModel equipmentModel;
    private final JTable equipmentTable;

    private final DefaultTableModel reservationModel;
    private final JTable reservationTable;

    private final JSpinner hoursSpinner;
    private final JComboBox<String> paymentBox;

    private final JSpinner dateSpinner;
    private final JSpinner hourOfDaySpinner;

    public ReservationPanel(MainUI mainUI, ReservationService reservationService,
                            EquipmentRegistry equipmentRegistry) {
        this.mainUI             = mainUI;
        this.reservationService = reservationService;
        this.equipmentRegistry  = equipmentRegistry;

        setLayout(new BorderLayout(8, 8));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel title = new JLabel("Book Equipment", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 22));
        add(title, BorderLayout.NORTH);

        JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        split.setDividerLocation(460);

        equipmentModel = new DefaultTableModel(
                new String[]{"Description", "Type", "Location", "Status"}, 0) {
            @Override public boolean isCellEditable(int r, int c) { return false; }
        };
        equipmentTable = new JTable(equipmentModel);
        equipmentTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane eqScroll = new JScrollPane(equipmentTable);
        eqScroll.setBorder(BorderFactory.createTitledBorder("Available Equipment"));
        split.setLeftComponent(eqScroll);

        JPanel form = new JPanel(new GridLayout(9, 2, 8, 8));
        form.setBorder(BorderFactory.createTitledBorder("Booking"));

        dateSpinner = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(dateSpinner, "yyyy-MM-dd");
        dateSpinner.setEditor(dateEditor);
        dateSpinner.setValue(java.util.Date.from(
                LocalDateTime.now().plusDays(1)
                        .withHour(9).withMinute(0).withSecond(0)
                        .atZone(java.time.ZoneId.systemDefault()).toInstant()));

        hourOfDaySpinner = new JSpinner(new SpinnerNumberModel(9, 0, 23, 1));

        hoursSpinner = new JSpinner(new SpinnerNumberModel(1, 1, 12, 1));
        paymentBox   = new JComboBox<>(new String[]{
                "Credit Card", "Debit Card", "Institutional Account", "Research Grant"
        });

        JButton bookBtn       = new JButton("Book & Pay Deposit");
        JButton modifyBtn     = new JButton("Modify Booking");
        JButton cancelBtn     = new JButton("Cancel Booking");
        JButton payBalanceBtn = new JButton("Pay Balance");
        JButton extendBtn     = new JButton("Extend Booking");
        JButton backBtn       = new JButton("Back to Dashboard");

        form.add(new JLabel("Date (yyyy-MM-dd):"));   form.add(dateSpinner);
        form.add(new JLabel("Start Hour (0-23):"));   form.add(hourOfDaySpinner);
        form.add(new JLabel("Duration (hours):"));    form.add(hoursSpinner);
        form.add(new JLabel("Payment Method:"));      form.add(paymentBox);
        form.add(bookBtn);                            form.add(modifyBtn);
        form.add(cancelBtn);                          form.add(payBalanceBtn);
        form.add(extendBtn);                          form.add(backBtn);
        form.add(new JLabel("<html><i>Rates: Student $10 · Faculty $15<br>"
                + "Researcher $20 · Guest $30 /hr</i></html>"));
        form.add(new JLabel(""));
        form.add(new JLabel(""));
        form.add(new JLabel(""));

        split.setRightComponent(form);
        add(split, BorderLayout.CENTER);

        reservationModel = new DefaultTableModel(
                new String[]{"ID", "Equipment", "Start", "End", "Hrs", "Deposit", "Total", "Status"}, 0) {
            @Override public boolean isCellEditable(int r, int c) { return false; }
        };
        reservationTable = new JTable(reservationModel);
        reservationTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane resScroll = new JScrollPane(reservationTable);
        resScroll.setBorder(BorderFactory.createTitledBorder("My Reservations"));
        resScroll.setPreferredSize(new Dimension(0, 170));
        add(resScroll, BorderLayout.SOUTH);

        bookBtn      .addActionListener(e -> handleBook());
        modifyBtn    .addActionListener(e -> handleModify());
        cancelBtn    .addActionListener(e -> handleCancel());
        payBalanceBtn.addActionListener(e -> handlePayBalance());
        extendBtn    .addActionListener(e -> handleExtend());
        backBtn      .addActionListener(e -> mainUI.showDashboard(currentUser));
    }

    public void setCurrentUser(User user) {
        this.currentUser = user;
        this.currentEquipmentList = equipmentRegistry.getAll();
        refreshEquipmentTable();
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
        Equipment eq      = available.get(row);
        int hours         = (int) hoursSpinner.getValue();
        LocalDateTime start = buildStartTime();
        if (start == null) return;
        PaymentStrategy strategy = buildStrategy();
        double rate    = reservationService.getHourlyRate(currentUser);
        double deposit = rate;

        JTextField certField = new JTextField();

        JPanel dialogPanel = new JPanel(new GridLayout(4, 2, 8, 8));
        dialogPanel.add(new JLabel(getCertLabel() + ":"));
        dialogPanel.add(certField);
        dialogPanel.add(new JLabel("Start time:"));
        dialogPanel.add(new JLabel(start.format(DISPLAY_FMT)));
        dialogPanel.add(new JLabel("Deposit due now:"));
        dialogPanel.add(new JLabel(String.format("$%.2f (1 hour)", deposit)));
        dialogPanel.add(new JLabel("Total cost:"));
        dialogPanel.add(new JLabel(String.format("$%.2f (%d hours)", rate * hours, hours)));

        int result = JOptionPane.showConfirmDialog(this, dialogPanel,
                "Confirm Booking — " + eq.getDescription(),
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result != JOptionPane.OK_OPTION) return;

        try {
            Reservation r = reservationService.book(currentUser, eq, start, hours,
                    certField.getText().trim(), strategy);
            JOptionPane.showMessageDialog(this,
                    String.format("Booked! Deposit of $%.2f charged via %s.",
                            r.getDeposit(), r.getPaymentStrategy().getMethodName()),
                    "Booking Confirmed", JOptionPane.INFORMATION_MESSAGE);
            refreshEquipmentTable();
            refreshReservations();
        } catch (Exception ex) { error(ex.getMessage()); }
    }

    private void handleModify() {
        Reservation r = selectedReservation();
        if (r == null) return;

        if (r.getStatus() != Reservation.Status.PENDING) {
            error("Only pending reservations can be modified.");
            return;
        }

        JSpinner newDateSpinner = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor de  = new JSpinner.DateEditor(newDateSpinner, "yyyy-MM-dd");
        newDateSpinner.setEditor(de);
        newDateSpinner.setValue(java.util.Date.from(
                r.getStartTime().atZone(java.time.ZoneId.systemDefault()).toInstant()));

        JSpinner newHourSpinner  = new JSpinner(new SpinnerNumberModel(r.getStartTime().getHour(), 0, 23, 1));
        JSpinner newHoursSpinner = new JSpinner(new SpinnerNumberModel(r.getHours(), 1, 12, 1));

        JPanel dialogPanel = new JPanel(new GridLayout(3, 2, 8, 8));
        dialogPanel.add(new JLabel("New Date:"));             dialogPanel.add(newDateSpinner);
        dialogPanel.add(new JLabel("New Start Hour (0-23):")); dialogPanel.add(newHourSpinner);
        dialogPanel.add(new JLabel("New Duration (hours):"));  dialogPanel.add(newHoursSpinner);

        int result = JOptionPane.showConfirmDialog(this, dialogPanel,
                "Modify Reservation " + r.getId().toString().substring(0, 6).toUpperCase(),
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result != JOptionPane.OK_OPTION) return;

        LocalDateTime newStart = buildStartTimeFromSpinners(newDateSpinner, (int) newHourSpinner.getValue());
        if (newStart == null) return;
        int newHours = (int) newHoursSpinner.getValue();

        try {
            reservationService.modify(r, newStart, newHours);
            JOptionPane.showMessageDialog(this, "Reservation updated.", "Modified", JOptionPane.INFORMATION_MESSAGE);
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

    private void handleExtend() {
        Reservation r = selectedReservation();
        if (r == null) return;

        JSpinner extraSpinner = new JSpinner(new SpinnerNumberModel(1, 1, 12, 1));
        JPanel dialogPanel = new JPanel(new GridLayout(2, 2, 8, 8));
        dialogPanel.add(new JLabel("Extra hours:"));
        dialogPanel.add(extraSpinner);
        dialogPanel.add(new JLabel("Current end time:"));
        dialogPanel.add(new JLabel(r.getEndTime().format(DISPLAY_FMT)));

        int result = JOptionPane.showConfirmDialog(this, dialogPanel,
                "Extend Reservation", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result != JOptionPane.OK_OPTION) return;

        int extra = (int) extraSpinner.getValue();
        double extensionCost = r.getHourlyRate() * extra;

        int confirm = JOptionPane.showConfirmDialog(this,
                String.format("Extending by %d hour(s) will cost $%.2f via %s. Proceed?",
                        extra, extensionCost, r.getPaymentStrategy().getMethodName()),
                "Confirm Extension", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) return;

        try {
            reservationService.extend(r, extra);
            JOptionPane.showMessageDialog(this,
                    String.format("Extended! New end time: %s", r.getEndTime().format(DISPLAY_FMT)),
                    "Extension Confirmed", JOptionPane.INFORMATION_MESSAGE);
            refreshReservations();
        } catch (Exception ex) { error(ex.getMessage()); }
    }

    private LocalDateTime buildStartTime() {
        return buildStartTimeFromSpinners(dateSpinner, (int) hourOfDaySpinner.getValue());
    }

    private LocalDateTime buildStartTimeFromSpinners(JSpinner dateSpin, int hour) {
        java.util.Date date = (java.util.Date) dateSpin.getValue();
        java.time.LocalDate localDate = date.toInstant()
                .atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        return localDate.atTime(hour, 0);
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
            case "Research Grant":        return new GrantPayment();
            default:                      return new CreditCardPayment();
        }
    }

    private List<Equipment> getAvailableEquipment() {
        if (currentEquipmentList == null) return List.of();
        return currentEquipmentList.stream()
                .filter(e -> e.getEquipmentStatus() != EquipmentStatus.DISABLED
                          && e.getEquipmentStatus() != EquipmentStatus.MAINTENANCE)
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
                    r.getStartTime().format(DISPLAY_FMT),
                    r.getEndTime().format(DISPLAY_FMT),
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