package lab07_02;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PageA extends JPanel {
    private JTextField textField;

    public PageA(PageSwapper parent) {
        textField = new JTextField(20);
        JButton submitButton = new JButton("Submit");

        add(textField);
        add(submitButton);

        // Add an event handler for the Submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get text from the text field
                String text = textField.getText();
                
                // Call submitButtonPressed method of PageSwapper and pass the text
                parent.submitButtonPressed(text);
            }
        });
    }

    // Method to set text in the text field
    public void setTextFieldText(String text) {
        textField.setText(text);
    }
}
