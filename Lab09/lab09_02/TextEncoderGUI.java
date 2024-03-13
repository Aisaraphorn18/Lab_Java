package lab09_02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextEncoderGUI extends JFrame {
    private JTextField inputTextField;
    private JButton encodeButton;
    private JTextArea resultTextArea;

    public TextEncoderGUI() {
        setTitle("Message Encoder");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // สร้างแผงหลัก
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        // สร้างพาเนลสำหรับรับข้อความ
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());
        JLabel inputLabel = new JLabel("Original Message:");
        inputTextField = new JTextField(20);
        inputPanel.add(inputLabel);
        inputPanel.add(inputTextField);

        // สร้างปุ่มเพื่อเข้ารหัส
        encodeButton = new JButton("Encode!");
        encodeButton.addActionListener(new EncodeButtonListener());

        // สร้างพาเนลสำหรับผลลัพธ์
        JPanel resultPanel = new JPanel();
        resultPanel.setLayout(new BorderLayout());
        JLabel resultLabel = new JLabel("ผลลัพธ์:");
        resultTextArea = new JTextArea(10, 30);
        resultTextArea.setEditable(false);
        resultPanel.add(resultLabel, BorderLayout.NORTH);
        resultPanel.add(new JScrollPane(resultTextArea), BorderLayout.CENTER);

        // เพิ่มพาเนลทั้งสองเข้ากับแผงหลัก
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(encodeButton, BorderLayout.CENTER);
        mainPanel.add(resultPanel, BorderLayout.SOUTH);

        // เพิ่มแผงหลักเข้ากับ JFrame
        add(mainPanel);

        // แสดง GUI
        setVisible(true);
    }

    private class EncodeButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String inputText = inputTextField.getText();
            String encodedText = encodeText(inputText);
            resultTextArea.setText(encodedText);
        }
    }

    private String encodeText(String text) {
        StringBuilder encodedText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            if (Character.isUpperCase(currentChar)) {
                // แปลงตัวอักษรพิมพ์ใหญ่เป็นพิมพ์เล็ก
                encodedText.append(Character.toLowerCase(currentChar));
            } else if (Character.isLowerCase(currentChar)) {
                // แปลงตัวอักษรตามกฎที่กำหนด
                char encodedChar = (char) ('a' + ('z' - currentChar));
                encodedText.append(encodedChar);
            } else {
                // ไม่แปลงตัวอักษรอื่นๆ เช่น เครื่องหมายวรรคตอน
                encodedText.append(currentChar);
            }
        }

        return encodedText.toString();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TextEncoderGUI();
            }
        });
    }
}
