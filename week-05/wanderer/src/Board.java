import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {
  Map wall;
  int testBoxX;
  int testBoxY;
  int size = 72;
  PositionedImage heroDown = new PositionedImage("assets/hero-down.png", 0, 0);
  PositionedImage heroUp = new PositionedImage("assets/hero-up.png", 0, 0);
  PositionedImage heroLeft = new PositionedImage("assets/hero-left.png", 0, 0);
  PositionedImage heroRight = new PositionedImage("assets/hero-right.png", 0, 0);

  public Board() {

    wall = new Map();

    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    int[][] mapArray = wall.mapOfWalls();
    for (int i = 0; i < mapArray.length; i++) {
      for (int j = 0; j < mapArray.length; j++) {
        if (wall.isItWall(j, i)) {
          PositionedImage wall = new PositionedImage("assets/wall.png", i * size, j * size);
          wall.draw(graphics);
        } else {
          PositionedImage tiles = new PositionedImage("assets/floor.png", i * size, j * size);
          tiles.draw(graphics);
        }
      }
    }
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("RPG Game");
    Board board = new Board();
    frame.add(board);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
    frame.addKeyListener(board);
  }

  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  public void keyReleased(KeyEvent e) {
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      heroUp.posY -= 72;
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      heroDown.posY += 72;
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      heroRight.posX += 72;
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      heroLeft.posX -= 72;
    }
    repaint();
  }
}