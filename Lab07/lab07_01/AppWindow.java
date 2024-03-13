import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AppWindow extends JFrame {
    public AppWindow() {
        JPanel panelA = new JPanel();

        JButton buttonA = new JButton("Button A");
        JButton buttonB = new JButton("Button B");
        JButton buttonC = new JButton("Button C");
        JButton buttonD = new JButton("Button D");
        JButton buttonE = new JButton("Button E");

        JTextField textA = new JTextField();
        JTextField textB = new JTextField();

        textA.setMaximumSize(new Dimension(Short.MAX_VALUE, 20));

        JLabel labelA = new JLabel("Label A");
        JLabel labelB = new JLabel("Label B");
        JLabel labelC = new JLabel("Label C");

        panelA.add(labelA);
        panelA.add(textA);
        panelA.add(buttonA);
        panelA.add(labelB);
        panelA.add(buttonB);

        panelA.add(labelC);
        panelA.add(buttonC);
        panelA.add(buttonD);
        panelA.add(textB);

        panelA.add(buttonE);

        add(panelA, BorderLayout.CENTER);

        setSize(400, 250);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
