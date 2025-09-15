import java.awt.*;
public class Cell extends Rectangle {
  static int size = 35;

  public Cell(int x, int y) {
    super(x, y, size, size);
  }

  public void paint(Graphics g, Point mousePos) {
    boolean hover = (mousePos != null) && super.contains(mousePos);
    g.setColor(hover ? Color.GRAY : Color.WHITE);
    g.fillRect(x, y, width, height);
    g.setColor(Color.BLACK);
    g.drawRect(x, y, width, height);
  }
}
