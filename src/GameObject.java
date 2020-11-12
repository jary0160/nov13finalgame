
import java.util.ArrayList;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jary0160
 */
abstract public class GameObject {
    
    protected Rectangle hitbox;
    protected Image image;

 public GameObject(int x, int y,String imgname) throws SlickException{
        image= new Image(imgname);
        hitbox = new Rectangle(x,y, image.getHeight(), image.getWidth());
    }
    
  abstract public void move (ArrayList <Rectangle> barriers);
    
    public void draw(){
        image.draw(hitbox.getX(), hitbox.getY());
    }
    
    public Rectangle getHitbox(){
        return hitbox;
    }
    
}
