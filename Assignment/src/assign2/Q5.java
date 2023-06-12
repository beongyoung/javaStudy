package assign2;
/**
 * The Q5 program
 * This program > 유저의 성별과 키에 따라 적정 체중을 계산해주는 프로그램
 * 
 * @author Beongyoung Park
 * @version 1.0
 * @since 2023-04-15
 */

import javax.swing.JOptionPane;

public class Q5 {
    public static void main(String[] args) {
        Object[] options = {"Male", "Female"};
        int genderOption = JOptionPane.showOptionDialog(null, "Select your gender:",
        		"Gender Selection", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        String gender;
        
        if (genderOption == 0) {
            gender = "Male";
        } else {
            gender = "Female";
        }
        
        String heightStr;
        int height = 0;
        while (true) {
            heightStr = JOptionPane.showInputDialog(null, "Enter your height in centimeters:");
            if (heightStr.matches("\\d+")) {
                height = Integer.parseInt(heightStr);
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Please enter digits only.");
            }
        }
        
        double idealWeight;
        if (gender.equalsIgnoreCase("Female")) {
            if (height > 150) {
                idealWeight = 37.8 + 0.75 * (height - 150);
            } else {
                idealWeight = 37.8;
            }
        } else {
            if (height > 150) {
                idealWeight = 40 + 0.89 * (height - 150);
            } else {
                idealWeight = 40;
            }
        }
        JOptionPane.showMessageDialog(null, "Your ideal weight is: " + idealWeight + "kg");
    }
}