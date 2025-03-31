import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DraggableComponents extends JFrame {
    private int imageX = 50; // Initial X position of the image
    private int imageY = 50; // Initial Y position of the image
    private int circleX = 50; // Initial X position of the circle
    private int circleY = 150; // Initial Y position of the circle
    private int offsetX, offsetY; // To store the offset during dragging
    private boolean isDragging = false; // To track if dragging is happening
    private ImageIcon image; // The image to display

    public DraggableComponents() {
        // Set up the frame
        setTitle("Draggable Components");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400); // Window size
        setLocationRelativeTo(null); // Center the window

        // Load the image (replace with the actual file path)
        image = new ImageIcon("path/to/image.jpg");

        // Check if the image loaded successfully
        if (image.getImageLoadStatus() != MediaTracker.COMPLETE) {
            System.out.println("Error loading image. Please check the file path.");
        }

        // Create a custom panel to draw the components
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                // Draw the first string ("This is Senator McCain") above the image
                g.setFont(new Font("Arial", Font.PLAIN, 14));
                g.drawString("This is Senator McCain", imageX, imageY - 10);

                // Draw the image
                image.paintIcon(this, g, imageX, imageY);

                // Draw the circle
                g.setColor(Color.BLACK);
                g.drawOval(circleX, circleY, 50, 50); // Circle with diameter 50

                // Draw the second string ("This is a circle") below the circle
                g.drawString("This is a circle", circleX, circleY + 70);
            }
        };

        // Add mouse listener for clicking
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                // Check if the mouse is pressed within the bounds of the image or circle
                if (e.getX() >= imageX && e.getX() <= imageX + image.getIconWidth() &&
                    e.getY() >= imageY && e.getY() <= imageY + image.getIconHeight() ||
                    e.getX() >= circleX && e.getX() <= circleX + 50 &&
                    e.getY() >= circleY && e.getY() <= circleY + 50) {
                    isDragging = true;
                    // Calculate the offset between the mouse click and the top-left of the image
                    offsetX = e.getX() - imageX;
                    offsetY = e.getY() - imageY;
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                isDragging = false; // Stop dragging when the mouse is released
            }
        });

        // Add mouse motion listener for dragging
        panel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (isDragging) {
                    // Update the position of the image based on the mouse position
                    imageX = e.getX() - offsetX;
                    imageY = e.getY() - offsetY;

                    // Update the position of the circle relative to the image
                    circleX = imageX;
                    circleY = imageY + 100; // Keep the circle 100 pixels below the image

                    // Repaint the panel to reflect the new positions
                    panel.repaint();
                }
            }
        });

        // Add the panel to the frame
        add(panel);
    }

    public static void main(String[] args) {
        // Run the GUI on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            DraggableComponents frame = new DraggableComponents();
            frame.setVisible(true);
        });
    }
}