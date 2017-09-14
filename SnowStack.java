import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.*;;

import java.awt.*; 
import java.util.*; 
 

/**
   A SnowStack shape that can be added to the screen.
*/
public class SnowStack
{

	public static int WIDTH = 60;
  	public static int HEIGHT = 30;
   	private int xL;
   	private int yT; 
   	private Color col; 
   	
   /**
      Constructs a SnowStack with a given top left corner
      @param x the x coordinate of the top left corner
      @param y the y coordinate of the top left corner
   */
   public SnowStack(int x, int y)
   {
      xL = x;
      yT = y;
      col = new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)); 
      
   }

   /**
      Moves the SnowStack.
      @param dx the amount to move in x-direction
      @param dy the amount to move in y-direction
   */
   public void move(double dx, double dy)
   {
      xL += dx;
      yT += dy;
   }

   /**
      Draws the SnowStack.
      @param g2 the graphics context
   */
   public void draw(Graphics2D g2)
   { 
   		g2.setColor(col);
   		 
      	Rectangle2D.Double body = new Rectangle2D.Double(xL, yT, 40, 40);
      	Rectangle2D.Double top = new Rectangle2D.Double(xL+10, yT-20, 20, 20);
      
     
   
	      g2.fill(body);
	      g2.fill(top);
      
      
           
   }
   
}