
import org.newdawn.slick.Animation;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.state.StateBasedGame;


public abstract class Sprite extends BasicGame {
    SpriteSheet policecar;
    Animation ani[] = new Animation[2];
    Image flashinglights[][]= Image [2][1];
    Image stopImage[]= new Image [2];
     int carx=100, cary=100;
     int dir = 3; 
     boolean stop=true;

    public Sprite (String title){    
    //super(title);
    }


    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        policecar = new SpriteSheet("spritesheet.png", 48, 48);
        policecar.startUse();
        for (int i = 0; i < 4; i++) {
            stopImage[i] = policecar.getSubImage(i, 0);
            for (int j = 0; j < 4; j++) {
                flashinglights[i][j]=policecar.getSubImage(i,j);
            }
            ani[i] = new Animation(flashinglights[i],100); //100=speed
        }

        
    }


    public void update(GameContainer gc, int i) throws SlickException {
        Input in = gc.getInput();
        stop=false;
        if (in.isKeyDown(Input.KEY_RIGHT)) {
            carx++;
            dir=3;
        }
        else if(in.isKeyDown(Input.KEY_LEFT)){
            carx--;
            dir=1;
        }
        else if(in.isKeyDown(Input.KEY_DOWN)){
            cary++;
            dir=0;
        }
        else if (in.isKeyDown(Input.KEY_UP)) {
            cary--;
            dir=2;
        }
        else{
            stop=true;
        }
    }
    


    public void render(GameContainer gc, Graphics grphcs) throws SlickException {
        policecar.startUse();
        policecar.getSprite(0, 0).draw(100, 100);
        policecar.getSprite(1, 0).draw(150, 100);
        policecar.endUse();
        
    }
    

}
