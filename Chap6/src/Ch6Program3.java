/**
 * Ch6Program3
 * Review array return
 * 
 * @author	Beongyoung Park
 * @version	v0.1
 * @since	2023-03-29
 */

public class Ch6Program3 {

	public static void main(String[] args) {

		int intArray[];
		intArray = makeArray();
		for (int i = 0; i < intArray.length; i++)
			System.out.print(intArray[i] + " ");

	}

	public static int[] makeArray() {
		int temp[] = new int[4];
		for (int i = 0; i < temp.length; i++)
			temp[i] = i;
		return temp;
	}
}
