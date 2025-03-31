//package chapter15;

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class HW2N2 extends JFrame {
  public HW2N2() {
    Image image1 = new ImageIcon("image/o.gif").getImage();
    Image image2 = new ImageIcon("image/x.png").getImage();
    Image image3 = new ImageIcon("").getImage();
    //Image image3 = new ImageIcon().getImage();
    //Image image5 = new ImageIcon("image/china.gif").getImage();
    //Image image6 = new ImageIcon("image/norway.gif").getImage();
     Image[] images = {image1, image2, image3};
        // Create a Random object
        Random random = new Random();
        Random random1 = new Random();
        Random random2 = new Random();
        Random random3 = new Random();
        Random random4 = new Random();
        Random random5 = new Random();
        Random random6 = new Random();
        Random random7 = new Random();
        Random random8 = new Random();

        // Generate a random index
        int randomIndex = random.nextInt(images.length);
        int randomIndex1 = random1.nextInt(images.length);
        int randomIndex2 = random2.nextInt(images.length);
        int randomIndex3 = random3.nextInt(images.length);
        int randomIndex4 = random4.nextInt(images.length);
        int randomIndex5 = random5.nextInt(images.length);
        int randomIndex6 = random6.nextInt(images.length);
        int randomIndex7 = random7.nextInt(images.length);
        int randomIndex8 = random8.nextInt(images.length);
        // Use the random index to select an image
        Image selectedImage = images[randomIndex];
        Image selectedImage1 = images[randomIndex1];
        Image selectedImage2 = images[randomIndex2];
        Image selectedImage3 = images[randomIndex3];
        Image selectedImage4 = images[randomIndex4];
        Image selectedImage5 = images[randomIndex5];
        Image selectedImage6 = images[randomIndex6];
        Image selectedImage7 = images[randomIndex7];
        Image selectedImage8 = images[randomIndex8];

    setLayout(new GridLayout(3, 3, 5, 5));
    add(new ImageViewer(selectedImage));
    add(new ImageViewer(selectedImage1));
    add(new ImageViewer(selectedImage2));
    add(new ImageViewer(selectedImage3));
    add(new ImageViewer(selectedImage4));
    add(new ImageViewer(selectedImage5));
    add(new ImageViewer(selectedImage6));
    add(new ImageViewer(selectedImage7));
    add(new ImageViewer(selectedImage8));
    //add(new ImageViewer(image5));
    //add(new ImageViewer(image6));
  }

  public static void main(String[] args) {
    HW2N2 frame = new HW2N2();
    frame.setTitle("HW2N2");
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 320);
    frame.setVisible(true);
  }
}

//public

class ImageViewer extends JPanel {
  /** Hold value of property image. */
  private java.awt.Image image;

  /** Hold value of property stretched. */
  private boolean stretched = true;

  /** Hold value of property xCoordinate. */
  private int xCoordinate;

  /** Hold value of property yCoordinate. */
  private int yCoordinate;

  /** Construct an empty image viewer */
  public ImageViewer() {
  }

  /** Construct an image viewer for a specified Image object */
  public ImageViewer(Image image) {
    this.image = image;
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    if (image != null)
      if (isStretched())
        g.drawImage(image, xCoordinate, yCoordinate,
          getSize().width, getSize().height, this);
      else
        g.drawImage(image, xCoordinate, yCoordinate, this);
  }

  /** Return value of property image */
  public java.awt.Image getImage() {
    return image;
  }

  /** Set a new value for property image */
  public void setImage(java.awt.Image image) {
    this.image = image;
    repaint();
  }

  /** Return value of property stretched */
  public boolean isStretched() {
    return stretched;
  }

  /** Set a new value for property stretched */
  public void setStretched(boolean stretched) {
    this.stretched = stretched;
    repaint();
  }

  /** Return value of property xCoordinate */
  public int getXCoordinate() {
    return xCoordinate;
  }

  /** Set a new value for property xCoordinate */
  public void setXCoordinate(int xCoordinate) {
    this.xCoordinate = xCoordinate;
    repaint();
  }

  /** Return value of property yCoordinate */
  public int getYCoordinate() {
    return yCoordinate;
  }

  /** Set a new value for property yCoordinate */
  public void setYCoordinate(int yCoordinate) {
    this.yCoordinate = yCoordinate;
    repaint();
  }
}

