//*******************************************************************

//Problem 4 in homework 2 *

// Programmer: Andrew McCord *

// Due: 2/26/25 *

// Program file name: TestProgram.java *

// A brief description of your program //*******************************************************************
import java.awt.*;
import javax.swing.*;

public class TestProgram extends JFrame {
    public TestProgram() {
        setLayout(new GridLayout(2, 2, 5, 5));

       // add(new FigurePanel(FigurePanel.ARC));
       //add(new FigurePanel(FigurePanel.GRAPH));
       // add(new FigurePanel(FigurePanel.FILLED_ARC));
        //add(new FigurePanel(FigurePanel.FILLED_POLYGON));
        add(new FigurePanel(FigurePanel.OCTAGON)); 
        //add(new FigurePanel(FigurePanel.FILLED_ARC));
       // add(new FigurePanel(FigurePanel.FILLED_ARC));
        //add(new FigurePanel(FigurePanel.FILLED_ARC));
        //add(new FigurePanel(FigurePanel.FILLED_ARC));
    }

    public static void main(String[] args) {
        TestProgram frame = new TestProgram();
        frame.setTitle("TestFigurePanel");
        frame.setSize(800, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}