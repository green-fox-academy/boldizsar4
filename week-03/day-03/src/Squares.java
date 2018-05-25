import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Squares {

    public static void mainDraw(Graphics graphics) {
        graphics.setColor(Color.yellow);
        graphics.fillRect(0,0,WIDTH,HEIGHT);
        Squares(graphics, 0,0,HEIGHT, 5);
    }
public static int Squares (Graphics g,int x, int y,int size, int n){
    g.setColor(Color.BLACK);
    g.drawRect(x + size / 3, y, size / 3, size / 3);
    g.drawRect(x, y + size / 3, size / 3, size / 3);
    g.drawRect(x + size / 3, y + size / 3 * 2, size / 3, size / 3);
    g.drawRect(x + size / 3 * 2, y + size / 3, size / 3, size / 3);
    if (n == 0) {
        return 0;
    } else {
        Squares(g, x + size / 3, y, size / 3, n - 1);
        Squares(g, x + size / 3 * 2, y + size / 3, size / 3, n - 1);
        Squares(g, x + size / 3, y + size / 3 * 2, size / 3, n - 1);
        Squares(g, x, y + size / 3, size / 3, n - 1);
        return 0;
    }
}

    static int WIDTH = 1000;
    static int HEIGHT = 1000;

    public static void main (String[]args){
        JFrame jFrame = new JFrame("Drawing");
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
