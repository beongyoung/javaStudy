package assign3;
/**
 * The Q1 program
 * This program show the difference student height, weight from
 * average 10,000 students.
 * 
 * @author Beongyoung Park
 * @version 1.0
 * @since 2023-06-10
 */

import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

public class Q1 extends SimpleStatistics{
	public static final int MAX_STUDENTS = 10000;
    public static int numStudents = 0;
    public static Student[] students = new Student[MAX_STUDENTS];

    @Override
    public double getMax(double[] variable) {
        double max = variable[0];
        for (int i = 1; i < variable.length; i++) {
            if (variable[i] > max) {
                max = variable[i];
            }
        }
        return max;
    }

    @Override
    public double getMin(double[] variable) {
        double min = variable[0];
        for (int i = 1; i < variable.length; i++) {
            if (variable[i] < min) {
                min = variable[i];
            }
        }
        return min;
    }

    @Override
    public double getMean(double[] variable) {
        double sum = 0;
        for (int i = 0; i < variable.length; i++) {
            sum += variable[i];
        }
        return sum / variable.length;
    }
    
    @Override
    public double getConditionalMean(String condition, double[] variable) {
    	double maleSum = 0, femaleSum = 0;
        int maleCount = 0, femaleCount = 0;
    	
        for (int i = 0; i < variable.length; i++) {
        	if(condition.equals("male")){
        		maleSum += variable[i];
        		maleCount++;
            }
        	else {
        		femaleSum += variable[i];
        		femaleCount++;
        	}
        }
        
        if(condition.equals("male")){
    		return maleSum / maleCount;
        }
    	else {
    		return femaleSum / femaleCount;
    	}
    }
    
    public void addStudent(Student newStudent) {
		if (numStudents < MAX_STUDENTS) {
            students[numStudents] = newStudent;
            numStudents++;
        }
	}

    public Student[] getStudents() {
		return Arrays.copyOf(students, numStudents);
	}
	
    public static void main(String[] args) {
        final int numStudents = 10000;
        String[] departments = {"cs", "gs", "as"};
        Student[] students = new Student[numStudents];
        Random random = new Random();

        for (int i = 0; i < numStudents; i++) {
        	String department = departments[random.nextInt(departments.length)];
            String gender = (random.nextBoolean()) ? "male" : "female";
            double heightMean = (gender.equals("male")) ? 173 : 162;
            double weightMean = (gender.equals("male")) ? 68 : 52;
            
            float gpa = (float) (random.nextDouble() * 4.5);
            double height = heightMean + (random.nextGaussian() * 5);
            double weight = weightMean + (random.nextGaussian() * 5);

            students[i] = new Student(department, gender, height, weight, gpa);
        }
        
        Q1 statistics = new Q1();
        for (int i = 0; i < numStudents; i++) {
            statistics.addStudent(students[i]);
        }
        
        Q2 studentSystem = new Q2(statistics);
        Q3.exportStudentBackup(students, "2019270607", "BeongyoungPark");
        studentSystem.setVisible(true);

        // Calculate the average heights and weights for male and female students
        double[] heights = new double[students.length];
        double[] weights = new double[students.length];
        for (int i = 0; i < students.length; i++) {
            heights[i] = students[i].getHeight();
            weights[i] = students[i].getWeight();
        }
        double maleHeightMean = statistics.getConditionalMean("male", heights);
        double femaleHeightMean = statistics.getConditionalMean("female", heights);
        double maleWeightMean = statistics.getConditionalMean("male", weights);
        double femaleWeightMean = statistics.getConditionalMean("female", weights);

        // Receive user input
        String userGender = JOptionPane.showInputDialog(null, "Enter your gender (male/female):");
        double userHeight = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your height:"));
        double userWeight = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your weight:"));

        // Calculate differences and display the results
        double heightDifference;
        double weightDifference;
        if (userGender.equalsIgnoreCase("male")) {
            heightDifference = userHeight - maleHeightMean;
            weightDifference = userWeight - maleWeightMean;
        } else {
            heightDifference = userHeight - femaleHeightMean;
            weightDifference = userWeight - femaleWeightMean;
        }
        
        System.out.println(students.length);
        String resultMessage = String.format("Your height is %.2f units different from the average height, and your weight is %.2f units different from the average weight.", heightDifference, weightDifference);
        JOptionPane.showMessageDialog(null, resultMessage);
    }
}