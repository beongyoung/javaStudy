/**
 * File name : HelloWorld.java
 * This is program to simply show the your input name with Hello World!
 * 
 * @author	Beongyoung Park
 * @version	v0.1
 * @since	2023-03-13
 */

import javax.swing.JOptionPane;

public class HelloWorld {

	public static void main(String[] args) {
		// Main function : class by class

		/*
		 * System.out.println("Hello World"); // Charactor User Interface -> GUI
		 * programming
		 */

		// 단일 주석 : command + /
		// 여러줄 주석 : command + control + /
		// 여러줄 주석 해제 : command + control + \
		// 코드 정리 : command + i
		// 자동완성 : control + command + space

		String firstName = JOptionPane.showInputDialog(null, "Please Enter the tour first name");
		String lastName = JOptionPane.showInputDialog(null, "Please Enter the tour last name");

		JOptionPane.showMessageDialog(null, "Hello World! " + firstName + " " + lastName);

	}
}