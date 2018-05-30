import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Circles {
    public static void mainDraw(Graphics graphics) {
        int size = WIDTH;
        int x = 0;
        int y = 500;
        fillCircles(graphics,x,y,size,3);
    }
    public static int fillCircles(Graphics graphics, int x, int y, int size, int n) {
        graphics.setColor(Color.BLACK);
        graphics.drawOval(x, 0, size, size);
        graphics.drawOval(x+250, 0, size / 2, size / 2);
        graphics.drawOval(x+35, y-125, size / 2, size / 2);
        graphics.drawOval(x+465, y-125, size / 2, size / 2);
        if (n == 0) {
            return 0;
        } else {
            fillCircles(graphics, x, y, size / 2, n - 1);
            return 0;
        }
    }

    static int WIDTH = 1000;
    static int HEIGHT = 1000;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT + 23));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }
}
