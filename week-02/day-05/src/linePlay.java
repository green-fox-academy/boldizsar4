import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class linePlay {

    public static void mainDraw(Graphics graphics) {
        lineGreen(graphics);
        linePurple(graphics);
    }

    public static void lineGreen(Graphics graphics) {
        graphics.setColor(Color.GREEN);
        for (int i = 0; i < 20; i++) {
            graphics.drawLine(0, 20 * i, 20 * i, 400);
        }
    }
    public static void linePurple(Graphics graphics){
        graphics.setColor(new Color(128, 0, 128,255));
        for (int j = 0; j < 20; j++) {
            graphics.drawLine(20 * j, 0, 400, 20 * j);
        }
    }

        // Don't touch the code below
        static int WIDTH = 430;
        static int HEIGHT = 430;

        public static void main (String[]args){
            JFrame jFrame = new JFrame("Drawing");
            jFrame.setSize(new Dimension(WIDTH, HEIGHT+23));
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

