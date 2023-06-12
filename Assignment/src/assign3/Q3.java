package assign3;
/**
 * The Q3 program
 * This program create backup file created on Q1 program
 * and open backup file.
 * 
 * @author Beongyoung Park
 * @version 1.0
 * @since 2023-06-10
 */
import java.io.*;

public class Q3 {
    private static final String BACKUP_FILENAME = "backup2019270607_BeongyoungPark.data";

	public static void exportStudentBackup(Student[] students, String id, String name) {
        try {
            String filename = BACKUP_FILENAME.replace("2019270607", id).replace("박병영", name);

            FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(students);

            objectOut.close();
            fileOut.close();

            System.out.println("Student backup exported to: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readStudentBackup(String filename) {
        try {
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            Student[] students = (Student[]) objectIn.readObject();

            objectIn.close();
            fileIn.close();

            System.out.println("Backup file contents:");
            for (Student student : students) {
                System.out.println(student);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readStudentBackup(BACKUP_FILENAME);
    }
}
