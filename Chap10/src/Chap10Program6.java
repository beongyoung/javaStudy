import java.io.*;
import java.util.Scanner;

/**
 * Chap10Program6: Example of Text-file input using BufferedReader
 * 
 * @author Beongyoung Park
 * @version v0.1
 * @since 2023-04-17
 */

public class Chap10Program6 {

	public static void main(String[] args) throws IOException {

		// set up file and stream
		File inFile = new File("example3.data");
		FileReader fileReader = new FileReader(inFile);
		BufferedReader bufReader = new BufferedReader(fileReader);
		String str;

		while((str = bufReader.readLine()) != null) {
			System.out.println(str);
		}
		
		//int i = Integer.parseInt(str);

		// similar process for other data types
		bufReader.close();
		
		//open the Scanner
		Scanner scanner = new Scanner(new File("example3.data"));

		System.out.println(scanner.next());
		System.out.println(scanner.next());
		System.out.println(scanner.next());
		
		//similar process for other data types
		scanner.close();

	}
}
