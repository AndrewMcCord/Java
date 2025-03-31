//package chapter12; 

import javax.swing.*;

public class MyFrameWithComponents {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MyFramewithComponents");

        // Add a button into the frame
        JButton jbtOK = new JButton("OK");
        frame.add(jbtOK);
       // JButton jbtOK1 = new JButton("OK1"); // notice how the OK1 button replaces the OK button //
       // frame.add(jbtOK1);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
        }
}
