import java.awt.*;
import javax.swing.*;

public class TlcTacToeBoard extends JFrame {

    public TlcTacToeBoard() {
        setTitle("Random Tic-Tac-Toe Board");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create a 3x3 grid layout for the Tic-Tac-Toe board
        setLayout(new GridLayout(3, 3));

        // Add 9 panels to the frame
        for (int i = 0; i < 9; i++) {
            add(new TicTacToePanel());
        }
    }

    // Custom JPanel to display X, O, or nothing
    class TicTacToePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // Randomly decide what to display: 0 = X, 1 = O, 2 = nothing
            int choice = (int) (Math.random() * 3);

            // Draw X, O, or nothing based on the random choice
            switch (choice) {
                case 0:
                label.setIcon(crossIcon);
                    break;
                case 1:
                label.setIcon(crossIcon);
                    break;
                // case 2: do nothing
            }
        }

        // Helper method to draw X
        private void drawX(Graphics g) {
            g.drawLine(10, 10, getWidth() - 10, getHeight() - 10);
            g.drawLine(getWidth() - 10, 10, 10, getHeight() - 10);
        }

        // Helper method to draw O
        private void drawO(Graphics g) {
            g.drawOval(10, 10, getWidth() - 20, getHeight() - 20);
        }
    }

    public static void main(String[] args) {
        // Run the GUI on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            TlcTacToeBoard board = new TlcTacToeBoard();
            board.setVisible(true);
        });
    }
}