package lab06_02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Keypad extends JFrame {

    private JTextField text;

    public Keypad() {
        createUI();
    }

    private void createUI() {
        JPanel mainPanel = new JPanel(new BorderLayout());

        text = new JTextField("0");
        mainPanel.add(text, BorderLayout.NORTH);

        JPanel keypad = createKeypad();
        mainPanel.add(keypad, BorderLayout.CENTER);

        add(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }

    private JPanel createKeypad() {
        JPanel keypad = new JPanel(new GridLayout(4, 3));

        String[] buttonLabels = {"7", "8", "9", "4", "5", "6", "1", "2", "3", "0", "Clear"};

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            if (label.equals("Clear")) {
                button.addActionListener(new ClearButtonClickListener());
            } else {
                button.addActionListener(new NumberButtonClickListener());
            }
            keypad.add(button);
        }

        return keypad;
    }

    private class NumberButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            String command = event.getActionCommand();
            String currentText = text.getText();
            if (currentText.equals("0")) {
                text.setText(command);
            } else {
                text.setText(currentText + command);
            }
        }
    }

    private class ClearButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            text.setText("0");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Keypad app = new Keypad();
            app.setVisible(true);
        });
    }
}
