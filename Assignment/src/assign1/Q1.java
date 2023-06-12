package assign1;
/*
 * File name : Q1.java
 * This is program that receives the name and student ID number from the dialog and outputs
 * 2022-03-25
 * Beongyoung Park
 */

import javax.swing.JOptionPane;

public class Q1 {

	public static void main(String[] args) {
		// Input UI
		String inputData = JOptionPane.showInputDialog(null,"Enter your name & student ID (i.e. Beongyoung Park / 2019270607)");
		
		// inputData에서 " / "를 기준으로 문자를 나누어 배열로 저
		String getStr[] = inputData.split(" / ");
		
		// getStr[0] : 이름 ,getStr[1] : 학번
		String name = getStr[0];
		String studentID = getStr[1];
		
		// Calc prob.
		int sum = 0;
		for(int i = 0; i < studentID.length(); i++) {
			// studentID.charAt(i) : ASCII 코드이기 때문에 '0'의 코드 값만큼 뺀다.
			sum += studentID.charAt(i) - '0';
		}
		
		// Output UI
		System.out.println("Hello OOP World! " + name);
		System.out.println("The sum of each number of your student number entered : " + sum);
	}
}