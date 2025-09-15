import java.awt.*;


public class Actor {
    Cell c;
    

    public Actor(Cell c){
        this.c =c;
    }

    public void paint(Graphics g){
        g.setColor(null);
        g.fillRect(c.x, c.y, Cell.size,Cell.size);

    }


}

