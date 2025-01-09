package GUI;

import javax.swing.*;
import java.awt.*;

public class MainMenu extends JFrame{
    private JButton btnLogin;
    private JButton btnRegister;

    public MainMenu(){
        setTitle("Main Menu");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        btnLogin = new JButton("Login");
        btnRegister = new JButton("Register");

        add(btnLogin);
        add(btnRegister);

        btnLogin.addActionListener(e -> new MenuLogin().setVisible(true));
        setLocationRelativeTo(null);
        dispose();

        btnRegister.addActionListener(e -> new MenuRegister().setVisible(true));
        setLocationRelativeTo(null);
        dispose();
    }
    
    public static void main(String[] args) {
        new MainMenu().setVisible(true);
    }
}
