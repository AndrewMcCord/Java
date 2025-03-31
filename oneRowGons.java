

import javax.swing.*;
import java.awt.*;

public class oneRowGons extends JFrame {
  public oneRowGons() {

    setLayout(new GridLayout(1, 8));
    for (int i = 3; i < 11; i++)
      add(new PolygonsPanel(i));
  }

  public static void main(String[] args) {
    oneRowGons frame = new oneRowGons();
    frame.setTitle("One Row Gons");
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1500, 200);
    frame.setVisible(true);
  }
}

// Draw a polygon in the panel
  class PolygonsPanel extends JPanel {

  int n;

  PolygonsPanel(int t)
  {
  	n = t;
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    int xCenter = getWidth() / 2;
    int yCenter = getHeight() / 2;
    int radius = (int)(Math.min(getWidth(), getHeight()) * 0.4);

    // Create a Polygon object
    Polygon polygon = new Polygon();

    double a = 2*Math.PI/n;

   // Add points to the polygon

 if (n % 2 == 1 && n > 0)
 {
    {

    for (int i = 0; i < n; i++)
      polygon.addPoint((int)(xCenter + radius * Math.cos(Math.PI/2 + i*a)),
      	         (int)(yCenter - radius * Math.sin(Math.PI/2 + i*a)));
    }
     g.drawPolygon(polygon);
 }

    if (n % 2 == 0 && n > 0)
   {
    {

    for (int i = 0; i < n; i++)
      polygon.addPoint((int)(xCenter + radius * Math.cos(i*a)),
      	               (int)(yCenter - radius * Math.sin(i*a)));
    }
     g.drawPolygon(polygon);
   }


   if (n == 0)

   {
   	ImageIcon orIcon = new ImageIcon("image/or.gif");
   	Image orImage = orIcon.getImage();

   	if (orImage != null)
   	g.drawImage(orImage, 0, 0, getWidth(), getHeight(), this);


   }

    if (n == -1)

   {
   	ImageIcon saigonIcon = new ImageIcon("image/saigon.jpg");
   	Image saigonImage = saigonIcon.getImage();

   	if (saigonImage != null)
   	g.drawImage(saigonImage, 0, 0, getWidth(), getHeight(), this);
   }
  }
 }