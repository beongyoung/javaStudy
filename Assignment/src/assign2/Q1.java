package assign2;
/**
 * The Q1 program
 * This program show the highestGPA student info.
 * 
 * @author Beongyoung Park
 * @version 1.0
 * @since 2023-04-15
 */

public class Q1 {
    public static void main(String[] args) {
        student[] students = new student[10000];
        for (int i = 0; i < students.length; i++) {
            students[i] = new student();
        }
        findHighestGPA(students);
    }

    public static void findHighestGPA(student[] students) {
        student highestGPAStudent = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].getStudentGPA() > highestGPAStudent.getStudentGPA()) {
                highestGPAStudent = students[i];
            }
        }
        System.out.println("Name: " + highestGPAStudent.studentName);
        System.out.println("ID: " + highestGPAStudent.getStudentID());
        System.out.println("Sex: " + highestGPAStudent.getStudentSex());
        System.out.println("GPA: " + highestGPAStudent.getStudentGPA());
    }
}
