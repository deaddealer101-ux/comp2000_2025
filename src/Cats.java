import java.awt.Color;
import java.awt.Graphics;

public class Cats extends Actor{

    public Cats(Cell c) {
        super(c);
        
    }
    @Override
    public void paint(Graphics g){
        
        g.setColor(Color.BLUE);
        g.fillRect(c.x, c.y, Cell.size,Cell.size);

    }
}
    

