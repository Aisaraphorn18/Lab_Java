import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdderAndSubtractor extends JFrame implements ActionListener {
    JTextField text;
    double result;
    String operator;
    boolean startNumber;

    public AdderAndSubtractor() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        text = new JTextField("0");
        mainPanel.add(text, BorderLayout.NORTH);

        JPanel keypad = new JPanel();
        keypad.setLayout(new GridLayout(4, 4));

        // Number buttons
        for (int i = 1; i <= 9; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.addActionListener(this);
            keypad.add(button);
        }
        JButton button0 = new JButton("0");
        button0.addActionListener(this);
        keypad.add(button0);

        // Operator buttons
        JButton addButton = new JButton("+");
        addButton.addActionListener(this);
        keypad.add(addButton);

        JButton subtractButton = new JButton("-");
        subtractButton.addActionListener(this);
        keypad.add(subtractButton);

        JButton equalsButton = new JButton("=");
        equalsButton.addActionListener(this);
        keypad.add(equalsButton);

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(this);
        keypad.add(clearButton);

        mainPanel.add(keypad, BorderLayout.CENTER);

        add(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();

        result = 0;
        operator = "";
        startNumber = true;
    }

    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        if (action.equals("+") || action.equals("-")) {
            operator = action;
            result = Double.parseDouble(text.getText());
            startNumber = true;
        } else if (action.equals("=")) {
            double secondOperand = Double.parseDouble(text.getText());
            if (operator.equals("+")) {
                result += secondOperand;
            } else if (operator.equals("-")) {
                result -= secondOperand;
            }
            text.setText(String.valueOf(result));
            operator = "";
            startNumber = true;
        } else if (action.equals("Clear")) {
            text.setText("0");
            result = 0;
            operator = "";
            startNumber = true;
        } else {
            if (startNumber) {
                text.setText(action);
                startNumber = false;
            } else {
                text.setText(text.getText() + action);
            }
        }
    }

    public static void main(String[] args) {
        AdderAndSubtractor app = new AdderAndSubtractor();
        app.setVisible(true);
    }
}
