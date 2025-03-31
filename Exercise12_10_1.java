import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Exercise12_10_1 extends JFrame {
  public static void main(String[] args) {
    Exercise12_10_1 frame = new Exercise12_10_1();
    int m = 400;
    frame.setSize(m, m);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("Exercise12_10");
    frame.setVisible(true);
  }

  public Exercise12_10_1() {
    // Create panel p1 add three buttons
    int a = 20;

    JPanel p1 = new JPanel(new GridLayout(a, a));
    add(p1);

    Random r = new Random();

    JButton[][] buttons = new JButton[a][a];
    // boolean isWhite = true;

    for (int i = 0; i < a; i++) {
      for (int j = 0; j < a; j++) {
        buttons[i][j] = new JButton();
        p1.add(buttons[i][j]);

        int i1 = r.nextInt(256);
        int j1 = r.nextInt(256);
        int k1 = r.nextInt(256);

        Color c = new Color(i1, j1, k1);

        buttons[i][j].setBackground(c);

        /*
        if (isWhite) {
          buttons[i][j].setBackground(Color.WHITE);
          isWhite = false;
        }
        else {
          buttons[i][j].setBackground(Color.BLACK);
          isWhite = true;
        }
      }

      if (i % 2 == 0)
        isWhite = false;
      else
        isWhite = true;
        */
    }
  }
}
}