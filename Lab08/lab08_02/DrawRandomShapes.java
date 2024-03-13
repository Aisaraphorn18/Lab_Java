package lab08_02;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

class DrawRandomShapes extends JPanel {
    private Random random = new Random();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < 3; i++) {
            drawRandomShape(g);
        }
    }

    private void drawRandomShape(Graphics g) {
        int shapeType = random.nextInt(2); // เลือกสุ่มรูปทรง: 0 เส้นตรง, 1 สี่เหลี่ยม
        Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)); // สุ่มสีแบบ RGB
        g.setColor(color);

        int x1 = random.nextInt(getWidth()); // สุ่มค่า x จุดเริ่มต้น
        int y1 = random.nextInt(getHeight()); // สุ่มค่า y จุดเริ่มต้น
        int x2 = random.nextInt(getWidth()); // สุ่มค่า x จุดสิ้นสุด
        int y2 = random.nextInt(getHeight()); // สุ่มค่า y จุดสิ้นสุด

        if (shapeType == 0) { // เส้นตรง
            g.drawLine(x1, y1, x2, y2);
        } else { // สี่เหลี่ยม
            int width = random.nextInt(200); // สุ่มความกว้างสี่เหลี่ยม
            int height = random.nextInt(200); // สุ่มความสูงสี่เหลี่ยม
            g.fillRect(x1, y1, width, height);
        }
    }
}
