package GUI;

import javax.swing.*;
import java.awt.*;

public class MenuLogin extends JFrame {
    private JTextField txtNomorTelp;
    private JPasswordField txtPassword;
    private JButton btnLogin;
    private JButton btnBack;
    Toolkit toolkit = Toolkit.getDefaultToolkit();
    Image img = toolkit.getImage("images/logo.png");

    public MenuLogin() {
        setTitle("Login");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);

        txtNomorTelp = new JTextField();
        add(txtNomorTelp);
        
        txtPassword = new JPasswordField();
        add(txtPassword);

        btnLogin = new JButton("Login");
        add(btnLogin);

        btnBack = new JButton("Back");
        add(btnBack);



        btnLogin.addActionListener(e -> new Menu().setVisible(true));
        setLocationRelativeTo(null);
        dispose();

        btnBack.addActionListener(e -> new MainMenu().setVisible(true));
        setLocationRelativeTo(null);
        dispose();
    }

    public static void main(String[] args) {
        new MenuLogin().setVisible(true);
    }
}
