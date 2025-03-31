import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BallMovement extends JFrame
{
    private BallPanel ballPanel;

public BallMovement()
{
    // Set up the JFrame
    setTitle("Ball Movement");
    setSize(600, 400); // Window size
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null); // Center the window

    // Create the panel for the ball
    ballPanel = new BallPanel();
    ballPanel.setBackground(Color.LIGHT_GRAY); // Match the background color in the image
    add(ballPanel, BorderLayout.CENTER);

    // Create a panel for the buttons
    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new FlowLayout());

    // Create buttons
    JButton leftButton = new JButton("LEFT");
    JButton rightButton = new JButton("RIGHT");
    JButton upButton = new JButton("UP");
    JButton downButton = new JButton("DOWN");

    // Add action listeners to the buttons
    leftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
{
    ballPanel.moveLeft();
}
        });

rightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
{
    ballPanel.moveRight();
}
        });

upButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
{
    ballPanel.moveUp();
}
        });

downButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
{
    ballPanel.moveDown();
}
        });

// Add buttons to the button panel
buttonPanel.add(leftButton);
buttonPanel.add(rightButton);
buttonPanel.add(upButton);
buttonPanel.add(downButton);

// Add the button panel to the frame
add(buttonPanel, BorderLayout.SOUTH);
    }

    // Custom panel class to display and move the ball
    class BallPanel extends JPanel
{
        private int ballX = 50; // Initial x-coordinate of the ball
private int ballY = 50; // Initial y-coordinate of the ball
private final int ballDiameter = 30; // Diameter of the ball
private final int moveStep = 10; // Distance to move per button click

@Override
        protected void paintComponent(Graphics g)
{
    super.paintComponent(g); // Clear the panel
    Graphics2D g2d = (Graphics2D)g;
    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

    // Draw the ball
    g2d.setColor(Color.RED); // Red ball as shown in the image
    g2d.fillOval(ballX, ballY, ballDiameter, ballDiameter);
}

// Move the ball left
public void moveLeft()
{
    if (ballX - moveStep >= 0)
    { // Check left boundary
        ballX -= moveStep;
        repaint(); // Redraw the panel
    }
}

// Move the ball right
public void moveRight()
{
    if (ballX + ballDiameter + moveStep <= getWidth())
    { // Check right boundary
        ballX += moveStep;
        repaint();
    }
}

// Move the ball up
public void moveUp()
{
    if (ballY - moveStep >= 0)
    { // Check top boundary
        ballY -= moveStep;
        repaint();
    }
}

// Move the ball down
public void moveDown()
{
    if (ballY + ballDiameter + moveStep <= getHeight())
    { // Check bottom boundary
        ballY += moveStep;
        repaint();
    }
}
    }

    public static void main(String[] args)
{
    // Create and display the window
    SwingUtilities.invokeLater(()-> {
        BallMovement frame = new BallMovement();
        frame.setVisible(true);
    });
}
}