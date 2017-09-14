

import javax.swing.JComponent;
import java.awt.Graphics2D;


/*
 *Snowball shapes that move 
 */
public class MovingSnowball extends Snowball
{
	public static final int NORTH = 1;
   	public static final int SOUTH = 2;
   	public static final int EAST = 3;
   	public static final int WEST = 4;
   
  	private int step;
  	private int delay;
  	private int steps;
   	private int direction;
   	private JComponent component;
	
   /**
      Creates a new MovingSnowballInstance
      @param x the x coordinate of the top left corner
      @param y the y coordinate of the top left corner
      @param s Step in pixels the SnowStack will move each time
      @param d The delay to wait between each step
      @param ss How many times the MovingSnowball will move
      @param dd In which direction the MovingSnowball will move
      @param c The component
    */
   public MovingSnowball(int x, int y, int s, int d, int ss, int dd, JComponent c)
   {
      super(x, y);
      step = s;
      delay = d;
      steps = ss;
      direction = dd;
      component = c;
   }
   
   /**
    * Adjusts the Snowball's x and y locations based on the direction it is going.  Moves it a fixed
    * number of steps.
    */
   public void animate() throws InterruptedException
   {
      for (int i = 0; i < steps; i++)
      {
         int x = 0;
         int y = 0;
         switch(direction)
         {
            case NORTH: y = -1 * step;
               break;
            case SOUTH: y = step;
               break;
            case EAST: x = step;
               break;
            case WEST: x = -1 * step;
         }
         
         move(x, y);
         pause();
      }
   }
   
    /**
      Draws the Snowball in the current position.
      @param g2 the graphics context
   */
   public void draw(Graphics2D g2)
   {
      super.draw(g2);
   }
   
   /**
      Pauses the animation.
   */
   public void pause() throws InterruptedException
   {
      component.repaint();
      Thread.sleep(delay);
   }
   
   
}