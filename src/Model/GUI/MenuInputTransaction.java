package GUI;

import javax.swing.*;
import java.awt.*;

public class MenuInputTransaction extends JFrame {
    private JTextField txtNama, txtAlamat, txtNomorTelp, txtberatPaket;
    JComboBox<String> cmbCategoryPackage;
    private JButton btnSimpan, btnBack;

    public MenuInputTransaction(){
        setTitle("Input Transaction");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        
        add(new Label("Nama:"));
        txtNama = new JTextField();
        add(txtNama);

        txtAlamat = new JTextField();
        add(txtAlamat);

        txtNomorTelp = new JTextField();
        add(txtNomorTelp);

        txtberatPaket = new JTextField();
        add(txtberatPaket);

        cmbCategoryPackage = new JComboBox<>(new String [] {"Reguler", "Fast", "Super Fast"});
        add(cmbCategoryPackage);

        btnSimpan = new JButton("Save");
        add(btnSimpan);

        btnBack = new JButton("Back");
        add(btnBack);

        // btnSimpan.addActionListener(e -> );

        btnBack.addActionListener(e -> new Menu().setVisible(true));
        setLocationRelativeTo(null);
        dispose();
    }
    public static void main(String[] args) {
        new MenuInputTransaction().setVisible(true);
    }
}
