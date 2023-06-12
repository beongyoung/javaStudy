/**
 * File name : Ch2Sample2.java
 * This is program to date
 * 
 * @author	Beongyoung Park
 * @version	v0.1
 * @since	2023-03-15
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ch2Sample2 {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf1, sdf2, sdf3, sdf4, sdf5;
		
		sdf1 = new SimpleDateFormat("MM/dd/yy");
		System.out.println(sdf1.format(date));
		
		sdf2 = new SimpleDateFormat("mm/dd/yyyy");
		System.out.println(sdf2.format(date));
	}

}