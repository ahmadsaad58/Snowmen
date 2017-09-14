

import java.awt.*;
import java.awt.image.*; 
import javax.swing.*;
import java.io.*;
import javax.imageio.ImageIO; 


/**
   This component draws four Snowman, two Snowball, and four SnowStack shapes.
*/
public class SnowComponent extends JComponent 
{ 
	private MovingSnowman snow1;
   	private MovingSnowman snow2;
   	private MovingSnowman snow3;
   	private MovingSnowman snow4;
   	private MovingSnowStack ss1;
   	private MovingSnowStack ss2;
   	private MovingSnowStack ss3;
   	private MovingSnowStack ss4;
   	private MovingSnowball sb1;
   	private MovingSnowball sb2; 
   	private BufferedImage background; 
	/**
	 * Adds Snowman, Snowball and SnowStack shapes to the component
	 */
   public SnowComponent()
   {
      snow1 = new MovingSnowman(50,300, ((int)(Math.random()*20)), 250, 500, MovingSnowman.EAST, this);
      snow2 = new MovingSnowman(700, 300, ((int)(Math.random()*20)), 250, 500, MovingSnowman.WEST, this); 
      snow3 = new MovingSnowman(100, 100, ((int)(Math.random()*20)), 250, 500, MovingSnowman.EAST, this);
      snow4 = new MovingSnowman(800, 100, ((int)(Math.random()*20)), 250, 500, MovingSnowman.WEST, this);
      ss1 = new MovingSnowStack(50, 500, ((int)(Math.random()*20)), 250, 500, MovingSnowStack.EAST, this);
      ss2 = new MovingSnowStack(500, 500, ((int)(Math.random()*20)), 250, 500, MovingSnowStack.WEST, this);
      ss3 = new MovingSnowStack(50, 700, ((int)(Math.random()*20)), 250, 500, MovingSnowStack.EAST, this);
      ss4 = new MovingSnowStack(700, 700, ((int)(Math.random()*20)), 250, 500, MovingSnowStack.WEST, this); 
      sb1 = new MovingSnowball(50, 300, 20, 250, 500, MovingSnowball.EAST, this); 
      sb2 = new MovingSnowball(800, 100, 20, 250, 500, MovingSnowball.WEST, this);
      
   }
   
   /**
    * Draws the Snowman, Snowball and SnowStack
    */
   public void paintComponent(Graphics g) 
   {  
   	
   		try
   		{
   			background =  ImageIO.read(new File("snow.jpg"));	
   		}
   		catch(IOException e)
   		{
   			
   		}
   	  
      Graphics2D g2 = (Graphics2D) g;
      g2.drawImage(background, null, 0, 0);

      snow1.draw(g2);
      snow2.draw(g2);
      snow3.draw(g2);
      snow4.draw(g2);
      ss1.draw(g2);
      ss2.draw(g2);
      ss3.draw(g2);
      ss4.draw(g2);
      sb1.draw(g2);
      sb2.draw(g2); 
      
      
   }
   
   /**
      Starts a new animation thread for the Snowman.
   */
   public void startAnimation()
   {
      class AnimationRunnable implements Runnable
      {
      		private MovingSnowman snowman;
         
         public AnimationRunnable(MovingSnowman s)
         {
            snowman = s;
         }
         

         public void run()
         {
            try
            {
               snowman.animate();
            }
            catch (InterruptedException exception)
            {
            }
         }
         
      }

      Runnable r1 = new AnimationRunnable(snow1);
      Runnable r2 = new AnimationRunnable(snow2);
      Runnable r3 = new AnimationRunnable(snow3);
      Runnable r4 = new AnimationRunnable(snow4);
      Thread t1 = new Thread(r1);
      Thread t2 = new Thread(r2);
      Thread t3 = new Thread(r3);
      Thread t4 = new Thread(r4);
      t1.start();
      t2.start();
      t3.start();
      t4.start();
      
      
   }
   
   
   /**
      Starts a new animation thread for the SnowStack.
   */
   public void startAni()
   {
      class AnimationRunnable implements Runnable
      {
      		
      		private MovingSnowStack snowStack;
         
         
         public AnimationRunnable(MovingSnowStack ss)
         {
            snowStack = ss;
         }

         public void run()
         {
            try
            {
               snowStack.animate();
            }
            catch (InterruptedException exception)
            {
            }
         }
         
      }
      
      Runnable rr1 = new AnimationRunnable(ss1);
      Runnable rr2 = new AnimationRunnable(ss2);
      Runnable rr3 = new AnimationRunnable(ss3);
      Runnable rr4 = new AnimationRunnable(ss4);
      Thread tt1 = new Thread(rr1);
      Thread tt2 = new Thread(rr2);
      Thread tt3 = new Thread(rr3);
      Thread tt4 = new Thread(rr4);
      tt1.start();
      tt2.start();
      tt3.start();
      tt4.start();
      
   }
   
   /**
      Starts a new animation thread for the Snowball.
   */
   public void startAnim()
   {
      class AnimationRunnable implements Runnable
      {
      		private MovingSnowball snowball;
         
         public AnimationRunnable(MovingSnowball s)
         {
            snowball = s;
         }
         

         public void run()
         {
            try
            {
               snowball.animate();
            }
            catch (InterruptedException exception)
            {
            }
         }
         
      }

      Runnable rs1 = new AnimationRunnable(sb1);
      Runnable rs2 = new AnimationRunnable(sb2);
      
      Thread ts1 = new Thread(rs1);
      Thread ts2 = new Thread(rs2);
      
      ts1.start();
      ts2.start();
      
      
      
   }
   
   
}