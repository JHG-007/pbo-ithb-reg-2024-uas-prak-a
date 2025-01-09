package GUI;

import Controller.AddDetailTransaction;

import javax.swing.*;
import java.awt.*;

public class MenuDetailTransaction extends JFrame {
    private JTextField txtTransactionId, txtStatus, txtCurrentPosition, txtEvidence, txtUpdatedBy;
    private JButton btnSave, btnBack;

    public MenuDetailTransaction() {
        setTitle("Tambah Detail Transaksi Pengiriman");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(6, 2, 10, 10));

        panel.add(new JLabel("Transaction ID:"));
        txtTransactionId = new JTextField();
        panel.add(txtTransactionId);

        panel.add(new JLabel("Status:"));
        txtStatus = new JTextField();
        panel.add(txtStatus);

        panel.add(new JLabel("Current Position:"));
        txtCurrentPosition = new JTextField();
        panel.add(txtCurrentPosition);

        panel.add(new JLabel("Evidence:"));
        txtEvidence = new JTextField();
        panel.add(txtEvidence);

        panel.add(new JLabel("Updated By:"));
        txtUpdatedBy = new JTextField();
        panel.add(txtUpdatedBy);

        btnSave = new JButton("Simpan");
        btnBack = new JButton("Back");

        panel.add(btnSave);
        panel.add(btnBack);

        add(panel, BorderLayout.CENTER);

        AddDetailTransaction controller = new AddDetailTransaction(this);
        btnSave.addActionListener(e -> controller.addShipmentDetail());
        btnBack.addActionListener(e -> {
            new Menu().setVisible(true);
            dispose();
        });
    }
    public String getTransactionId() { return txtTransactionId.getText();}
    public String getStatus() { return txtStatus.getText();}
    public String getCurrentPosition() { return txtCurrentPosition.getText();}
    public String getEvidence() { return txtEvidence.getText();}
    public String getUpdatedBy() { return txtUpdatedBy.getText();}

    public static void main(String[] args) {
        new MenuDetailTransaction().setVisible(true);
    }
}
