//******************************************************************* 

 

//Problem 2 in homework 3 * 

 

// Programmer: Andrew McCord * 

 

// Due: 3/18/25 * 

 

// Program file name: HW3N2.java * 

 

// A brief description of your program //******************************************************************* 
import java.awt.*;
import javax.swing.*;
public class HW3N2 extends JFrame { 
    public HW3N2() { 
        setLayout(new GridLayout(2, 4, 5, 5)); 
        add(new FigurePanel(FigurePanel.OCTAGON)); 
    } 

    public static void main(String[] args) { 
        HW3N2 frame = new HW3N2(); 
        frame.setTitle("HW3N2"); 
        frame.setSize(800, 400); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setLocationRelativeTo(null); 
        frame.setVisible(true); 
    } 
} 