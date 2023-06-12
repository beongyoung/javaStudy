import java.io.*;

/**
 * Chap10Program5: Example of Text-file output
 * 
 * @author Beongyoung Park
 * @version v0.1
 * @since 2023-04-17
 */

public class Chap10Program5 {

	public static void main(String[] args) throws IOException {
		
		//set up file and stream
		File outFile = new File("example3.data");
		FileOutputStream outFileStream 
				= new FileOutputStream(outFile);
		PrintWriter outStream = new PrintWriter(outFileStream);

		//write values of primitive data types to the stream
		outStream.println(10);
		outStream.println("Hello, world.");
		outStream.println(true);

		//output done, so close the stream
		outStream.close();
		
	}
}
