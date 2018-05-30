import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static final int SIZE = 1000;

    public static void mainDraw(Graphics graphics) {

        int triangleHeight = (int) Math.round(SIZE * Math.sqrt(3.0) / 2.0);
        Point p1 = new Point(0, triangleHeight);
        Point p2 = new Point(SIZE / 2, 0);
        Point p3 = new Point(SIZE, triangleHeight);
        drawTriangles(7, graphics, p1, p2, p3);

    }

    public static void drawTriangles(int n, Graphics graphics, Point p1, Point p2, Point p3) {
        if (n == 1) {
            Polygon p = new Polygon();
            p.addPoint(p1.x, p1.y);
            p.addPoint(p2.x, p2.y);
            p.addPoint(p3.x, p3.y);
            graphics.fillPolygon(p);
        } else {

            Point p4 = midpoint(p1, p2);
            Point p5 = midpoint(p2, p3);
            Point p6 = midpoint(p1, p3);

            drawTriangles(n - 1, graphics, p1, p4, p6);
            drawTriangles(n - 1, graphics, p4, p2, p5);
            drawTriangles(n - 1, graphics, p6, p5, p3);
        }
    }


    public static Point midpoint(Point p1, Point p2) {
        return new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
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
