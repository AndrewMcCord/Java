//package chapter 12

import java.awt.*;
import javax.swing.*;

public class HW1N1 extends JFrame {
    public HW1N1(){
        // Set FlowLayout, aligned left with horizontal gap 10
        // and vertical gap 20 between components
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));

        // Add labels and text fields to the frame
        JPanel p1 = new JPanel();
        //p1.setLayout(new FlowLayout());
        // Add buttons to the panel
        for (int i = 1; i <= 2; i++) {
          p1.add(new JButton("" + i));
        }
    
        p1.add(new JButton("" + 0));
    
    
        JPanel p2 = new JPanel();
        //p2.setLayout(new FlowLayout());
        // Add buttons to the panel
        for (int i = 1; i <= 2; i++) {
          p2.add(new JButton("" + i));
        }
    
        p2.add(new JButton("" + 0));
       

        add(p1, FlowLayout.LEFT);
        add(p2, FlowLayout.CENTER);
    }
    /** Main method */ 
    public static void main(String[] args) {
        HW1N1 frame = new HW1N1();
        frame.setTitle("HW1N1");
        frame.setSize(200, 200);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
} 