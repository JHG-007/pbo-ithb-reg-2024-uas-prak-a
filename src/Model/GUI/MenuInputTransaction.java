package GUI;

import javax.swing.*;
import java.awt.*;

public class MenuInputTransaction extends JFrame {
    private JTextField txtNama, txtAlamat, txtNomorTelp, txtberatPaket;
    JComboBox<String> cmbCategoryPackage;
    private JButton btnSimpan, btnBack;

    public MenuInputTransaction() {
        setTitle("Input Transaction");
        setSize(600, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        JPanel frame = new JPanel(new GridLayout(15, 3, 3, 3));

        frame.add(new Label("Nama:"));
        txtNama = new JTextField(32);
        frame.add(txtNama);

        frame.add(new Label("Alamat:"));
        txtAlamat = new JTextField(50);
        frame.add(txtAlamat);

        frame.add(new Label("No Telepon:"));
        txtNomorTelp = new JTextField(16);
        frame.add(txtNomorTelp);

        frame.add(new Label("Berat Paket:"));
        txtberatPaket = new JTextField(10);
        frame.add(txtberatPaket);

        frame.add(new Label("Tipe Paket:"));
        String S1[] = { "Reguler", "Fast", "Super Fast" };
        cmbCategoryPackage = new JComboBox<>(S1);
        frame.add(cmbCategoryPackage);

        btnSimpan = new JButton("Save");
        frame.add(btnSimpan);

        btnBack = new JButton("Back");
        frame.add(btnBack);

        add(frame, BorderLayout.CENTER);

        // btnSimpan.addActionListener(e -> );

        btnBack.addActionListener(e -> {
            new Menu().setVisible(true);
            dispose();
        });
    }
    
    public static void main(String[] args) {
        new MenuInputTransaction().setVisible(true);
    }
}
