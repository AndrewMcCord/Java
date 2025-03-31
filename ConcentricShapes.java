// Question 1
import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class ConcentricShapes extends JFrame {
    public ConcentricShapes() {
        // Set up the JFrame
        setTitle("Concentric Circles and Squares");
        setSize(600, 600); // Window size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); // Call the superclass's paint method to clear the window
        Graphics2D g2d = (Graphics2D) g; // Cast to Graphics2D for better control
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); // Smooth edges

        Random rand = new Random(); // For random colors

        // Center of the window
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        // Initial size of the largest square (and circle diameter)
        int size = 400;
        // Difference in size between adjacent pairs (horizontal/vertical distance)
        int sizeDecrement = 80;

        // Draw 5 pairs of circles and squares
        for (int i = 0; i < 5; i++) {
            // Generate random colors for the square and circle
            Color squareColor = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
            Color circleColor = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));

            // Draw the square
            g2d.setColor(squareColor);
            int squareX = centerX - size / 2; // Top-left x-coordinate
            int squareY = centerY - size / 2; // Top-left y-coordinate
            g2d.drawRect(squareX, squareY, size, size);

            // Draw the circle (inscribed in the square, so diameter = size)
            g2d.setColor(circleColor);
            g2d.drawOval(squareX, squareY, size, size); // Circle with diameter = size

            // Decrease the size for the next pair
            size -= sizeDecrement;
        }
    }

    public static void main(String[] args) {
        // Create and display the window
        SwingUtilities.invokeLater(() -> {
            ConcentricShapes frame = new ConcentricShapes();
            frame.setVisible(true);
        });
    }
}