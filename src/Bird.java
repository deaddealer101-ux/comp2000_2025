import java.awt.Color;
import java.awt.Graphics;

public class Bird extends Actor{

    public Bird(Cell c) {
        super(c);
    }

     @Override
    public void paint(Graphics g){
        g.setColor(Color.GREEN);
        g.fillRect(c.x, c.y, Cell.size,Cell.size);

    }
    
}
