

import javax.swing.*;
import javax.swing.*;

public class twoGonsAlt extends JFrame {
  public twoGonsAlt() {

    JPanel p1 = new JPanel(new GridLayout(8, 8));
    add(p1);

    //JButton[][] buttons = new JButton[8][8];
    //boolean isWhite = true;

    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
      //  buttons[i][j] = new JButton();
       // p1.add(new PolygonsPanel(5));

        int m = i + j;

        if (m % 2 == 0) {
           p1.add(new PolygonsPanel(8));

          //buttons[i][j].setBackground(Color.WHITE);
          //isWhite = false;
        }
        else {

          p1.add(new PolygonsPanel(7));
         // buttons[i][j].setBackground(Color.BLACK);
         // isWhite = true;
        }
      }
    }
  }


   /* Image image1 = new ImageIcon("image/us.gif").getImage();
    Image image2 = new ImageIcon("image/ca.gif").getImage();
    Image image3 = new ImageIcon("image/india.gif").getImage();
    Image image4 = new ImageIcon("image/uk.gif").getImage();
    Image image5 = new ImageIcon("image/china.gif").getImage();
    Image image6 = new ImageIcon("image/norway.gif").getImage();

    setLayout(new GridLayout(2, 0, 5, 5));
    add(new ImageViewer(image1));
    add(new ImageViewer(image2));
    add(new ImageViewer(image3));
    add(new ImageViewer(image4));
    add(new ImageViewer(image5));
    add(new ImageViewer(image6));*/


  public static void main(String[] args) {
    twoGonsAlt frame = new twoGonsAlt();
    frame.setTitle("twoGonsAlt");
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 320);
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