package GUI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javafx.event.ActionEvent;

import java.awt.event.ActionListener;

public class BookList {
    public BookList() {
        initComponents();
    }

    private void initComponents() {
        JFrame frame = new JFrame();
        frame.setTitle("Book List");
        frame.setSize(500, 700);
        frame.setLocationRelativeTo(null);

        JLabel label = new JLabel("Title Buku;");
        label.setBounds(10, 50, 200, 30);

        JTextField titleBukuTextField = new JTextField();
        titleBukuTextField.setBounds(80, 50, 200, 30);

        JLabel imageBook = new JLabel(new ImageIcon());
        imageBook.setBounds(10, 700, 100, 30);

        JLabel label2 = new JLabel("Author Buku:");
        label2.setBounds(10, 100, 200, 30);

        JTextField authorTextField = new JTextField();
        authorTextField.setBounds(90, 100, 200, 30);

        JLabel label3 = new JLabel("Genre buku:");
        label3.setBounds(10, 140, 200, 30);

        JTextField genreTextField = new JTextField();
        genreTextField.setBounds(90, 140, 200, 30);

        JLabel label4 = new JLabel("Harga buku:");
        label4.setBounds(10, 180, 100, 30);

        JTextField priceTextField = new JTextField();
        priceTextField.setBounds(90, 180, 100, 30);

        JButton btnSubmit = new JButton();
        btnSubmit = new JButton("Buy Book");
        btnSubmit.setBounds(10, 300, 200, 40);
        btnSubmit.setEnabled(true);

        frame.add(label);
        frame.add(imageBook);
        frame.add(titleBukuTextField);
        frame.add(label2);
        frame.add(authorTextField);
        frame.add(label3);
        frame.add(genreTextField);
        frame.add(label4);
        frame.add(priceTextField);
        frame.add(btnSubmit);

        frame.setLayout(null);
        frame.setVisible(true);
        
    }
}
