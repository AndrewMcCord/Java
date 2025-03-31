import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Image1Grid extends JFrame {
    private JLabel[][] gridLabels;
    private ImageIcon image1;
    private ImageIcon image2;
    private boolean toggle;

    public Image1Grid() {
        // Set up the JFrame
        setTitle("4x4 Image Grid");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 4));

        // Load the images
        image1 = new ImageIcon("image/uk.gif"); // Replace with your image path
        image2 = new ImageIcon("image/us.gif"); // Replace with your image path

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
                new Image1Grid().setVisible(true);
            }
        });
    }
}