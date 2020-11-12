
import javax.swing.Timer;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;


public class Obstacles {
    private Image car1;
    private Image car2;
    private Image car3;
    private Image car4;
    private Image car5;
    private Image police;
    private int yPosition;
    //private final Timer timer;
    Obstacles()throws SlickException{
        Image obstacles[] = new Image[10];
        car1 = new Image("car-truck1.png");
        car2 = new Image("car-truck2.png");
        car3 = new Image("car-truck3.png");
        car4 = new Image("car-truck4.png");
        car5 = new Image("car-truck5.png");
        police = new Image("police car.png");
        obstacles[0] = car1;
        obstacles[1] = car2;
        obstacles[2] = car3;
        obstacles[3] = car4;
        obstacles[4] = car5;
        obstacles[5] = police;
   
        
    }
}