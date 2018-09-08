import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot r2d2 = new Robot();
			
		//2. Set the speed to 100
		r2d2.setSpeed(100);
		int colorChoice=JOptionPane.showOptionDialog(null, "What color would you like?", "Colored Polygons", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"RED","BLUE", "BLACK","GREEN","CYAN"}, 0);
		
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		if(colorChoice == 0) {
			r2d2.setPenColor(Color.RED);
		}
		if(colorChoice == 1) {
			r2d2.setPenColor(Color.BLUE);
		}
		if(colorChoice == 2) {
			r2d2.setPenColor(Color.BLACK);
		}
		if(colorChoice == 3) {
			r2d2.setPenColor(Color.GREEN);
		}
		if(colorChoice == 4) {
			r2d2.setPenColor(Color.CYAN);
		}
		//4. Ask the user how many polygons they want to be drawn.
		String p = JOptionPane.showInputDialog("How many polygons would you like to draw?");
		
		//5. Use the robot to draw the number of polygons the user requested.
		int polygon = Integer.parseInt(p);
		r2d2.penDown();
			r2d2.setX(250);
			r2d2.setY(300);
		for (int i = 0; i < polygon; i++) {
			for (int j = 0; j < 8; j++) {
				r2d2.move(50);
				r2d2.turn(100/2);
			}
			r2d2.turn(100);
		}
		//6. Make it so your shapes do not overlap
		
		//7. Challenge: add more colors to the Option Dialog.
	}
}

