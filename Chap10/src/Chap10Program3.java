import java.io.*;

/**
 * Chap10Program3: Example of File High-level output
 * 
 * @author Beongyoung Park
 * @version v0.1
 * @since 2023-04-17
 */

public class Chap10Program3 {

	public static void main(String[] args) throws IOException {
		
        // open file output stream
        File outFile = new File("example2.data");
        FileOutputStream outStream = new FileOutputStream(outFile);
        DataOutputStream outDataStream = new DataOutputStream(outStream);

        // write an int, boolean, double
        outDataStream.writeInt(44);
        outDataStream.writeBoolean(true);
        outDataStream.writeDouble(7.2);

        outDataStream.close();
	}
}
