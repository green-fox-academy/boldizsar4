import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopStar {
    public static void mainDraw(Graphics graphics) {

makingStar(graphics);
    }

public static void makingStar (Graphics graphics){

    graphics.setColor(Color.green);
    for (int i = 0; i < 20; i++) {
        graphics.drawLine(200,20*i, 200+(20 * i), 200);
            }
    for (int j = 0; j < 20; j++) {
        graphics.drawLine(200,400-(20*j),200+(20*j),200 );
    }
        }

    // Don't touch the code below
    static int WIDTH = 400;
    static int HEIGHT = 400;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT+23));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new SuperHexagon.ImagePanel());
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
