package lab07_02;

import javax.swing.JFrame;

public class PageSwapper extends JFrame {
    private PageA pageA;
    private PageB pageB;

    public PageSwapper() {
        pageA = new PageA(this);
        pageB = new PageB(this);

        setContentPane(pageA);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void submitButtonPressed(String text) {
        // Swap to PageB, sending text from PageA to it
        pageB.submitText(text);
        setContentPane(pageB);
        revalidate();
        repaint();
    }

    public void backButtonPressed(String text) {
        // Swap back to PageA
        pageA.setTextFieldText(text);
        setContentPane(pageA);
        revalidate();
        repaint();
    }
}
