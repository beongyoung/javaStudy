package assign2;
/**
 * The student class
 * studentName, ID, Sex, GPA are random
 * 
 * @author Beongyoung Park
 * @version 1.0
 * @since 2023-04-15
 */

import java.util.Random;

public class student {
    public String studentName;
    private int studentID;
    private String studentSex;
    private double studentGPA;
    
    public student() {
        Random rand = new Random();
        this.studentName = "Student" + (rand.nextInt(10000) + 1);
        this.studentID = (rand.nextInt(100000) + 1);
        this.studentSex = rand.nextBoolean() ? "Male" : "Female";
        this.studentGPA = rand.nextDouble() * 4.5;
    }

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentSex() {
		return studentSex;
	}

	public void setStudentSex(String studentSex) {
		this.studentSex = studentSex;
	}

	public double getStudentGPA() {
		return studentGPA;
	}

	public void setStudentGPA(double studentGPA) {
		this.studentGPA = studentGPA;
	}    
}