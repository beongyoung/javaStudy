/**
 * File name : Ch4Progarm1.java
 * This is program to selection grammar
 * 
 * @author	Beongyoung Park
 * @version	v0.1
 * @since	2023-03-22
 */

public class Ch4Program1 {
	public static void main(String[] args) {
		int firstNum = 10, secondNum = 5;
		String outputGudTxt = "Difference between two values : ";
		
		// Binary selection grammar
		System.out.println(outputGudTxt + ((firstNum > secondNum) ? (firstNum - secondNum) : (secondNum - firstNum)));
		
		// If conditional statement
		if(firstNum > secondNum) {
			System.out.println(firstNum - secondNum);
		}else {
			System.out.println(secondNum - firstNum);
		}
	}
}
