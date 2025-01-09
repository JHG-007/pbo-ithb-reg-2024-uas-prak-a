package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Class.DatabaseHandler;

public class TransactionController {
    public void saveTransaction(int totalCost, int customerId, double packageWeight, String receiptName,
            String receiptAddress, String receiptPhone) throws SQLException {
        String sql = "INSERT INTO transaction (total_cost, customer_id, package_weight, receipt_name, receipt_address, receipt_phone) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection connection = DatabaseHandler.getConnection();
                PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setInt(1, totalCost);
            stmt.setInt(2, customerId);
            stmt.setDouble(3, packageWeight);
            stmt.setString(4, receiptName);
            stmt.setString(5, receiptAddress);
            stmt.setString(6, receiptPhone);

            stmt.executeUpdate();
        }
    }

}