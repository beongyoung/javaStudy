import java.util.Vector;

/**
 * Chap9Program3: Example of Vector Usage with Integer Generic
 * 
 * @author	Beongyoung Park
 * @version	v0.1
 * @since	2023-04-17
 */

public class Chap9Program3 {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>(); 

		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(1, 2000);
		v.add(2, 100);

		System.out.println("# of elements : " + v.size()); 
		System.out.println("Capacity of the vector : " + v.capacity()); 
		
		for(int i=0; i<v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);
		}		
	}
}
