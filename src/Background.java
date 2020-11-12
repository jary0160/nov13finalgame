
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;


public class Background {
    private Image grass;
    private Image road;
    private Image border;

    public void draw() throws SlickException{
    grass = new Image("Back.png");
    road = new Image("Road.1.png");    
    grass.draw(0,0);
    
}
}
