package Controller;

import Class.DatabaseHandler;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginCheck {

    public boolean login(String phone, String password) {
        if (phone.isEmpty() || password.isEmpty()) {
            return false;
        }

        try (Connection connection = DatabaseHandler.getConnection()) {
            String query = "SELECT * FROM customer WHERE phone = ? AND password = ?";
            try (PreparedStatement stmt = connection.prepareStatement(query)) {
                stmt.setString(1, phone);
                stmt.setString(2, password);
                ResultSet rs = stmt.executeQuery();
                return rs.next();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
