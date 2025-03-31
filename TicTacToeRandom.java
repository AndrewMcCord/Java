//*******************************************************************  

 
//Problem 1 in homework 3 *  

 
// Programmer: Andrew McCord *  

 
// Due: 3/18/25 *  


// Program file name: TicTacToeRandom.java *  


// A brief description of your program //*******************************************************************  
import javax.swing.*;
import java.awt.*;

public class TicTacToeRandom extends JFrame {

    public TicTacToeRandom() {
        // Set up the frame
        setTitle("TicTacToe Random Display");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300); // Set the size of the frame

        // Create a GridLayout with 3 rows and 3 columns, with no gaps
        setLayout(new GridLayout(3, 3, 0, 0)); // 0px gap between cells

        // Add nine TicTacToePanel instances to the frame
        for (int i = 0; i < 9; i++) {
            add(new TicTacToePanel());
        }
    }

    // Custom panel to draw X, O, or nothing
    class TicTacToePanel extends JPanel {
        private int state; // 0 for X, 1 for O, 2 for nothing

        public TicTacToePanel() {
            // No border is set, so there will be no boundaries between panels
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // Randomly decide what to display: 0 (X), 1 (O), or 2 (nothing)
            state = (int) (Math.random() * 3); // Generates 0, 1, or 2

            // Get the dimensions of the panel
            int width = getWidth();
            int height = getHeight();
            int padding = 10; // Padding from the edges

            // Draw based on the state
            if (state == 0) { // Draw X
                g.setColor(Color.BLACK);
                g.drawLine(padding, padding, width - padding, height - padding);
                g.drawLine(width - padding, padding, padding, height - padding);
            } else if (state == 1) { // Draw O
                g.setColor(Color.BLACK);
                int diameter = Math.min(width, height) - 2 * padding;
                g.drawOval(padding, padding, diameter, diameter);
            }
            // If state == 2, draw nothing (leave the panel empty)
        }
    }

    public static void main(String[] args) {
        // Run the application on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            TicTacToeRandom frame = new TicTacToeRandom();
            frame.setVisible(true);
        });
    }
}