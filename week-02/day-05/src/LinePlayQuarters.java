import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class LinePlayQuarters {
    public static void mainDraw(Graphics graphics) {
        int div = 4;
        quarters(graphics,div);
    }
    public static void quarters(Graphics graphics,int div) {

        int canvasDivision = WIDTH / div;
        int diff = 5;
        graphics.drawRect(0, 0, 400, 400);

        for (int i = 0; i < div; i++) {
            for (int j = 0; j < div; j++) {
                graphics.setColor(Color.green);
                for (int ii = 0; ii < canvasDivision / diff; ii++) {
                    graphics.drawLine(0 + canvasDivision * i, diff * ii + canvasDivision * j, diff * ii + canvasDivision * i, canvasDivision + canvasDivision * j);
                }
                graphics.setColor(new Color(128, 0, 128,255));
                for (int jj = 0; jj < canvasDivision / diff; jj++) {
                    graphics.drawLine(diff * jj + canvasDivision * i, 0 + canvasDivision * j, canvasDivision + canvasDivision * i, diff * jj + canvasDivision * j);
                }
            }
        }
    }

    // Don't touch the code below
    static int WIDTH = 400;
    static int HEIGHT = 400;

    public static void main(String[] args) {
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
