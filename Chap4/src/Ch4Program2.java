/**
 * File name : Ch4Progarm2.java
 * This is program to divide grade as A,B,C,D,F
 * 
 * @author	Beongyoung Park
 * @version	v0.1
 * @since	2023-03-22
 */

import java.util.Scanner;

public class Ch4Program2 {
	public static void main(String[] args) {
		// Declare part
		Scanner sc = new Scanner(System.in);
		char grade;
		
		// Inupt UI
		System.out.print("Please input the score (0 - 100 scale) : ");
		
		int score = sc.nextInt();
		
		// switch case.
		switch(score / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
		
		// If conditional.
		if(score >= 90 && score <= 100) {
			grade = 'A';
		}else if(score >= 80) {
			grade = 'B';
		}else if(score >=70) {
			grade = 'C';
		}else if(score >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		// Output UI
		System.out.println("Grade will be " + grade);
	}
}
