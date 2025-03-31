// Problem 3.2
import javax.swing.*;
import java.awt.*;

public class FourFansGrid extends JFrame {

    public FourFansGrid() {
        // Set up the frame
        setTitle("Four Fans in GridLayout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400); // Set the size of the frame

        // Create a GridLayout with 2 rows and 2 columns
        setLayout(new GridLayout(2, 2, 10, 10)); // 10px gap between components

        // Add four FanPanel instances to the frame
        add(new FanPanel());
        add(new FanPanel());
        add(new FanPanel());
        add(new FanPanel());
    }

    // Custom panel to draw a single fan
    class FanPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // Get the dimensions of the panel
            int width = getWidth();
            int height = getHeight();
            int diameter = Math.min(width, height) - 20; // Leave some padding
            int x = (width - diameter) / 2;
            int y = (height - diameter) / 2;

            // Draw the fan: 8 wedges, alternating red and white
            g.setColor(Color.WHITE);
            g.fillOval(x, y, diameter, diameter); // Background circle

            g.setColor(Color.RED);
            int numWedges = 12; // Total number of wedges
            int anglePerWedge = 360 / numWedges; // Each wedge is 45 degrees

            // Draw every other wedge in red
            for (int i = 0; i < numWedges; i += 2) {
                g.fillArc(x, y, diameter, diameter, i * anglePerWedge, anglePerWedge);
            }

            // Draw the outline of the circle
            g.setColor(Color.BLUE);
            g.drawOval(x, y, diameter, diameter);
        }
    }

    public static void main(String[] args) {
        // Run the application on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            FourFansGrid frame = new FourFansGrid();
            frame.setVisible(true);
        });
    }
}