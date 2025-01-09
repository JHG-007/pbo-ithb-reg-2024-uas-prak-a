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
