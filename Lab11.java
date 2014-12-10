/**
 * An algorithm helps an Athlete solve a maze, perhaps by keeping one hand against a wall.
 * 
 * @author <Jordan Koski>
 * @version <8th December>
 *
 */

import edu.fcps.karel2.Display;
import edu.fcps.Digit;

public class Lab11 {
	 
	 public static void main(String[] args) {
    
    //Display.openWorld("maps/.map");
         Display.setSize(42, 37);
         Display.setSpeed(10);
         
         Digit first = new One (5,10);
         Digit second = new One (15,10);
         Digit third = new Nine (25,10);
         Digit fourth = new Three (35,10);
         
         first.display();
         second.display();
         third.display();
         fourth.display();

      

	
	 
    }
	 
 }
