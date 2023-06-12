import java.util.Iterator;
import java.util.Vector;

/**
 * Chap9Program4: Example of Vector Usage with Integer Generic & Iterator
 * 
 * @author	Beongyoung Park
 * @version	v0.1
 * @since	2023-04-17
 */

public class Chap9Program4 {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>(); 
		
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2, 100);
		
		Iterator<Integer> it = v.iterator(); 
		
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}
	}
}