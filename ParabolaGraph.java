import java.awt.*;
import javax.swing.*;

public class ParabolaGraph extends JFrame {
    public ParabolaGraph() {
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(new DrawXSquare(), BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        ParabolaGraph frame = new ParabolaGraph();
        frame.setSize(400, 400);
        frame.setTitle("HW3NO4");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }

    // Inner class
    class DrawXSquare extends JPanel {
        // Function f(x) = x^2
        double f(double x) {
            return x * x;
        }

        // Function g(x) = 1.5x^2
        double g(double x) {
            return 1.5 * x * x;
        }

        // Function h(x) = 0.5x^2
        double h(double x) {
            return 0.5 * x * x;
        }

        // Draw the functions
        public void drawFunction() {
            repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // Set the background color
            setBackground(Color.WHITE);

            // Draw the x and y axes
            g.setColor(Color.BLACK);
            g.drawLine(10, 200, 390, 200); // x-axis
            g.drawLine(200, 30, 200, 390); // y-axis

            // Draw arrows
            g.drawLine(390, 200, 370, 190); // x-axis right arrow
            g.drawLine(390, 200, 370, 210); // x-axis right arrow
            g.drawLine(200, 30, 190, 50); // y-axis top arrow
            g.drawLine(200, 30, 210, 50); // y-axis top arrow

            // Draw x, y axes labels
            g.drawString("X", 390, 170);
            g.drawString("Y", 220, 40);

            // Draw the functions f(x) = x^2, g(x) = 1.5x^2, and h(x) = 0.5x^2
            double scaleFactor = 0.5; // Adjusted scale factor for better visibility

            // Plot f(x) = x^2 in blue
            Polygon p1 = new Polygon();
            g.setColor(Color.BLUE);
            for (int x = -100; x <= 100; x++) {
                p1.addPoint(x + 200, 200 - (int)(scaleFactor * f(x)));
            }
            g.drawPolyline(p1.xpoints, p1.ypoints, p1.npoints);

            // Plot g(x) = 1.5x^2 in red
            Polygon p2 = new Polygon();
            g.setColor(Color.RED);
            for (int x = -100; x <= 100; x++) {
                p2.addPoint(x + 200, 200 - (int)(scaleFactor * g(x)));
            }
            g.drawPolyline(p2.xpoints, p2.ypoints, p2.npoints);

            // Plot h(x) = 0.5x^2 in green
            Polygon p3 = new Polygon();
            g.setColor(Color.GREEN);
            for (int x = -100; x <= 100; x++) {
                p3.addPoint(x + 200, 200 - (int)(scaleFactor * h(x)));
            }
            g.drawPolyline(p3.xpoints, p3.ypoints, p3.npoints);
        }
    }
}