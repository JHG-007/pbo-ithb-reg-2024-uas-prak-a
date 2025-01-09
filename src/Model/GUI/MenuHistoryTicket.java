package GUI;

import Controller.HistoryTicketController;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class MenuHistoryTicket extends JFrame {
    private JTable table;
    private JButton btnBack;

    public MenuHistoryTicket() {
        setTitle("Lihat History Paket");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        String[] columnNames = {"Transaction ID", "Package Type", "Package Weight", "Total Cost", "Created At", "Updated At"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        table = new JTable(tableModel);
        loadData(tableModel);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        btnBack = new JButton("Back");
        btnBack.addActionListener(e -> {
            new Menu().setVisible(true);
            dispose();
        });

        JPanel btnBackPanel = new JPanel();
        btnBackPanel.add(btnBack);
        add(btnBackPanel, BorderLayout.SOUTH);
    }

    private void loadData(DefaultTableModel tableModel) {
        HistoryTicketController controller = new HistoryTicketController();
        controller.loadHistoryData(tableModel);
    }

    public static void main(String[] args) {
        new MenuHistoryTicket().setVisible(true);
    }
}
