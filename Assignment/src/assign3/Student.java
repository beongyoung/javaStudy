package assign3;

import java.io.Serializable;

/**
 * The Student class
 * This program is the student class
 * 
 * @author Beongyoung Park
 * @version 1.0
 * @since 2023-06-10
 */

@SuppressWarnings("serial")
public class Student implements Serializable {
    private String department;
    private String studentId;
    private String gender;
    private double height;
    private double weight;
    private double gpa;
    
    // static variable to keep track of the last assigned ID
    private static int lastAssignedId = 0;

 // constructor 2, initialize gender, weight, gpa
    public Student(String gender, double height, double weight, double gpa) {
    	this.studentId = generateNextStudentId();
        this.gender = gender;
        this.weight = weight;
        this.gpa = gpa;
    }

    // constructor 2, initialize gender, height, weight
    public Student(String gender, double height, double weight) {
    	this.studentId = generateNextStudentId();
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    // constructor 3, initialize all data members
    public Student(String department, String gender, double height, double weight, double gpa) {
        this.department = department;
        this.studentId = generateNextStudentId();
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.gpa = gpa;
    }

    // method to generate the next ID
    private static String generateNextStudentId() {
        lastAssignedId++;
        return String.format("Student_%05d", lastAssignedId);
    }

    // getter methods
    public String getDepartment() {
        return department;
    }
    
    public String getStudentId() {
        return studentId;
    }

    public String getGender() {
        return gender;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
    
    public double getGpa() {
    	return gpa;
    }
    
    @Override
    public String toString() {
        return "Student" + lastAssignedId++ + "{" +
        		"studentId=" + studentId +
                ", department=" + department +
                ", gender='" + gender + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", gpa=" + gpa +
                '}';
    }
}