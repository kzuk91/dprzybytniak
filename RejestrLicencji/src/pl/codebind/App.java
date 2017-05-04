package pl.codebind;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Daniel Przybytniak on 04.05.2017.
 */
public class App {
    private JPanel mainWindow;
    private JTable licenseTable;
    private JButton removeButton;
    private JButton addButton;

    public App() {

        addButton.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(null, "Dodałeś licencje");
        });
        removeButton.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(null, "Usunąłeś bazę danych... ITS A PRANK BRO");
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Rejestr Licejcji");
        frame.setContentPane(new App().mainWindow);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
