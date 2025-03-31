import java.awt.*;
import javax.swing.*;

public class QuadraticFunctionGraph extends JFrame {
    public QuadraticFunctionGraph() {
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(new DrawXSquare(), BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        HW3NO4 frame = new HW3NO4();
        frame.setSize(400, 400);
        frame.setTitle("HW3NO4");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    class DrawXSquare extends JPanel {
        double f(double x) { return x * x; }
        double g(double x) { return 0.5 * x * x; }
        double h(double x) { return 1.5 * x * x; }

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            // Draw axes
            g.drawLine(10, 200, 390, 200);
            g.drawLine(200, 30, 200, 390);
            
            // Draw arrows
            g.drawLine(390, 200, 370, 190);
            g.drawLine(390, 200, 370, 210);
            g.drawLine(200, 30, 190, 50);
            g.drawLine(200, 30, 210, 50);
            
            // Draw labels
            g.drawString("X", 390, 170);
            g.drawString("Y", 220, 40);
            
            // Draw each function with different colors
            double scaleFactor = 0.1;  // Increased scale for better visibility
            
            // f(x) in black
            Polygon p1 = new Polygon();
            for (int x = -100; x <= 100; x++) {
                p1.addPoint(x + 200, 200 - (int)(scaleFactor * f(x)));
            }
            g.setColor(Color.BLACK);
            g.drawPolyline(p1.xpoints, p1.ypoints, p1.npoints);
            
            // g(x) in red
            Polygon p2 = new Polygon();
            for (int x = -100; x <= 100; x++) {
                p2.addPoint(x + 200, 200 - (int)(scaleFactor * g(x)));
            }
            g.setColor(Color.BLACK);
            g.drawPolyline(p2.xpoints, p2.ypoints, p2.npoints);
            
            // h(x) in blue
            Polygon p3 = new Polygon();
            for (int x = -100; x <= 100; x++) {
                p3.addPoint(x + 200, 200 - (int)(scaleFactor * h(x)));
            }
            g.setColor(Color.BLACK);
            g.drawPolyline(p3.xpoints, p3.ypoints, p3.npoints);
        }
    }
}