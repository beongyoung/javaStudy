package assign1;
/*
 * File name : Q2.java
 * This is program that input birthday to today calculate age
 * 2022-03-25
 * Beongyoung Park
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Q2 {
	final static int second = 1000;
	final static int minute = 60;
	final static int hour = 60;
	final static int day = 24;
	final static long year = 365L;
	
	public static void main(String[] args) {
		String birthDay = JOptionPane.showInputDialog(null, "생일을 입력하세요 (YYYY-MM-DD) ");
		SimpleDateFormat birthFormat = new SimpleDateFormat("YYYY-MM-DD");
		Date birthDate = null;
		
		try {
			birthDate = birthFormat.parse(birthDay);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Date currentDate = new Date();
		long diffMillis = currentDate.getTime() - birthDate.getTime();
		long ageMillis = second * minute * hour * day * year;
		int age = (int)(diffMillis/ageMillis);
		
		JOptionPane.showMessageDialog(null, "나이는 " + age + "살 입니다.");
	}
}