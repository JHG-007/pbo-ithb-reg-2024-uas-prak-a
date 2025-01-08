package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MainMenu extends JFrame {
    public MainMenu() {
        setTitle("Main Menu");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));

        JButton btnLogin = new JButton("Login");
        JButton btnExit = new JButton("Exit");

        btnLogin.addActionListener(e -> {
            Login login = new Login();
            login.setVisible(true);
            dispose();
        });

        btnExit.addActionListener(e -> System.exit(0));

        add(btnLogin);
        add(btnExit);
    }
}
