import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {
  Map wall;
  int testBoxX;
  int testBoxY;
  int size = 72;
  Hero hero;


  public Board() {
    hero = new Hero();
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
    PositionedImage heroPicture = new PositionedImage(hero.image, hero.posX,hero.posY);
    heroPicture.draw(graphics);
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
      hero.posY -= 72;
      hero.heroUp();
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      hero.posY += 72;
      hero.heroDown();
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      hero.posX += 72;
      hero.heroRight();
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      hero.posX -= 72;
      hero.heroLeft();
    }
    repaint();
  }
}