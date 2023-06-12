/**
 * File name : Ch2Sample1.java
 * This is program to simply show the window which is fixed size
 * 
 * @author	Beongyoung Park
 * @version	v0.1
 * @since	2023-03-15
 */

import javax.swing.JFrame;

public class Ch2Sample1 {

	public static void main(String[] args) {
		
		// 생성자 : myWindow, myWindow2
		JFrame myWindow = new JFrame();
		JFrame myWindow2 = new JFrame();
		
		// myWindow 정의
		myWindow.setSize(300,200);
		myWindow.setTitle("I'm a first window");
		myWindow.setVisible(true);
		
		// myWindow2 정의
		myWindow2.setSize(1000, 600);
		myWindow2.setTitle("I'm a second window");
		myWindow2.setVisible(true);
	}
}