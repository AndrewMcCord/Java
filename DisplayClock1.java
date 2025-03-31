//package chapter15;

//import java.awt.*;
//import javax.swing.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;


public class DisplayClock1 extends JFrame {
  public DisplayClock1() {
    // Create an analog clock for the current time
    StillClock clock = new StillClock();

    // Display hour, minute, and seconds in the message panel
    MessagePanel messagePanel = new MessagePanel(clock.getHour() +
      ":" + clock.getMinute() + ":" + clock.getSecond());
    messagePanel.setCentered(true);
    messagePanel.setForeground(Color.blue);
    messagePanel.setFont(new Font("Courie", Font.BOLD, 16));

    // Add the clock and message panel to the frame
    add(clock);
    add(messagePanel, BorderLayout.SOUTH);
  }

  public static void main(String[] args) {
    DisplayClock1 frame = new DisplayClock1();
    frame.setTitle("DisplayClock1");
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 350);
    frame.setVisible(true);
  }
}

class MessagePanel extends JPanel {
  /** The message to be displayed */
  private String message = "Welcome to Java";

  /** The x coordinate where the message is displayed */
  private int xCoordinate = 20;

  /** The y coordinate where the message is displayed */
  private int yCoordinate = 20;

  /** Indicate whether the message is displayed in the center */
  private boolean centered;

  /** The interval for moving the message horizontally
   * and vertically */
  private int interval = 10;

  /** Construct with default properties */
  public MessagePanel() {
  }

  /** Construct a message panel with a specified message */
  public MessagePanel(String message) {
    this.message = message;
  }

  /** Return message */
  public String getMessage() {
    return message;
  }

  /** Set a new message */
  public void setMessage(String message) {
    this.message = message;
    repaint();
  }

  /** Return xCoordinator */
  public int getXCoordinate() {
    return xCoordinate;
  }

  /** Set a new xCoordinator */
  public void setXCoordinate(int x) {
    this.xCoordinate = x;
    repaint();
  }

  /** Return yCoordinator */
  public int getYCoordinate() {
    return yCoordinate;
  }

  /** Set a new yCoordinator */
  public void setYCoordinate(int y) {
    this.yCoordinate = y;
    repaint();
  }

  /** Return centered */
  public boolean isCentered() {
    return centered;
  }

  /** Set a new centered */
  public void setCentered(boolean centered) {
    this.centered = centered;
    repaint();
  }

  /** Return interval */
  public int getInterval() {
    return interval;
  }

  /** Set a new interval */
  public void setInterval(int interval) {
    this.interval = interval;
    repaint();
  }

  /** Paint the message */
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    if (centered) {
      // Get font metrics for the current font
      FontMetrics fm = g.getFontMetrics();

      // Find the center location to display
      int stringWidth = fm.stringWidth(message);
      int stringAscent = fm.getAscent();
      // Get the position of the leftmost character in the baseline
      xCoordinate = getWidth() / 2 - stringWidth / 2;
      yCoordinate = getHeight() / 2 + stringAscent / 2;
    }

    g.drawString(message, xCoordinate, yCoordinate);
  }

  /** Move the message left */
  public void moveLeft() {
    xCoordinate -= interval;
    repaint();
  }

  /** Move the message right */
  public void moveRight() {
    xCoordinate += interval;
    repaint();
  }

  /** Move the message up */
  public void moveUp() {
    yCoordinate -= interval;
    repaint();
  }

  /** Move the message down */
  public void moveDown() {
    yCoordinate += interval;
    repaint();
  }

  /** Override get method for preferredSize */
  public Dimension getPreferredSize() {
    return new Dimension(200, 30);
  }
}

//public
class StillClock extends JPanel {
  private int hour;
  private int minute;
  private int second;

  /** Construct a default clock with the current time*/
  public StillClock() {
    setCurrentTime();
  }

  /** Construct a clock with specified hour, minute, and second */
  public StillClock(int hour, int minute, int second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  /** Return hour */
  public int getHour() {
    return hour;
  }

  /** Set a new hour */
  public void setHour(int hour) {
    this.hour = hour;
    repaint();
  }

  /** Return minute */
  public int getMinute() {
    return minute;
  }

  /** Set a new minute */
  public void setMinute(int minute) {
    this.minute = minute;
    repaint();
  }

  /** Return second */
  public int getSecond() {
    return second;
  }

  /** Set a new second */
  public void setSecond(int second) {
    this.second = second;
    repaint();
  }

  /** Draw the clock */
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    // Initialize clock parameters
    int clockRadius =
      (int)(Math.min(getWidth(), getHeight()) * 0.8 * 0.5);
    int xCenter = getWidth() / 2;
    int yCenter = getHeight() / 2;

    // Draw circle
    g.setColor(Color.black);
    g.drawOval(xCenter - clockRadius, yCenter - clockRadius,
      2 * clockRadius, 2 * clockRadius);
    g.drawString("12", xCenter - 5, yCenter - clockRadius + 12);
    g.drawString("9", xCenter - clockRadius + 3, yCenter + 5);
    g.drawString("3", xCenter + clockRadius - 10, yCenter + 3);
    g.drawString("6", xCenter - 3, yCenter + clockRadius - 3);

    // Draw second hand
    int sLength = (int)(clockRadius * 0.8);
    int xSecond = (int)(xCenter + sLength *
      Math.sin(second * (2 * Math.PI / 60)));
    int ySecond = (int)(yCenter - sLength *
      Math.cos(second * (2 * Math.PI / 60)));
    g.setColor(Color.red);
    g.drawLine(xCenter, yCenter, xSecond, ySecond);

    // Draw minute hand
    int mLength = (int)(clockRadius * 0.65);
    int xMinute = (int)(xCenter + mLength *
      Math.sin(minute * (2 * Math.PI / 60)));
    int yMinute = (int)(yCenter - mLength *
      Math.cos(minute * (2 * Math.PI / 60)));
    g.setColor(Color.blue);
    g.drawLine(xCenter, yCenter, xMinute, yMinute);

    // Draw hour hand
    int hLength = (int)(clockRadius * 0.5);
    int xHour = (int)(xCenter + hLength *
      Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12)));
    int yHour = (int)(yCenter - hLength *
      Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12)));
    g.setColor(Color.green);
    g.drawLine(xCenter, yCenter, xHour, yHour);
  }

  public void setCurrentTime() {
    // Construct a calendar for the current date and time
    Calendar calendar = new GregorianCalendar();

    // Set current hour, minute and second
    this.hour = calendar.get(Calendar.HOUR_OF_DAY);
    this.minute = calendar.get(Calendar.MINUTE);
    this.second = calendar.get(Calendar.SECOND);
  }

  public Dimension getPreferredSize() {
    return new Dimension(200, 200);
  }
}


