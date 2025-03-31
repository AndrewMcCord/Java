import java.awt.*;
import javax.swing.*;

public class olympics extends JFrame {
  public olympics() {
    add(new NewPanel());
  }

  public static void main(String[] args) {
    olympics frame = new olympics();
    frame.setTitle("Winter olympics 2014 Sochi, Russia");
    frame.setSize(200, 400);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}

class NewPanel extends JPanel {
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    // Draw the first row of circles
    //g.setColor(0, 0, 255);    // Blue
    g.setColor(Color.BLUE);
    g.drawArc(5, 85, 25, 25, 0, 360);
    //g.setColor(0, 0, 0);      // Black
    g.setColor(Color.BLACK);
    g.drawArc(35, 85, 25, 25, 0, 360);
    //g.setColor(255, 0, 0);    // Red
    g.setColor(Color.RED);
    g.drawArc(65, 85, 25, 25, 0, 360);

    // Draw the second row of circles
    //g.setColor(255, 255, 0);  // Yellow
    g.setColor(Color.YELLOW);
    g.drawArc(20, 100, 25, 25, 0, 360);
    //g.setColor(0, 255, 0);    // Green
    g.setColor(Color.GREEN);
    g.drawArc(50, 100, 25, 25, 0, 360);



    // Draw the first row of circles
    //g.setColor(0, 0, 255);    // Blue
    g.setColor(Color.BLUE);
    g.drawArc(5, 150, 25, 25, 0, 360);
    //g.setColor(0, 0, 0);      // Black
    g.setColor(Color.BLACK);
    g.drawArc(35, 150, 25, 25, 0, 360);
    //g.setColor(255, 0, 0);    // Red
    //g.setColor(Color.RED);
    //g.drawArc(65, 150, 25, 25, 0, 360);

    // Draw the second row of circles
    //g.setColor(255, 255, 0);  // Yellow
    g.setColor(Color.YELLOW);
    g.drawArc(20, 165, 25, 25, 0, 360);
    //g.setColor(0, 255, 0);    // Green
    g.setColor(Color.GREEN);
    g.drawArc(50, 165, 25, 25, 0, 360);





   // g.drawLine(0, 0, 50, 50);
   // g.drawString("Banner", 0, 40);
  }
}
