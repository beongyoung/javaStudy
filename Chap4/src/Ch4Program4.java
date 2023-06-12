/**
 * File name : Ch4Progarm4.java
 * This is program to use millisec.
 * 
 * @author	Beongyoung Park
 * @version	v0.1
 * @since	2023-03-22
 */

import java.util.Date;

public class Ch4Program4 {

	public static void main(String[] args) {
		Date startTime = new Date();
		
		// Nested-for statement
		for(int i = 0; i <= 100000; i++) {
			for(int j = 0; j <= 10000; j++) {
				for(int k = 0; k <= 10000; k++) {

				}
			}
		}

		Date endTime = new Date();
		
		long elapsedTimeInMilliSec = 
				endTime.getTime() - startTime.getTime();
		System.out.println("ElapsedTime: " + elapsedTimeInMilliSec + " ms");
	}
}