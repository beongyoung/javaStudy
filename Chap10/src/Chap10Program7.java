import java.io.*;

/**
 * Chap10Program7: Example of Object output using ObjectOutputStream
 * 
 * @author Beongyoung Park
 * @version v0.1
 * @since 2023-04-17
 */

public class Chap10Program7 {

	static int NUM_OF_ACCOUNT = 20;

	public static void main(String[] args) throws IOException {

		File outFile = new File("example4.data");
		FileOutputStream outFileStream = new FileOutputStream(outFile);
		ObjectOutputStream outObjectStream = new ObjectOutputStream(outFileStream);

		Account[] account = new Account[NUM_OF_ACCOUNT];
		
		for (int i = 0; i < NUM_OF_ACCOUNT; i++) {
			account[i] = new Account();
			account[i].setOwnerName("Student_" + (i+1));
		}

		outObjectStream.writeObject(account);
	}
}
