import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;

public class startScreen extends BasicGameState {

 
    private Image img;
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
    img = new Image("src/startscreen2.png");   
    }
    

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException { 
        Input in = gc.getInput();
       
       if(in.isMousePressed(Input.MOUSE_LEFT_BUTTON)){
           sbg.enterState(1,new FadeOutTransition(), new FadeInTransition());
       }

    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
       g.setColor(Color.yellow);
       img.draw(0,0);
       g.drawString("Welcome to my game - click mouse to continue",212,450);
       
       
    }
    
    @Override
    public int getID() {
       return 0;
    }
}


    