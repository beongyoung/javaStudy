import java.util.Map;
import java.util.TreeMap;

/**
 * Chap9Program2: Example of Map Usage
 * 
 * @author	Beongyoung Park
 * @version	v0.1
 * @since	2023-04-17
 */

public class Chap9Program2 {

	public static void main(String[] args) {
		Map<String, String> catalog = new TreeMap<String, String>();
		
		catalog.put("CS101", "Intro Java Programming");
		catalog.put("CS301", "Database Design");
		catalog.put("CS413", "Software Design for Mobile Devices");

		if (catalog.containsKey("CS101")) {
			System.out.println("We teach Java this semester");
		} else {
			System.out.println("No Java courses this semester");
		}

	}
}
