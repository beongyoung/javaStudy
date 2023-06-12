package assign1;
/*
 * File name : Q5.java
 * This is program that changing money to 
 * number of 50,000 10,000 5,000 1,000 500 100 50 10
 * 2022-03-25
 * Beongyoung Park
 */

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("최적의 지폐 개수를 알려주는 프로그램입니다.\n바꿀 돈을 입력하세요 >> ");
		int money = sc.nextInt();
		
		int[] currencies = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int[] count = new int[currencies.length];
		
		for(int i = 0; i < currencies.length; i++) {
			count[i] = money / currencies[i];
			money %= currencies[i];
		}
		sc.close();
		
		for(int i = 0; i < currencies.length; i++) {
			if(count[i] != 0)
				System.out.print(count[i] + "개 " + currencies[i] + "원 ");
		}
	}
}