/**
 * File name : Ch3Quiz.java
 * This is program to compute area, circumference
 * 
 * @author	Beongyoung Park
 * @version	v0.1
 * @since	2023-03-20
 */

import javax.swing.JOptionPane;

public class Ch3Quiz {

	final static double PI = 3.141592;
	
	public static void main(String[] args) {
		// Define variables
		double radius, area, circumference;
		
		// Input part (UI part)
		radius = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter radius : "));
		
		// Compute area and circumference
		area = PI * radius * radius;
		circumference = 2.0 * PI * radius;
		
		// Output part (Output UI design)
		JOptionPane.showMessageDialog(null, "Given Radius : " + radius + "\n" + 
											"Area : " + area + "\n" + 
											"circumference : " + circumference);
		
	}
}