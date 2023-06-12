/**
 * Ch6Program7
 * Resolve ArrayIndexOutOfBoundsException
 * 
 * @author	Beongyoung Park
 * @version	v0.1
 * @since	2023-03-29
 */

public class Ch6Program7 {
	
	public static void main(String[] args) {
		
		int[] intArray = new int[5];
		intArray[0] = 0;
		try {
			for (int i = 0; i < 5; i++) {
				intArray[i + 1] = i + 1 + intArray[i];
				System.out.println("intArray[" + i + "]" + "=" + intArray[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of index for intArray");
		}
		
	}
}
