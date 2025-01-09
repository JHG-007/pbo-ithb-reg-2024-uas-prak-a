package GUI;

import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame{
    private JButton btnInputTransaction;
    private JButton btnHistoryTicket;

    public Menu(){
        setTitle("Menu");
        setSize(400, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        JPanel frame = new JPanel(new GridLayout(5, 5, 5, 5));


        btnInputTransaction = new JButton("Tambah Transaksi Pengiriman");
        btnHistoryTicket = new JButton("History Tiket");

        frame.add(btnInputTransaction);
        frame.add(btnHistoryTicket);

        add(frame, BorderLayout.CENTER);

        btnInputTransaction.addActionListener(e -> {
            new MenuInputTransaction().setVisible(true);
            dispose();
        });

        btnHistoryTicket.addActionListener(e -> {
            new MenuHistoryTicket().setVisible(true);
            dispose();
        });
    }
    
    public static void main(String[] args) {
        new Menu().setVisible(true);
    }
}
