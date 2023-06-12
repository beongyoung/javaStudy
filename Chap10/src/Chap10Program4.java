import java.io.*;

/**
 * Chap10Program4: Example of File High-level input
 * 
 * @author Beongyoung Park
 * @version v0.1
 * @since 2023-04-17
 */

public class Chap10Program4 {

	public static void main(String[] args) throws IOException {
		
		File inFile = new File("example2.data");
		FileInputStream inStream = new FileInputStream(inFile);
		DataInputStream inDataStream = new DataInputStream(inStream);

		// read an int, boolean, double
		int n = inDataStream.readInt();
		boolean b = inDataStream.readBoolean();
		double d = inDataStream.readDouble();

		inDataStream.close();

		// what did we get?
		System.out.println("n = " + n);
		System.out.println("b = " + b);
		System.out.println("d = " + d);
	}
}
