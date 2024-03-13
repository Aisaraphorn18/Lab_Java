package lab07_02;

import javax.swing.SwingUtilities;

public class MainApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                PageSwapper app = new PageSwapper();
                app.setLocationRelativeTo(null);
                app.setVisible(true);
            }
        }); 
    }
}
