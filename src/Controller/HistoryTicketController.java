package Controller;

import Class.DatabaseHandler;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HistoryTicketController {

    public void loadHistoryData(DefaultTableModel tableModel) {
        try (Connection connection = DatabaseHandler.getConnection()) {
            String query = "SELECT t.id AS transaction_id, " +
               "t.package_weight, " +
               "t.total_cost, " +
               "t.receipt_name, " +
               "sd.date AS updated_at " +
               "FROM transaction t " +
               "JOIN shipment_detail sd ON t.id = sd.transaction_id " +
               "GROUP BY t.id, t.package_weight, t.total_cost, t.receipt_name " +
               "ORDER BY updated_at DESC";

            try (PreparedStatement statement = connection.prepareStatement(query);
                    ResultSet resultSet = statement.executeQuery()) {

                while (resultSet.next()) {
                    Object[] row = {
                            resultSet.getString("transaction_id"),
                            resultSet.getString("package_type"),
                            resultSet.getDouble("package_weight"),
                            resultSet.getInt("total_cost"),
                            resultSet.getString("created_at"),
                            resultSet.getString("updated_at"),
                            "Lihat Detail"
                    };
                    tableModel.addRow(row);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error loading data: " + e.getMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
