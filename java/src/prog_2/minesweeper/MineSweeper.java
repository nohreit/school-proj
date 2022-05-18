package prog_2.minesweeper;

import javax.swing.*;
import java.awt.*;

public class MineSweeper extends JPanel {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Minesweeper");

        frame.setSize(480, 360);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
