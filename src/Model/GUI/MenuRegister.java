package GUI;

import javax.swing.*;

import Controller.RegisterCheck;
import java.awt.*;

public class MenuRegister extends JFrame {
    private JTextField txtNama, txtNomorTelp, txtAlamat;
    private JPasswordField txtPassword;
    private JButton btnRegister, btnBack;

    public MenuRegister() {
        setTitle("Register");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        JPanel frame = new JPanel(new GridLayout(5, 5, 10, 10));

        frame.add(new JLabel("Nama:"));
        txtNama = new JTextField();
        frame.add(txtNama);

        frame.add(new JLabel("Alamat:"));
        txtAlamat = new JTextField();
        frame.add(txtAlamat);

        frame.add(new JLabel("Nomor Telepon:"));
        txtNomorTelp = new JTextField();
        frame.add(txtNomorTelp);

        frame.add(new JLabel("Password:"));
        txtPassword = new JPasswordField();
        frame.add(txtPassword);

        btnRegister = new JButton("Registrasi");
        btnBack = new JButton("Kembali");

        frame.add(btnRegister);
        frame.add(btnBack);

        add(frame, BorderLayout.CENTER);
        setVisible(true);

        btnRegister.addActionListener(e -> {
            String name = txtNama.getText();
            String address = txtAlamat.getText();
            String phone = txtNomorTelp.getText();
            String password = new String(txtPassword.getPassword());

            RegisterCheck registerCheck = new RegisterCheck();
            boolean success = registerCheck.register(name, address, phone, password);
            if (success) {
                JOptionPane.showMessageDialog(this, "Registrasi berhasil!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                clearFields();
                new MainMenu().setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Registrasi gagal, periksa input Anda.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        btnBack.addActionListener(e -> {
            new MainMenu().setVisible(true);
            dispose();
        });
    }

    private void clearFields() {
        txtNama.setText("");
        txtAlamat.setText("");
        txtNomorTelp.setText("");
        txtPassword.setText("");
    }
}
