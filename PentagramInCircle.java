//Problem 4
import java.awt.*;
import javax.swing.*;

public class PentagramInCircle extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set the dimensions of the circle and star
        int centerX = getWidth() / 2;  // Center X of the panel
        int centerY = getHeight() / 2; // Center Y of the panel
        int radius = 100;              // Radius of the circle

        // Draw the circle
        g.setColor(Color.BLACK);
        g.drawOval(centerX - radius, centerY - radius, 2 * radius, 2 * radius);

        // Draw the pentagram (5-pointed star) inside the circle
        g.setColor(Color.BLACK);

        // Calculate the points of the pentagram
        int[] xPoints = new int[5];
        int[] yPoints = new int[5];
        double angle = Math.toRadians(-18); // Start at -18 degrees to align the star

        for (int i = 0; i < 5; i++) {
            xPoints[i] = (int) (centerX + radius * Math.cos(angle));
            yPoints[i] = (int) (centerY + radius * Math.sin(angle));
            angle += Math.toRadians(72); // Increment by 72 degrees for the next point
        }

        // Draw the star using lines
        g.drawLine(xPoints[0], yPoints[0], xPoints[2], yPoints[2]);
        g.drawLine(xPoints[2], yPoints[2], xPoints[4], yPoints[4]);
        g.drawLine(xPoints[4], yPoints[4], xPoints[1], yPoints[1]);
        g.drawLine(xPoints[1], yPoints[1], xPoints[3], yPoints[3]);
        g.drawLine(xPoints[3], yPoints[3], xPoints[0], yPoints[0]);
    }

    public static void main(String[] args) {
        // Create a JFrame to hold the JPanel
        JFrame frame = new JFrame("Pentagram Inside Circle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Create an instance of the PentagramInCircle JPanel
        PentagramInCircle panel = new PentagramInCircle();
        frame.add(panel);

        // Make the frame visible
        frame.setVisible(true);
    }
}