//Problem 2 
import java.awt.*;
import javax.swing.*;

public class HW3NO4 extends JFrame {
  public HW3NO4() {
    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(new DrawXSquare(), BorderLayout.CENTER);
  }

  public static void main(String[] args) {
    HW3NO4 frame = new HW3NO4();
    frame.setSize(400, 400);
    frame.setTitle("HW3NO4");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setVisible(true);
  }

  // Inner class
  class DrawXSquare extends JPanel {
    double f(double x) {
      double values =(x*x);
      return values;
    }
   double g(double x) {
    double values =(0.5*x*x);
     return values;
   }
   double h(double x) {
   double values =(1.5*x*x);
     return values;
    }
    public void drawFunction() {
      repaint();
    }
  
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);

      g.drawLine(10, 200, 390, 200);
      g.drawLine(200, 30, 200, 390);

      // Draw arrows
      g.drawLine(390, 200, 370, 190);
      g.drawLine(390, 200, 370, 210);
      g.drawLine(200, 30, 190, 50);
      g.drawLine(200, 30, 210, 50);

      // Draw x, y axises
      g.drawString("X", 390, 170);
      g.drawString("Y", 220, 40);

      // Draw function
      Polygon p = new Polygon();

      double scaleFactor = 0.01;

      for (int x = -100; x <= 100; x++) {
        p.addPoint(x + 200, 200 - (int)(scaleFactor * f(x)));
      }
      Polygon p1 = new Polygon();
      for (int x = -100; x <= 100; x++) {
       p1.addPoint(x + 200, 200 - (int)(scaleFactor * g(x)));
     }
     Polygon p2 = new Polygon();
      for (int x = -100; x <= 100; x++) {
      p2.addPoint(x + 200, 200 - (int)(scaleFactor * h(x)));
     }

      g.drawPolyline(p.xpoints, p.ypoints, p.npoints);
      g.drawPolyline(p1.xpoints, p1.ypoints, p1.npoints);
      g.drawPolyline(p2.xpoints, p2.ypoints, p2.npoints);
    }
  }
}
