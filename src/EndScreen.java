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

public class EndScreen extends BasicGameState {
    Image img;
    static String message="Your Score: ";
    static int msgx=100;
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
       img = new Image("src/images/EndScreen.png");
    }
    

    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException { 
        Input in = gc.getInput();
       
       //if(in.isMousePressed(Input.MOUSE_LEFT_BUTTON)){
          // sbg.enterState(1,new FadeOutTransition(), new FadeInTransition());
       //}
       /*
       if (in.isKeyDown(Input.KEY_SPACE)){
       }*/
    }
    public static void setMessage(String msg, int x){
        message= msg;
        msgx=x;
    }

    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        //g.setColor(Color.yellow);
       //g.drawString("Game Over",100,200);
       img.draw(0,25);
       g.setColor(Color.green);
        //g.drawString("Game Over",300,150);
        g.drawString(message,msgx,470);
        g.drawRoundRect(80,460,600,40,20);
    }
    
    public int getID() {
       return 2;  //this id will be different for each screen
    }
}