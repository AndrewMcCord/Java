//******************************************************************* 

//Problem 3 in homework 3 * 

// Programmer: Andrew McCord * 

 
// Due: 3/18/25 * 


// Program file name: HW3N3.java * 
 

// A brief description of your program //******************************************************************* 
import java.awt.*;
import javax.swing.*;

public class HW3N3 extends JFrame {
    public HW3N3 () {
        setLayout(new GridLayout(2, 2, 2, 2));
        add(new FigurePanel(FigurePanel.FILLED_ARC));
        add(new FigurePanel(FigurePanel.OVAL));
        add(new FigurePanel(FigurePanel.FILLED_ARC));
        add(new FigurePanel(FigurePanel.OVAL));
        add(new FigurePanel(FigurePanel.FILLED_ARC));
        add(new FigurePanel(FigurePanel.OVAL));
        add(new FigurePanel(FigurePanel.FILLED_ARC));
        add(new FigurePanel(FigurePanel.OVAL));
    }

    public static void main(String[] args) {
        HW3N3 frame = new HW3N3();
        frame.setTitle("HW3N3");
        frame.setSize(800, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}