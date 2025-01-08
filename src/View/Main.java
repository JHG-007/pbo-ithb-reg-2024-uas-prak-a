package View;

import javax.swing.SwingUtilities;

import GUI.*;
public class Main {
    // public static void main(String[] args) {
    //     // new Login();
    //     // new BookList();
    //     new MainMenu();
    // }
        public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainMenu mainMenu = new MainMenu();
            mainMenu.setVisible(true);
        });
    }
}
