package GUI;

import javax.swing.*;
import java.awt.*;

public class MainMenu extends JFrame{
    private JButton btnLogin;
    private JButton btnRegister;

    public MainMenu(){
        setTitle("Main Menu");
        setSize(400, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        JPanel frame = new JPanel(new GridLayout(5, 5, 5, 5));


        btnLogin = new JButton("Login");
        btnRegister = new JButton("Register");

        frame.add(btnLogin);
        frame.add(btnRegister);

        add(frame, BorderLayout.CENTER);

        btnLogin.addActionListener(e -> {
            new MenuLogin().setVisible(true);
            dispose();
        });

        btnRegister.addActionListener(e -> {
            new MenuRegister().setVisible(true);
            dispose();
        });
    }

}
