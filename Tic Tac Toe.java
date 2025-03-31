import javax.swing.*;
import java.awt.GridLayout;
import java.util.Random;

public class RandomTicTacToe {

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Random Tic-Tac-Toe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(new GridLayout(3, 3));

        // Load the image icons
        ImageIcon crossIcon = new ImageIcon("X.png");
        ImageIcon circleIcon = new ImageIcon("O.gif");

        // Create a random number generator
        Random random = new Random();

        // Create and add 9 labels to the frame
        for (int i = 0; i < 9; i++) {
            JLabel label = new JLabel();
            int randomValue = random.nextInt(3); // Generates 0, 1, or 2

            switch (randomValue) {
                case 0:
                    label.setIcon(crossIcon);
                    break;
                case 1:
                    label.setIcon(circleIcon);
                    break;
                case 2:
                    // No icon, leave label empty
                    break;
            }

            frame.add(label);
        }

        // Display the frame
        frame.setVisible(true);
    }
}