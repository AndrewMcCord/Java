//*******************************************************************

//Problem 1 in homework 1 *

// Programmer: Andrew McCord *

// Due: 2/5/2025 *

// Program file name: HW1.java*

//*******************************************************************

import java.awt.*;
import javax.swing.*;

public class HW12 extends JFrame {
    public HW12(){
        setLayout(new BorderLayout());
        JPanel p1 = new JPanel(new FlowLayout());
        p1.add(new JButton("" + 1));
        p1.add(new JButton("" + 2));
        p1.add(new JButton("" + 3));
        JPanel p2 = new JPanel(new FlowLayout());
        p2.add(new JButton("" + 4));
        p2.add(new JButton("" + 5));
        p2.add(new JButton("" + 6));
        add(p1, BorderLayout.SOUTH);
        add(p2, BorderLayout.CENTER);
    }

    /** Main method */ 
    public static void main(String[] args) {
        HW12 frame = new HW12();
        frame.setTitle("HW12");
        frame.setSize(200, 200);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}