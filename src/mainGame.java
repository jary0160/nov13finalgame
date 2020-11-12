import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class mainGame extends BasicGameState {
    Car car;
    public mainGame(String title){
        
    }
    private Image grass;
    private Image road;
    mainGame() {
    }
    

    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
       car = new Car(0,170);
    }

    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException { 

    }
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
       g.setColor(Color.red);
       g.drawString("This is the main game", 100,200);
       grass = new Image("Back.png");
       road = new Image("Road.1.png");    
       grass.draw(100,100);
    }
    
    public int getID() {
       return 1;  //this id will be different for each screen
    }
}

    