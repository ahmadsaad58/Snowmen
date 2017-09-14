

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.*; 
import java.util.*; 
 

/**
   A Snowball shape that can be positioned anywhere on the screen.
*/
public class Snowball
{
   	private int xL;
   	private int yT; 
   	private Color col; 
   	
   /**
      Constructs a Snowball with a given top left corner
      @param x the x coordinate of the top left corner
      @param y the y coordinate of the top left corner
   */
   public Snowball(int x, int y)
   {
      xL = x;
      yT = y;
      col = new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)); 
      
   }

   /**
      Moves the Snowball.
      @param dx the amount to move in x-direction
      @param dy the amount to move in y-direction
   */
   public void move(double dx, double dy)
   {
      xL += dx;
      yT += dy;
   }

   /**
      Draws the Snowball.
      @param g2 the graphics context
   */
   public void draw(Graphics2D g2)
   { 
   		g2.setColor(col); 
      	Ellipse2D.Double ball = new Ellipse2D.Double(xL, yT, 17, 17);

          g2.fill(ball);
	      
      
      
           
   }

 
}