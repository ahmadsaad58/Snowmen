

import javax.swing.JFrame;

/**
 * Shows an animation of moving Snowman, Snowball and SnowStack
 */
public class SnowmanViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      final int FRAME_WIDTH = 900;
      final int FRAME_HEIGHT = 900;

      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setTitle("Snow War");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      SnowComponent component = new SnowComponent();
      frame.add(component);
      frame.setVisible(true);
      component.startAnimation();
      component.startAni();
      component.startAnim();
       
   }
}

