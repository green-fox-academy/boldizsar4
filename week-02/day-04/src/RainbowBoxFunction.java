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
int size = (int) (Math.random()*133);
int green = 200;
rainbow(graphics,size,green);
    }
    public static void rainbow(Graphics graphics,int size,int green){
        for (int i = 0; i < 4; i++) {
            Random random = new Random();
            graphics.setColor(new Color((int)(Math.random()*128.5)*i,green,(int)(Math.random()*128.5)*i,100));
            graphics.fillRect((WIDTH/2) - (size/2),(HEIGHT/2)-(size/2),size*i,size*i);
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
