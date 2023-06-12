/**
 * Ch6Program1
 * Sample code to get average grade
 *  
 * @author	Beongyoung Park
 * @version	v0.1
 * @since	2023-03-29
 */

public class Ch6Program1 {

	public static void main(String[] args) {
		double score[][] = {{ 3.3, 3.4 }, { 3.5, 3.6 }, { 3.7, 4.0 },	{ 4.1, 4.2 }};
		double sum = 0;
		
		for (int year = 0; year < score.length; year++)
			for (int term = 0; term < score[year].length; term++)
																
				sum += score[year][term]; 

		int n = score.length; 
		int m = score[0].length;
		System.out.println("Avg. grade: " + sum / (n * m));

	}

}
