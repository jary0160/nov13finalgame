
import java.util.ArrayList;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;


public class Car {
    private Image image;
    private int carx = 175;
    private Rectangle hitbox;
    private boolean stopped;
    private int dir;
public Car(int x, int y) throws SlickException{
    hitbox = new Rectangle(x,y,26,30);
}
public void move(Input kb, ArrayList<Rectangle> walls){
        stopped = false;
        int x = (int) hitbox.getX();
        int y = (int) hitbox.getY();
        
        int origx = x, origy =y;
        
        if (kb.isKeyDown(Input.KEY_RIGHT)){
            x++;
            dir = 3;
        }
        else if (kb.isKeyDown(Input.KEY_LEFT)){
            x--;
            dir=1;
        }
        else if (kb.isKeyDown(Input.KEY_DOWN)){
            y++;
            dir=0;
        }
        else if (kb.isKeyDown(Input.KEY_UP)){
            y--;
            dir=2;
        }
        else {
            stopped = true;
        }
        hitbox.setX(x);
        hitbox.setY(y);
        
         if (isHitting(walls)) {
            hitbox.setX(origx);
            hitbox.setY(origy);
        }
    }
        
        public boolean isHitting(ArrayList<Rectangle> rect){
        for (Rectangle r: rect){
            if (hitbox.intersects(r)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean isHitting(GameObject go){
        return hitbox.intersects(go.getHitbox());
    }
}
