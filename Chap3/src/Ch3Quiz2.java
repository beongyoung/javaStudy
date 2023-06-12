/**
 * File name : Ch3Quiz2.java
 * This is program to type change time to hr, min, sec
 * 
 * @author	Beongyoung Park
 * @version	v0.1
 * @since	2023-03-20
 */

import java.util.Scanner;

public class Ch3Quiz2 {
	final static int UNIT_CHANGER = 60;
	public static void main(String[] args) {
		// Input UI
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the seconds unit as integer value : ");
		
		// Main Calc.
		int time = sc.nextInt();
		int second = time % UNIT_CHANGER;
		int minute = (time / UNIT_CHANGER);
		int hour = (time / UNIT_CHANGER) / UNIT_CHANGER;
		
		// Close scanner
		sc.close();
		
		// Output UI
		System.out.print(time + " second is ");
		System.out.print(hour + "hr., ");
		System.out.print(minute + "min. , and ");
		System.out.print(second + " sec.");
	}
}