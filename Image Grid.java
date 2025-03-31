import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImageGrid extends JFrame {
    private JLabel[][] gridLabels;
    private ImageIcon image1;
    private ImageIcon image2;
    private boolean toggle;

    public ImageGrid() {
        // Set up the JFrame
        setTitle("4x4 Image Grid");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 4));

        // Load the images
        image1 = new ImageIcon("path/to/your/image1.jpg"); // Replace with your image path
        image2 = new ImageIcon("path/to/your/image2.jpg"); // Replace with your image path

        // Initialize the grid
        gridLabels = new JLabel[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                gridLabels[i][j] = new JLabel();
                gridLabels[i][j].setHorizontalAlignment(JLabel.CENTER);
                gridLabels[i][j].setVerticalAlignment(JLabel.CENTER);
                add(gridLabels[i][j]);
            }
        }

        // Set initial images
        toggle = true;
        updateGrid();

        // Timer to toggle images every 2 seconds
        Timer timer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toggle = !toggle;
                updateGrid();
            }
        });
        timer.start();
    }

    private void updateGrid() {
        ImageIcon currentImage = toggle ? image1 : image2;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                gridLabels[i][j].setIcon(currentImage);
            }
        }
    }

    public static void main(String[] args) {
        // Run the program
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ImageGrid().setVisible(true);
            }
        });
    }
}