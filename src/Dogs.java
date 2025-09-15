import java.awt.Color;
import java.awt.Graphics;

public class Dogs extends Actor {

    public Dogs(Cell c) {
        super(c);
    }
    
    @Override
    public void paint(Graphics g){
        
        g.setColor(Color.YELLOW);
        g.fillRect(c.x, c.y, Cell.size,Cell.size);

    }
    
}
