//Problem 6
import java.awt.*;
import javax.swing.*;

public class ImageDisplay extends JFrame {

    public ImageDisplay() {
        // Set the title of the window
        setTitle("4x4 Image Grid");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600); // Set the size of the window
        setLocationRelativeTo(null); // Center the window on the screen

        // Create a panel with a 4x4 grid layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5)); // 4 rows, 4 columns, with 5px gaps

        // Load the two images (replace with actual file paths)
        ImageIcon image1 = new ImageIcon("image/norway.gif"); // First image
        ImageIcon image2 = new ImageIcon("image/fr.gif"); // Second image

        // Add images to the grid in an alternating pattern
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // Use (i + j) % 2 to alternate between the two images
                ImageIcon selectedImage = ((i + j) % 2 == 0) ? image1 : image2;
                JLabel label = new JLabel(selectedImage);
                panel.add(label); // Add the label with the image to the panel
            }
        }

        // Add the panel to the frame
        add(panel);
    }

    public static void main(String[] args) {
        // Run the GUI on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            ImageDisplay frame = new ImageDisplay();
            frame.setVisible(true); // Make the window visible
        });
    }
}