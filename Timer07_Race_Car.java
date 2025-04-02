import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Timer07_Race_Car extends JFrame {

  public Timer07_Race_Car() {

    add(new RaceCar());

  }

  /** Main method */
  public static void main(String[] args) {

    Timer07_Race_Car frame = new Timer07_Race_Car();
    frame.setTitle("Timer07_Race_Car");
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600, 200);
    frame.setVisible(true);

  }
}

// Displaying a moving car
class RaceCar extends JPanel {

  private int xBase = 0;

  public RaceCar() {
    // Create a timer for the listener raceCar
    Timer timer = new Timer(8, new Listener());
    timer.start();
  }

  /** Handle ActionEvent */
  class Listener implements ActionListener {

  public void actionPerformed(ActionEvent e) {
    	repaint();
  	}
  }

  /** Paint message */
  public void paintComponent(Graphics g) {

    super.paintComponent(g);

    int yBase = getHeight();

    if (xBase > getWidth())
        xBase = -20;
    else
        xBase += 1;

    // Draw two wheels
    g.setColor(Color.BLACK);
    g.fillOval(xBase + 10, yBase - 10, 10, 10);
    g.fillOval(xBase + 30, yBase - 10, 10, 10);

    // Draw the car body
    g.setColor(Color.GREEN);
    g.fillRect(xBase, yBase - 20, 50, 10);

    // Draw the top
    g.setColor(Color.RED);
    Polygon polygon = new Polygon();
    polygon.addPoint(xBase + 10, yBase - 20);
    polygon.addPoint(xBase + 20, yBase - 30);
    polygon.addPoint(xBase + 30, yBase - 30);
    polygon.addPoint(xBase + 40, yBase - 20);
    g.fillPolygon(polygon);

  }
}
