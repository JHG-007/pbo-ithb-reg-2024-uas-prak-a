package GUI;

import javax.swing.*;
import java.awt.*;

public class MenuRegister extends JFrame{
    private JTextField txtNama, txtNomorTelp, txtAlamat;
    private JPasswordField txtPassword;
    private JButton btnRegister, btnBack;
    
    public MenuRegister(){
        setTitle("Register");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);

        
    }
}