package assign2;
/**
 * The Q4 program
 * This program > 8개의 정수를 입력 받아 1차원 배열에 할당한 뒤, 이를 오름차순으로 정렬할 수 있는 프로그램
 * 
 * @author Beongyoung Park
 * @version 1.0
 * @since 2023-04-15
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		int[] arr = new int[8];
		Scanner sc = new Scanner(System.in);

		// Get input from user
		for (int i = 0; i < arr.length; i++) {
			while (true) {
				try {
					System.out.print((i + 1) + "번째 정수 입력: ");
					arr[i] = sc.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println("Input value is not Integer. Please try it again!");
					sc.nextLine();
				}
			}

		}

		// Sort the array using bubble sort algorithm
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		// Print the sorted array
		System.out.println("\n정렬된 배열을 오름차순으로 출력:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}