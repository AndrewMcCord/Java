//*******************************************************************

//Problem 4 in homework 1 *

// Programmer: Andrew McCord *

// Due: 2/5/2025 *

// Program file name: HW1.java*

//*******************************************************************

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class HW14 extends JFrame {
  public HW14() {
    // Create panel p1 for the buttons and set GridLayout
    JPanel p1 = new JPanel();
    p1.setLayout(new GridLayout(4,0));
    JLabel Label1 = new JLabel("Department of Computer Science");
    JLabel Label2 = new JLabel("School of Computing");
    JLabel Label3 = new JLabel("Armstrong Atlantic State University");
    JLabel Label4 = new JLabel("Tel: (912) 921-6440");
    Border lineBorder = new LineBorder(Color.BLACK, 2);
    Label1.setBorder(lineBorder);
    Label2.setBorder(lineBorder);
    Label3.setBorder(lineBorder);
    Label4.setBorder(lineBorder);
    p1.add(Label1);
    p1.add(Label2);
    p1.add(Label3);
    p1.add(Label4);
    add(p1, BorderLayout.WEST);
  }

  /** Main method */
  public static void main(String[] args) {
    HW14 frame = new HW14();
    frame.setTitle("Exercise 12_5");
    frame.setSize(250, 250);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
