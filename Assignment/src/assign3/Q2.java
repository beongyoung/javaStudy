package assign3;
/**
 * The Q2 program
 * This program show the GUI to add and view students
 * 
 * @author Beongyoung Park
 * @version 1.0
 * @since 2023-06-10
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q2 extends JFrame implements ActionListener {
    private JTextField departmentField;
	private JTextField genderField;
    private JTextField heightField;
    private JTextField weightField;
    private JTextField gpaField;
    
    private JButton addButton;
    private JButton viewButton;

    private JTextArea studentListArea;

    private Q1 statistics;

    public Q2(Q1 statistics) {
        // Set up the JFrame properties
        setTitle("Student Information System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create the components
        departmentField = new JTextField();
        genderField = new JTextField();
        heightField = new JTextField();
        weightField = new JTextField();
        gpaField = new JTextField();
        addButton = new JButton("Add Student");
        viewButton = new JButton("View Students");
        studentListArea = new JTextArea();

        // Add ActionListener to the Add button
        addButton.addActionListener(this);
        viewButton.addActionListener(this);

        // Create a panel to hold the input fields and button
        JPanel inputPanel = new JPanel(new GridLayout(7, 3));
        inputPanel.add(new JLabel("Department:"));
        inputPanel.add(departmentField);
        inputPanel.add(new JLabel("Gender:"));
        inputPanel.add(genderField);
        inputPanel.add(new JLabel("Height:"));
        inputPanel.add(heightField);
        inputPanel.add(new JLabel("Weight:"));
        inputPanel.add(weightField);
        inputPanel.add(new JLabel("GPA:"));
        inputPanel.add(gpaField);
        inputPanel.add(new JLabel());
        inputPanel.add(addButton);
        inputPanel.add(new JLabel());
        inputPanel.add(viewButton);

        // Add the input panel and student list area to the main JFrame
        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(studentListArea), BorderLayout.CENTER);

        // Set the statistics field to the provided Q1 instance
        this.statistics = statistics;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            // Get the input values from the text fields
        	String department = departmentField.getText();
            String gender = genderField.getText();
            double height = Double.parseDouble(heightField.getText());
            double weight = Double.parseDouble(weightField.getText());
            double gpa = Double.parseDouble(gpaField.getText());

            // Create a new Student object with the input values
            Student newStudent = new Student(department, gender, height, weight, gpa);

            // Add the newStudent to the Q1 instance
            statistics.addStudent(newStudent);

            // Clear the input fields
            departmentField.setText("");
            genderField.setText("");
            heightField.setText("");
            weightField.setText("");
            gpaField.setText("");

            // Update the student list area
            studentListArea.append(newStudent.toString() + "\n");
        } else if (e.getSource() == viewButton) {
            // Retrieve all registered students' information from the Q1 instance
            StringBuilder studentsInfo = new StringBuilder();
            Student[] students = statistics.getStudents();
            System.out.println(students.length);
            for (Student student : students) {
            	studentsInfo.append("Student ID: ").append(student.getStudentId()).append("\n");
            	studentsInfo.append("Department: ").append(student.getDepartment()).append("\n");
                studentsInfo.append("Gender: ").append(student.getGender()).append("\n");
                studentsInfo.append("Weight: ").append(student.getWeight()).append("\n");
                studentsInfo.append("Height: ").append(student.getHeight()).append("\n");
                studentsInfo.append("GPA: ").append(student.getGpa()).append("\n");
                studentsInfo.append("\n");
            }

            // Display the information in a dialog box or separate window
            JOptionPane.showMessageDialog(this, studentsInfo.toString(), "Students", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        // Create an instance of the Q1 class
        Q1 statistics = new Q1();

        // Create an instance of the Q2 class and pass the Q1 instance
        Q2 studentSystem = new Q2(statistics);

        // Make the JFrame visible
        studentSystem.setVisible(true);
    }
}