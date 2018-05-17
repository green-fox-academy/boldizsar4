import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
    public static void mainDraw(Graphics graphics) {
        // Draw a box that has different colored lines on each edge.
graphics.setColor(Color.GREEN);
graphics.drawLine(10,10,10,323);
graphics.setColor(Color.RED);
graphics.drawLine(10,323,300,323);
graphics.setColor(Color.blue);
graphics.drawLine(300,323,300,10);
graphics.setColor(Color.BLACK);
graphics.drawLine(300,10, 10,10);


    }

    // Don't touch the code below
    static int WIDTH = 330;
    static int HEIGHT = 360;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("ColoredBox");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT + 23));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
//