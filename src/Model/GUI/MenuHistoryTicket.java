package GUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MenuHistoryTicket extends JFrame {
    private JTable table;
    private JButton btnBack;

    public MenuHistoryTicket() {
        setTitle("Lihat History Paket");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        String[] columnNames = {"Transaction ID", "Package Type", "Package Weight", "Total Cost", "Created At", "Updated At", "Actions"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        try (Connection connection = DatabaseHandler.getConnection()) {
            String query = "SELECT";

            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Object[] rowData = {
                    resultSet.getString("transaction_id"),
                    resultSet.getString("package_type"),
                    resultSet.getDouble("package_weight"),
                    resultSet.getInt("total_cost"),
                    resultSet.getString("created_at"),
                    resultSet.getString("updated_at"),
                };
                model.addRow(rowData);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error loading data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Tabel
        table = new JTable(model) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 6; // Kolom terakhir (Actions) bisa di-edit
            }
        };

        // Tombol Back
        btnBack = new JButton("Back");
        btnBack.addActionListener(e -> {
            new MainMenu().setVisible(true);
            dispose();
        });

        // Panel untuk tombol Back
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(btnBack);

        // Tambahkan komponen ke JFrame
        add(new JScrollPane(table), BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

}}
