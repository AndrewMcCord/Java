//Problem 3.1
import java.awt.*;
import javax.swing.*;

public class FanDrawing extends JFrame {

    public FanDrawing() {
        // Set up the frame
        setTitle("Fan with Six Blades");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400); // Window size
        setLocationRelativeTo(null); // Center the window

        // Add a custom panel to draw the fan
        add(new FanPanel());
    }

    // Custom panel class to draw the fan
    class FanPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // Cast to Graphics2D for better control
            Graphics2D g2d = (Graphics2D) g;

            // Set the center of the fan and its radius
            int centerX = getWidth() / 2; // Center X of the panel
            int centerY = getHeight() / 2; // Center Y of the panel
            int radius = 100; // Radius of the fan

            // Number of blades and angle per blade
            int numBlades = 6;
            int bladeAngle = 360 / numBlades; // Angle for each blade (60 degrees)
            int bladeWidth = 30; // Angle width of each blade (adjust for thickness)

            // Draw the blades
            g2d.setColor(Color.RED); // Set blade color to red
            for (int i = 0; i < numBlades; i++) {
                int startAngle = i * bladeAngle; // Starting angle for each blade
                g2d.fillArc(centerX - radius, centerY - radius, 2 * radius, 2 * radius, startAngle, bladeWidth);
            }

            // Draw the outer circle
            g2d.setColor(Color.BLUE); // Set circle color to blue
            g2d.setStroke(new BasicStroke(1)); // Set the thickness of the circle line
            g2d.drawOval(centerX - radius, centerY - radius, 2 * radius, 2 * radius);
        }
    }

    public static void main(String[] args) {
        // Run the GUI on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            FanDrawing frame = new FanDrawing();
            frame.setVisible(true);
        });
    }
}