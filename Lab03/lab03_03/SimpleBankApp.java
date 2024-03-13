package lab03_03;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class SimpleBankApp {
    public static void main(String[] args) {
        JFrame app = new JFrame();

        app.add(new JLabel("Simple Bank App", SwingConstants.CENTER), BorderLayout.PAGE_START);

        JPanel dataEntryPanel = new JPanel();
        dataEntryPanel.setLayout(new GridLayout(3, 2));
        dataEntryPanel.add(new JLabel("Account Number"));
        dataEntryPanel.add(new JTextField());
        dataEntryPanel.add(new JLabel("Balance"));
        dataEntryPanel.add(new JTextField());
        dataEntryPanel.add(new JLabel("Amount"));
        dataEntryPanel.add(new JTextField());

        JPanel operationPanel = new JPanel();
        operationPanel.add(new JButton("Deposit"));
        operationPanel.add(new JButton("Withdraw"));

        app.add(dataEntryPanel, BorderLayout.CENTER);
        app.add(operationPanel, BorderLayout.PAGE_END);

        // Default is HIDE_ON_CLOSE which will not exit the program when
        // clicking the X button
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        app.setSize(400, 200);
        app.setVisible(true);
    }
}
