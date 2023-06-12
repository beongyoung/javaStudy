package assign1;
/*
 * File name : Q3.java
 * This is program that convert Korean won into Dollar through the dialog
 * 2022-03-25
 * Beongyoung Park
 */

import javax.swing.JOptionPane;

public class Q3 {
	final static double dollar = 1295.83;
	
	public static void main(String[] args) {
		int won = Integer.parseInt(JOptionPane.showInputDialog(null, "원화를 달러로 변환하는 프로그램입니다.\n바꾸고 싶은 원을 입력하세요(환율 : $1당 1295.83"));
		JOptionPane.showMessageDialog(null, "변환된 달러 : $" + won / dollar);
	}
}