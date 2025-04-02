
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Timer06_Fan extends JFrame {
  public Timer06_Fan() {

        add(new Fan());
  }

  // Main method
  public static void main(String[] args) {

    // Create a frame
    Timer06_Fan frame = new Timer06_Fan();
    frame.setTitle("Timer06_Fan: Running Fan");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Display the frame
    frame.setSize(500, 500);
    frame.setVisible(true);

  }
}


class Fan extends JPanel  {

  private int xCenter, yCenter;
  private int fanRadius, bladeLength;
  private int angle = 0;
  private int direction = 10;
  private int speed = 20;
  protected Timer timer = new Timer(speed, new Listener());

  public Fan() {
    timer.start();
  }

  public void paintComponent(Graphics g) {

    super.paintComponent(g);

    // Set clock radius, and center
    fanRadius = (int)(Math.min(getWidth(), getHeight())*0.9*0.5);
    xCenter = getWidth()/2;
    yCenter = getHeight()/2;
    bladeLength = (int)(fanRadius*0.9);

    //draw circle
    g.setColor(Color.black);
    g.drawOval(xCenter - fanRadius,yCenter - fanRadius,
      2*fanRadius, 2*fanRadius);

    //draw four blades
    drawBlade(g, angle);
    drawBlade(g, angle+90);
    drawBlade(g, angle+180);
    drawBlade(g, angle+270);

    angle = (angle + direction)%360;
  }

  private void drawBlade(Graphics g, int angle) {
    g.setColor(Color.red);
    g.fillArc(xCenter-bladeLength, yCenter-bladeLength,
      2*bladeLength, 2*bladeLength, angle, 30);
  }

  class Listener implements ActionListener {

  public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
        repaint();
     }
  }
}