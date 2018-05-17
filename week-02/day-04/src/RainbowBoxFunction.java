import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {

        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.

        int size = WIDTH;
        int color = (int) (Math.random()*256);
        for (int i = 0; i < 10; i++) {
            rainbow(graphics,size,color);
        }
    }

public static void rainbow(Graphics graphics,int square,int moreColor) {

        for (int i = 0; i < 10; i++) {
        square -= 30;
        int x = (WIDTH/2)-(square/2);
        int y = (HEIGHT/2)-(square/2);
        graphics.setColor(new Color(moreColor,(int)(Math.random()*256),(int)(Math.random()*256),100));
        graphics.fillRect(x,y,square,square);
        }
    }

    // Don't touch the code below
    static int WIDTH = 400;
    static int HEIGHT = 400;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT*23));
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
