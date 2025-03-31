//*******************************************************************

//Problem 1 in homework 1 *

// Programmer: Andrew McCord *

// Due: 2/5/2025 *

// Program file name: HW1.java*

//*******************************************************************

import java.awt.*;
import javax.swing.*;

public class HW1 extends JFrame {
    public HW1(){
        // Set FlowLayout, aligned left with horizontal gap 10
        // and vertical gap 20 between components
        setLayout(new FlowLayout());
        JPanel p1 = new JPanel(new FlowLayout());
        p1.add(new JButton("" + 1));
        p1.add(new JButton("" + 2));
        p1.add(new JButton("" + 3));
        JPanel p2 = new JPanel(new FlowLayout());
        p2.add(new JButton("" + 1));
        p2.add(new JButton("" + 2));
        p2.add(new JButton("" + 3));
        // Add labels and text fields to the frame
        //add(new JLabel("First Name"));
        //add(new JTextField(8));
        //add(new JLabel("MI"));
        //add(new JTextField(1));
       // add(new JLabel("Last Name"));
        //add(new JTextField(8));

        add(p1);
        add(p2);
    }

    /** Main method */ 
    public static void main(String[] args) {
        HW1 frame = new HW1();
        frame.setTitle("HW1");
        frame.setSize(200, 200);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}