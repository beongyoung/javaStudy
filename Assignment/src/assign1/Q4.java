package assign1;
/*
 * File name : Q4.java
 * This is program that input 9 number to fill 4*4 matrix, 
 * 3*3 is input number, remain is row sum or col sum
 * 2022-03-25
 * Beongyoung Park
 */

import javax.swing.JOptionPane;

public class Q4 {

	public static void main(String[] args) {
		int arr[][] = new int[4][4];
		
		String num = JOptionPane.showInputDialog(null, "9개의 정수 입력하세요. (i.e. 1,2,3,4,5,6,7,8,9) : ");
		String[] splitNum = num.split(",");
		
		int pos = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				arr[i][j] = Integer.parseInt(splitNum[pos]);
				pos++;
			}
		}
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				arr[i][3] = arr[i][0] + arr[i][1] + arr[i][2];
				arr[3][j] = arr[0][j] + arr[1][j] + arr[2][j];
				System.out.format("%3d", arr[i][j]);
			}
			System.out.println("\n");
		}
	}
}