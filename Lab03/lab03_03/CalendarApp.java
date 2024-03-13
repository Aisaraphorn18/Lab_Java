package lab03_03;
    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import java.util.Calendar;
    
    public class CalendarApp {
    
        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {
                JFrame frame = new JFrame("Calendar App");
                frame.setSize(500, 400);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
                JPanel panel = new JPanel(new GridLayout(7, 7));
    
                // สร้างปฏิทินสำหรับเดือนมกราคม ค.ศ. 2024
                Calendar calendar = Calendar.getInstance();
                calendar.set(2024, Calendar.JANUARY, 1);
                int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
    
                for (String day : new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"}) {
                    panel.add(new JLabel(day, JLabel.CENTER));
                }
    
                for (int i = 1; i < firstDayOfWeek; i++) {
                    panel.add(new JLabel(""));
                }
    
                for (int day = 1; day <= calendar.getActualMaximum(Calendar.DAY_OF_MONTH); day++) {
                    JButton button = new JButton(String.valueOf(day));
                    button.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            JOptionPane.showMessageDialog(frame, "Selected date: January " + day + ", 2024");
                        }
                    });
                    panel.add(button);
                }
    
                frame.add(panel);
                frame.setVisible(true);
            });
        }
    }
    
    
