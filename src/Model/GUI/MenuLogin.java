package GUI;

import javax.swing.*;

import Controller.LoginCheck;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
public class MenuLogin extends JFrame {
    private JTextField txtNomorTelp;
    private JPasswordField txtPassword;
    private JButton btnLogin;
    private JButton btnBack;
    JLabel appLogo = new JLabel(new ImageIcon("GUI/images/logo.png"));

    public MenuLogin() {
        setTitle("Login");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        JPanel frame = new JPanel(new GridLayout(5, 5, 10, 10));

        JLabel label1 = new JLabel("Nomor Telepon:");
        txtNomorTelp = new JTextField(16);
        frame.add(label1);
        frame.add(txtNomorTelp);

        JLabel label2 = new JLabel("Password:");
        txtPassword = new JPasswordField(20);
        frame.add(label2);
        frame.add(txtPassword);

        btnLogin = new JButton("Login");
        frame.add(btnLogin);

        btnBack = new JButton("Back");
        frame.add(btnBack);

        add(frame, BorderLayout.CENTER);

        btnLogin.addActionListener(e -> {
            String phone = txtNomorTelp.getText();
            String password = new String(txtPassword.getPassword());
            LoginCheck loginCheck = new LoginCheck();
            boolean success = loginCheck.login(phone, password);
            if (success) {
                JOptionPane.showMessageDialog(this, "Login berhasil!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                new Menu().setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Nomor telepon atau password salah!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    
        btnBack.addActionListener(e -> {
            new MainMenu().setVisible(true);
            dispose();
        });
    }
}
