package GUI;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;


public class TransactionGUI extends JFrame{
    // frame
    JFrame f;
    // Table
    JTable j;

    // Constructor
    TransactionGUI() {
        // Frame initialization
        f = new JFrame();
        f.setSize(500, 800);
        f.setLocationRelativeTo(null);

        // Frame Title
        f.setTitle("JTable Example");

        String[][] data = {
                // { "Kundan Kumar Jha", "4031", "CSE" },
                // { "Anand Jha", "6014", "IT" }
        };

        // Column Names
        String[] columnNames = { "Transaction ID", "User name", "Book title", "Book genre", "Price" };

        // Initializing the JTable
        j = new JTable(data, columnNames);
        j.setBounds(30, 40, 200, 300);

        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(j);
        f.add(sp);
        f.setSize(500, 800);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new TransactionGUI();
    }
}
