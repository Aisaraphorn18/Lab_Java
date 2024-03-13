package lab08_01;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

class DrawHat extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();

        g.setColor(Color.pink);
        g.fillOval(0,height/2,width,height/2);

        g.setColor(Color.CYAN);
        g.fillRect(width/4,height/4 , width/2, height/2);

        g.setColor(Color.pink);
        int ovalWidth = width/2;
        int ovalHeight = height/4;
        int ovalX = (width-ovalWidth)/2;
        int ovalY = (height/4)-(ovalHeight/2);
        g.fillOval(ovalX, ovalY,ovalWidth,ovalHeight);

        g.setColor(Color.pink);
        int ovalWidth2 = width/2;
        int ovalHeight2 = height/4;
        int ovalX2 = (width-ovalWidth2)/2;
        int ovalY2 = (height/2)-(ovalHeight2/400);
        g.fillOval(width/4,500,width/2,height/4);


       
}
}