package Controller;

import Class.DatabaseHandler;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RegisterCheck {

    public boolean register(String name, String address, String phone, String password) {
        if (name.isEmpty() || address.isEmpty() || phone.isEmpty() || password.isEmpty()) {
            return false;
        }

        try (Connection connection = DatabaseHandler.getConnection()) {
            String checkQuery = "SELECT * FROM customer WHERE phone = ?";
            try (PreparedStatement checkStmt = connection.prepareStatement(checkQuery)) {
                checkStmt.setString(1, phone);
                ResultSet rs = checkStmt.executeQuery();
                if (rs.next()) {
                    return false;
                }
            }

            String insertQuery = "INSERT INTO customer (name, password, address, phone) VALUES (?, ?, ?, ?)";
            try (PreparedStatement insertStmt = connection.prepareStatement(insertQuery)) {
                insertStmt.setString(1, name);
                insertStmt.setString(2, password);
                insertStmt.setString(3, address);
                insertStmt.setString(4, phone);
                insertStmt.executeUpdate();
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
