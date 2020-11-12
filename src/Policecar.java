
import java.util.ArrayList;
import org.newdawn.slick.Animation;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;
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
public class Policecar {
    private Animation ani[] = new Animation[4];
    private Image walk[][]= new Image[4][4];
    private Image stopImage[]= new Image[4];
    private SpriteSheet gsprite;
    private boolean stopped;
    private Rectangle hitbox;
    private int dir;

public Policecar (int x, int y) throws SlickException{
        gsprite = new SpriteSheet("src/images/george.png",48,48);
        gsprite.startUse();
        for (int i = 0; i < 4; i++) {
            stopImage[i] = gsprite.getSubImage(i,0);
            for (int j = 0; j < 4; j++) {
                walk[i][j]=gsprite.getSubImage(i, j);
            }
            ani[i] = new Animation(walk[i],100);
        }
        gsprite.endUse();
        hitbox = new Rectangle(x,y,26,30);
        stopped=true;
        dir=3;
    }
     
    
}
