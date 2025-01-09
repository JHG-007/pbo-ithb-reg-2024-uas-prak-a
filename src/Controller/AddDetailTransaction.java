package Controller;

import Class.DatabaseHandler;
import GUI.MenuDetailTransaction;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AddDetailTransaction {
    private MenuDetailTransaction view;

    public AddDetailTransaction(MenuDetailTransaction view) {
        this.view = view;
    }

    public void addShipmentDetail() {
        String transactionId = view.getTransactionId();
        String status = view.getStatus();
        String currentPosition = view.getCurrentPosition();
        String evidence = view.getEvidence();
        String updatedBy = view.getUpdatedBy();
        String currentDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

        if (transactionId.isEmpty() || status.isEmpty() || currentPosition.isEmpty() || updatedBy.isEmpty()) {
            JOptionPane.showMessageDialog(view, "Semua field harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (Connection connection = DatabaseHandler.getConnection()) {
            String query = "INSERT INTO shipment_detail (transaction_id, status, date, current_position, evidence, updated_by) VALUES (?, ?, ?, ?, ?, ?)";

            try (PreparedStatement stmt = connection.prepareStatement(query)) {
                stmt.setInt(1, Integer.parseInt(transactionId));
                stmt.setString(2, status);
                stmt.setString(3, currentDate);
                stmt.setString(4, currentPosition);
                stmt.setString(5, evidence);
                stmt.setString(6, updatedBy);
                stmt.executeUpdate();

                JOptionPane.showMessageDialog(view, "Detail transaksi berhasil disimpan!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(view, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(view, "Transaction ID harus berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
