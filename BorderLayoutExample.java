import java.awt.*;
import javax.swing.*;

public class BorderLayoutExample {

    public static void main(String[] args) {
        // [1] Create a frame and set its layout to BorderLayout
        JFrame frame = new JFrame("BorderLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // [2] Create two panels
        JPanel southPanel = new JPanel();
        JPanel centerPanel = new JPanel();

        // Set the layout of each panel to GridLayout of 2 rows and 2 columns
        southPanel.setLayout(new GridLayout(2, 2));
        centerPanel.setLayout(new GridLayout(2, 2));

        // [3] Each panel contains three buttons
        southPanel.add(new JButton("South Button 1"));
        southPanel.add(new JButton("South Button 2"));
        southPanel.add(new JButton("South Button 3"));

        centerPanel.add(new JButton("Center Button 1"));
        centerPanel.add(new JButton("Center Button 2"));
        centerPanel.add(new JButton("Center Button 3"));

        // Place one panel on the south of the frame
        frame.add(southPanel, BorderLayout.SOUTH);

        // Place the other panel on the center of the frame
        frame.add(centerPanel, BorderLayout.CENTER);

        // Set the size of the frame and make it visible
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}