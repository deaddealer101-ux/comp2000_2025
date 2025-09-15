import java.awt.Graphics;
import java.awt.Point;
import java.util.Arrays;
import java.util.List;

public class Stage {
    Grid grid;
    List<Actor> actors;

    public Stage(Grid grid){
        this.grid = grid;
        Actor cat  = new Cats(grid.cells[2][3]);   // blue
        Actor dog  = new Dogs(grid.cells[5][10]);  // yellow
        Actor bird = new Bird(grid.cells[12][7]);  // green

        actors = Arrays.asList(cat, dog, bird);
    }

    public void paint(Graphics g, Point mousePos) {
        grid.paint(g, mousePos);    // draw grid first
        for (Actor a : actors) {
            a.paint(g);   
        }
    }   
    
}
