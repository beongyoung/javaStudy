/**
 * File name : Ch2Sample2.java
 * This is program to initial (today)
 * 
 * @author	Beongyoung Park
 * @version	v0.1
 * @since	2023-03-15
 */

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class Ch2Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName = JOptionPane.showInputDialog(null, "Input First Name");
		String secondName = JOptionPane.showInputDialog(null, "Input Second Name");
		String thirdName = JOptionPane.showInputDialog(null, "Input Third Name");

		String initial = firstName.substring(0, 1) + secondName.substring(0,1) + thirdName.substring(0, 1);

		Date today = new Date();
		SimpleDateFormat sdf;

		sdf = new SimpleDateFormat("yyyy-MM-dd");
		JOptionPane.showMessageDialog(null,initial +"("+sdf.format(today)+")");
	}
}