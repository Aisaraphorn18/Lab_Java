package lab07_02;

import java.awt.Component;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PageB extends JPanel {
    private JTextArea textArea;

    public PageB(PageSwapper parent) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        textArea = new JTextArea("");
        JButton backButton = new JButton("Back");

        textArea.setEditable(false);
        backButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(textArea);
        add(backButton);

        // Add an event handler for the back button
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Call backButtonPressed method of PageSwapper
                // and pass the current text from the text area
                parent.backButtonPressed(textArea.getText());
            }
        });
    }

    // Method to append text received from PageA to the existing text in the text area
    public void submitText(String text) {
        textArea.append(" " + text);
    }
    
    // Method to clear the text area
    public void clearTextArea() {
        textArea.setText("");
    }
}


