package extra;

import javax.swing.JOptionPane;

public class Banjo {
	public static void main(String[] args) {
//		String name = JOptionPane.showInputDialog("What's your name?");
//		char letter = name.charAt(0);
//		if (letter == 'r'|| letter == 'R') {
//			System.out.println(name + " plays the banjo.");
//
//		} else {
//			System.out.println(name+ " does not play the banjo.");
//		}
	String num  = JOptionPane.showInputDialog("Type in a number.");
	int j = Integer.parseInt(num);
		int sum = 0;
			for (int i = 0; i <= j; i++) {
				sum = i+sum;
			}
	System.out.println(sum);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
