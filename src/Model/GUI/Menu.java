package GUI;

import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame{
    private JButton btnLogin;
    private JButton btnInputTransaction;
    private JButton btnHistoryTicket;

    public Menu(){
        setTitle("Menu");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        btnInputTransaction = new JButton("Tambah Transaksi Pengiriman");
        btnHistoryTicket = new JButton("History Tiket");

        add(btnInputTransaction);
        add(btnHistoryTicket);

        btnInputTransaction.addActionListener(e -> new MenuInputTransaction().setVisible(true));
        setLocationRelativeTo(null);
        dispose();

        btnHistoryTicket.addActionListener(e -> new MenuHistoryTicket().setVisible(true));
        setLocationRelativeTo(null);
        dispose();
    }
    
    public static void main(String[] args) {
        new Menu().setVisible(true);
    }
}
