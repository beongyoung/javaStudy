/**
 * File name : Ch4Progarm3.java
 * This is program to use While grammar to detect error control
 * 
 * @author	Beongyoung Park
 * @version	v0.1
 * @since	2023-03-22
 */

import javax.swing.JOptionPane;

public class Ch4Program3 {

	public static void main(String[] args) {
		// Declare part
		String inputStr;
		int age;

		// Input UI & Compute.
		inputStr = JOptionPane.showInputDialog(null, "Please enter your age (0-130 scale) : ");
		age = Integer.parseInt(inputStr);

		while(age < 0 || age > 130) {
			JOptionPane.showMessageDialog(null, "Invalid ag was enterred. Please try again");

			inputStr = JOptionPane.showInputDialog(null, "Please enter your age (0-130 scale) : ");
			age = Integer.parseInt(inputStr);
		}

		// Output UI
		JOptionPane.showMessageDialog(null, "Your age is " + age);
	}
}