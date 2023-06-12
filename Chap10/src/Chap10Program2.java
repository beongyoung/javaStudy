import java.io.*;

/**
 * Chap10Program2: Example of File binary input using FileInputStream
 * 
 * @author Beongyoung Park
 * @version v0.1
 * @since 2023-04-17
 */

public class Chap10Program2 {

	public static void main(String[] args) throws IOException {
		
		//set up file and stream
		File inFile	  = new File("example1.data");
		FileInputStream inStream = new FileInputStream(inFile);

		//set up an array to read data in
		int    fileSize  = (int)inFile.length();
		byte[] byteArray = new byte[fileSize];

		//read data in and display them
		inStream.read(byteArray);
		for (int i = 0; i < fileSize; i++) {
			System.out.println(byteArray[i]);
		}

		//input done, so close the stream
		inStream.close();
	}
}
