package assign1;
/*
 * File name : Q6.java
 * This is program that input date format(YYYY-MM-DD)
 * and show korean standard season
 * 2022-03-25
 * Beongyoung Park
 */

import javax.swing.JOptionPane;

public class Q6 {

	public static void main(String[] args) {
		String date = JOptionPane.showInputDialog(null, "날짜(YYYY-MM-DD)의 형식으로 입력주세요.");
		String[] dateSplit = date.split("-");

		int month = Integer.parseInt(dateSplit[1]);
		String season = "";

		if(month >= 1 && month <= 12) {
			if(month >= 3 && month <= 5)
				season = "봄";
			else if(month >= 6 && month <= 8)
				season = "여름";
			else if(month >= 9 && month <= 11)
				season = "가을";
			else
				season = "겨울";
		}else {
			JOptionPane.showMessageDialog(null, "다시 입력해주세요.");
			date = JOptionPane.showInputDialog(null, "날짜(YYYY-MM-DD)의 형식으로 입력주세요.");
		}

		JOptionPane.showMessageDialog(null, month + "월의 계절은 " + season + "입니다.");
	}
}