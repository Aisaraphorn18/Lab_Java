package lab08_02;

import javax.swing.*;
public class DrawRandomShapesTest {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Random Shapes");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            DrawRandomShapes drawPanel = new DrawRandomShapes();
            frame.add(drawPanel);
            frame.setSize(400, 400);
            frame.setVisible(true);
        });
    }
}
