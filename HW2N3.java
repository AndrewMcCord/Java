//*******************************************************************

//Problem 3 in homework 2 *

// Programmer: Andrew McCord *

// Due: 2/26/25 *

// Program file name: HW2N3.java *

// A brief description of your program //*******************************************************************
import javax.swing.*;
import java.awt.*;

public class GridPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        // Draw vertical lines in red
        g.setColor(Color.RED);
        for (int i = 1; i < 3; i++) {
            int x = width * i / 3;
            g.drawLine(x, 0, x, height);
        }

        // Draw horizontal lines in blue
        g.setColor(Color.BLUE);
        for (int i = 1; i < 3; i++) {
            int y = height * i / 3;
            g.drawLine(0, y, width, y);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("3x3 Grid");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.add(new GridPanel());
        frame.setVisible(true);
    }
}