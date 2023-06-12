
/**
 * File name : example.java
 * this program is example code
 * 
 * @author	Beongyoung Parkz
 * @version	v0.1
 * @since	2023-03-13
 */
import java.io.File;

public class example {
    public static void main(String[] args) {
        File file = new File("");
        String filePath = file.getPath();
        System.out.println("File path: " + filePath);
    }
}