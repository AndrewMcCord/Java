import java.awt.*;
import java.applet.*;

public class Grid extends Applet {
    public void paint(Graphics g) {
        // Set color to blue for horizontal lines
        g.setColor(Color.BLUE);
        
        // Draw horizontal lines
        g.drawLine(0, 50, 150, 50);
        g.drawLine(0, 100, 150, 100);
        
        // Set color to red for vertical lines
        g.setColor(Color.RED);
        
        // Draw vertical lines
        g.drawLine(50, 0, 50, 150);
        g.drawLine(100, 0, 100, 150);
    }

    public static void main(String[] args) {
        Frame frame = new Frame("3x3 Grid");
        Grid grid = new Grid();
        frame.add(grid);
        frame.setSize(160, 160);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}