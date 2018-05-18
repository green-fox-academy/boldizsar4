import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CheckerBoard {
    public static void mainDraw(Graphics graphics) {
        int size = 50;
        pattern1(graphics,size);
    }
    public static void pattern1(Graphics graphics,int size) {
        int x = 0;
        int y = 0;
        graphics.fillRect(0, 0, WIDTH, HEIGHT);
        for (int rows = 0; rows <= WIDTH; rows+=100) {
            for (int column = 0; column < HEIGHT; column+=100) {
                        graphics.setColor(Color.white);
                        graphics.fillRect(x +rows,y + column,size,size);
                    }
                }
        for (int rows2 = 50; rows2 < WIDTH+50; rows2+=100)
            for (int column2 = 50; column2 < HEIGHT+50; column2+=100) {
                graphics.setColor(Color.white);
                graphics.fillRect(x+rows2,y+column2,size,size);
            }
        }

        // Don't touch the code below
        static int WIDTH = 500;
        static int HEIGHT = 500;

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
