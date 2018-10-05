package methodEmbedding.Counting_Sheep.S.LYD1007;

/**
 * 
 */

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yaqin
 *
 */
public class CountingSheep {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		java.io.File input = new java.io.File("countingsheep.in");
		java.util.Scanner in = new java.util.Scanner(input);
		java.io.PrintWriter output = new java.io.PrintWriter("countingsheep.out");
		
		int T = in.nextInt();
		int x = 1;
		
		while(x  <= T) {
			String result = "INSOMNIA";
			long N = in.nextLong();
			Map<Character, Integer> numbers = new HashMap<Character, Integer>();
			int count = 0;
			if (N != 0) {
				X: for (int i = 1; i <= 100; i++) {
					long temp = N * i;
					char[] digits = String.valueOf(temp).toCharArray();
					for (int j = 0; j < digits.length; j++) {
						if (!numbers.containsKey(digits[j])) {
							numbers.put(digits[j], 1);
							count++;
							if (count == 10) {
								result = String.valueOf(temp);
								System.out.println("Case#" + x+ " " + result + "  i: " + i);
								break X;
							}
						}
					}
					
					//System.out.println(temp * 100);
					
				}
			}
			
			
			output.println("Case #" + x + ": " + result);
			x++;
		}

		in.close();
		output.close();


	}

}
