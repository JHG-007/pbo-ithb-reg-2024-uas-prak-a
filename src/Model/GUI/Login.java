package GUI;

// import Controller.LoginCheck;

import java.awt.event.ActionListener;
import java.awt.print.Book;

import javax.swing.*;

public class Login extends JFrame {
    public Login() {
        initComponents();
    }

    private void initComponents() {
        JFrame frame = new JFrame();
        frame.setTitle("Login Page");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JLabel label = new JLabel("Label Nama");
        label.setText("Enter your Name: ");
        label.setBounds(10, 10, 100, 30);

        JTextField nameTextField = new JTextField();
        nameTextField.setBounds(10, 50, 200, 30);

        JLabel label2 = new JLabel("Label Password");
        label2.setText("Enter your password: ");
        label2.setBounds(10, 90, 100, 30);

        JPasswordField passwordTextField = new JPasswordField();
        passwordTextField.setBounds(10, 120, 200, 30);

        JButton btnSubmit = new JButton("Login");;
        btnSubmit.setBounds(10, 200, 200, 40);
        btnSubmit.setEnabled(true);

        frame.add(label);
        frame.add(nameTextField);
        frame.add(label2);
        frame.add(passwordTextField);
        frame.add(btnSubmit);

        frame.setLayout(null);
        frame.setVisible(true);

        btnSubmit.addActionListener(e -> {
            BookList login = new BookList();
            // login.setVisible(true);
            dispose();
        });
    }
}
