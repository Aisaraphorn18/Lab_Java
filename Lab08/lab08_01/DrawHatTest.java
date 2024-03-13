package lab08_01;
import javax.swing.JFrame;
public class DrawHatTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        DrawHat drawHat = new DrawHat();
        
        frame.add(drawHat);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}

