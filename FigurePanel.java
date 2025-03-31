//FigurePanel.java

//package chapter15;

import java.awt.*;
import javax.swing.JPanel;

public class FigurePanel extends JPanel {
  // Define constants
  public static final int LINE = 1;
  public static final int RECTANGLE = 2;
  public static final int ROUND_RECTANGLE = 3;
  public static final int OVAL = 4;
  public static final int ARC = 5;
  public static final int FILLED_ARC = 6;
  public static final int POLYGON = 7;
  public static final int OCTAGON = 8;
  public static final int FILLED_POLYGON = 9;
  private int type = 1;
  private boolean filled;

  /** Construct a default FigurePanel */
  public FigurePanel() {
  }

  /** Construct a FigurePanel with the specified type */
  public FigurePanel(int type) {
    this.type = type;
  }

  /** Construct a FigurePanel with the specified type and filled */
  public FigurePanel(int type, boolean filled) {
    this.type = type;
    this.filled = filled;
  }

  /** Draw a figure on the panel */
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    // Get the appropriate size for the figure
    int width = getWidth();
    int height = getHeight();

    switch (type) {
      case LINE: // Display two cross lines
        g.setColor(Color.BLACK);
        g.drawLine(10, 10, width - 10, height - 10);
        g.drawLine(width - 10, 10, 10, height - 10);
        break;
      case RECTANGLE: // Display a rectangle
        g.setColor(Color.BLUE);
        if (filled)
          g.fillRect((int)(0.1 * width), (int)(0.1 * height),
            (int)(0.8 * width), (int)(0.8 * height));
        else
          g.drawRect((int)(0.1 * width), (int)(0.1 * height),
            (int)(0.8 * width), (int)(0.8 * height));
        break;
      case ROUND_RECTANGLE: // Display a round-cornered rectangle
        g.setColor(Color.RED);
        if (filled)
          g.fillRoundRect((int)(0.1 * width), (int)(0.1 * height),
            (int)(0.8 * width), (int)(0.8 * height), 20, 20);
        else
          g.drawRoundRect((int)(0.1 * width), (int)(0.1 * height),
            (int)(0.8 * width), (int)(0.8 * height), 20, 20);
        break;
      case OVAL: // Display an oval
        g.setColor(Color.BLACK);
        if (filled)
          g.fillOval((int)(0.1 * width), (int)(0.1 * height),
            (int)(0.8 * width), (int)(0.8 * height));
        else
          g.drawOval((int)(0.1 * width), (int)(0.1 * height),
            (int)(0.8 * width), (int)(0.8 * height));
        case ARC: // Display arcs (like blades of a fan)
            g.setColor(Color.BLACK);
            int xCenter = width / 2;
            int yCenter = height / 2;
            int radius = (int)(Math.min(width, height) * 0.4);
            int x = xCenter - radius;
            int y = yCenter - radius;

            g.drawArc(x, y, 2 * radius, 2 * radius, 0, 30);
            g.drawArc(x, y, 2 * radius, 2 * radius, 90, 30);
            g.drawArc(x, y, 2 * radius, 2 * radius, 180, 30);
            g.drawArc(x, y, 2 * radius, 2 * radius, 270, 30);
            break;
        case FILLED_ARC: // Display filled arcs (like blades of a fan)
            g.setColor(Color.BLUE);
            int xCenter2 = width / 2;
            int yCenter2 = height / 2;
            int radius2 = (int)(Math.min(width, height) * 0.4);
            int x2 = xCenter2 - radius2;
            int y2 = yCenter2 - radius2;
            g.drawOval((int)(0.1 * width), (int)(0.1 * height),
            (int)(0.8 * width), (int)(0.8 * height));
            g.fillArc(x2, y2, 2 * radius2, 2 * radius2, 0, 30);
            g.drawOval((int)(0.1 * width), (int)(0.1 * height),
            (int)(0.8 * width), (int)(0.8 * height));
            g.fillArc(x2, y2, 2 * radius2, 2 * radius2, 60, 30);
            g.drawOval((int)(0.1 * width), (int)(0.1 * height),
            (int)(0.8 * width), (int)(0.8 * height));
            g.fillArc(x2, y2, 2 * radius2, 2 * radius2, 120, 30);
            g.drawOval((int)(0.1 * width), (int)(0.1 * height),
            (int)(0.8 * width), (int)(0.8 * height));
            g.fillArc(x2, y2, 2 * radius2, 2 * radius2, 180, 30);
            g.drawOval((int)(0.1 * width), (int)(0.1 * height),
            (int)(0.8 * width), (int)(0.8 * height));
            g.fillArc(x2, y2, 2 * radius2, 2 * radius2, 240, 30);
            g.drawOval((int)(0.1 * width), (int)(0.1 * height),
            (int)(0.8 * width), (int)(0.8 * height));
            g.fillArc(x2, y2, 2 * radius2, 2 * radius2, 300, 30);
            break;
        case POLYGON: // Display a polygon
        g.setColor(Color.BLACK);
        int xCenter3 = getWidth() / 2;
        int yCenter3 = getHeight() / 2;
        int radius3 = (int)(Math.min(getWidth(), getHeight()) * 0.4);
    
        // Create a Polygon object
        Polygon polygon = new Polygon();
    
        // Add points to the polygon
        polygon.addPoint(xCenter3 + radius3, yCenter3);
        polygon.addPoint((int)(xCenter3 + radius3 *
          Math.cos(2 * Math.PI / 6)), (int)(yCenter3 - radius3 *
          Math.sin(2 * Math.PI / 6)));
        polygon.addPoint((int)(xCenter3 + radius3 *
          Math.cos(2 * 2 * Math.PI / 6)), (int)(yCenter3 - radius3 *
          Math.sin(2 * 2 * Math.PI / 6)));
        polygon.addPoint((int)(xCenter3 + radius3 *
          Math.cos(3 * 2 * Math.PI / 6)), (int)(yCenter3 - radius3 *
          Math.sin(3 * 2 * Math.PI / 6)));
        polygon.addPoint((int)(xCenter3 + radius3 *
          Math.cos(4 * 2 * Math.PI / 6)), (int)(yCenter3 - radius3 *
          Math.sin(4 * 2 * Math.PI / 6)));
        polygon.addPoint((int)(xCenter3 + radius3 *
          Math.cos(5 * 2 * Math.PI / 6)), (int)(yCenter3 - radius3 *
          Math.sin(5 * 2 * Math.PI / 6)));
          double scaleFactor = 0.1;
        for (int x1 = -100; x1 <= 100; x1++) {
          polygon.addPoint(x1 + 200, 200 - (int)(scaleFactor * x1 * x1));
        }
          g.drawPolygon(polygon);
            break;
        case OCTAGON:
        g.setColor(Color.BLACK);
        int xCenter4 = getWidth() / 2;
        int yCenter4 = getHeight() / 2;
        int radius4 = (int)(Math.min(getWidth(), getHeight()) * 0.4);
    
        // Create a Polygon object
        Polygon polygon1 = new Polygon();
    
        // Add points to the polygon
        polygon1.addPoint(xCenter4 + radius4, yCenter4);
        polygon1.addPoint((int)(xCenter4 + radius4 *
          Math.cos(2 * Math.PI / 8)), (int)(yCenter4 - radius4 *
          Math.sin(2 * Math.PI / 8)));
        polygon1.addPoint((int)(xCenter4 + radius4 *
          Math.cos(2 * 2 * Math.PI / 8)), (int)(yCenter4 - radius4 *
          Math.sin(2 * 2 * Math.PI / 8)));
        polygon1.addPoint((int)(xCenter4 + radius4 *
          Math.cos(3 * 2 * Math.PI / 8)), (int)(yCenter4 - radius4 *
          Math.sin(3 * 2 * Math.PI / 8)));
        polygon1.addPoint((int)(xCenter4 + radius4 *
          Math.cos(4 * 2 * Math.PI / 8)), (int)(yCenter4 - radius4 *
          Math.sin(4 * 2 * Math.PI / 8)));
        polygon1.addPoint((int)(xCenter4 + radius4 *
          Math.cos(5 * 2 * Math.PI / 8)), (int)(yCenter4 - radius4 *
          Math.sin(5 * 2 * Math.PI / 8)));
        polygon1.addPoint((int)(xCenter4 + radius4 *
          Math.cos(6 * 2 * Math.PI / 8)), (int)(yCenter4 - radius4 *
          Math.sin(6 * 2 * Math.PI / 8)));
        polygon1.addPoint((int)(xCenter4 + radius4 *
          Math.cos(7 * 2 * Math.PI / 8)), (int)(yCenter4 - radius4 *
          Math.sin(7 * 2 * Math.PI / 8)));
          g.drawPolygon(polygon1);
            break;
        case FILLED_POLYGON: // Display a filled polygon
        g.setColor(Color.BLACK);
       int xCenter5 = getWidth() / 2;
       int yCenter5 = getHeight() / 2;
       int radius5 = (int)(Math.min(getWidth(), getHeight()) * 0.4);
    
        // Create a Polygon object
        Polygon polygon2 = new Polygon();
    
        // Add points to the polygon
        polygon2.addPoint(xCenter5 + radius5, yCenter5);
        polygon2.addPoint((int)(xCenter5 + radius5 *
          Math.cos(2 * Math.PI / 6)), (int)(yCenter5 - radius5 *
          Math.sin(2 * Math.PI / 6)));
        polygon2.addPoint((int)(xCenter5 + radius5 *
          Math.cos(2 * 2 * Math.PI / 6)), (int)(yCenter5 - radius5 *
          Math.sin(2 * 2 * Math.PI / 6)));
        polygon2.addPoint((int)(xCenter5 + radius5 *
          Math.cos(3 * 2 * Math.PI / 6)), (int)(yCenter5 - radius5 *
          Math.sin(3 * 2 * Math.PI / 6)));
        polygon2.addPoint((int)(xCenter5 + radius5 *
          Math.cos(4 * 2 * Math.PI / 6)), (int)(yCenter5 - radius5 *
          Math.sin(4 * 2 * Math.PI / 6)));
        polygon2.addPoint((int)(xCenter5 + radius5 *
          Math.cos(5 * 2 * Math.PI / 6)), (int)(yCenter5 - radius5 *
          Math.sin(5 * 2 * Math.PI / 6)));
          g.fillPolygon(polygon2);
            break;
    }
  }

  /** Set a new figure type */
  public void setType(int type) {
    this.type = type;
    repaint();
  }

  /** Return figure type */
  public int getType() {
    return type;
  }

  /** Set a new filled property */
  public void setFilled(boolean filled) {
    this.filled = filled;
    repaint();
  }

  /** Check if the figure is filled */
  public boolean isFilled() {
    return filled;
  }

  /** Specify preferred size */
  public Dimension getPreferredSize() {
    return new Dimension(80, 80);
  }
}
