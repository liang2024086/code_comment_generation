package methodEmbedding.Counting_Sheep.S.LYD1277;

/* Google Code Jam 2016
 * Problem 1
 * Author: linh
*/

import java.util.Scanner;

public class CountingSheep {

	//final static int BAD_MAGICIAN = -1;
	//final static int CHEAT = 0;

	public static void main(String args[]) {		
		Scanner sc = new Scanner(System.in);
		int totalCase = Integer.valueOf(sc.nextInt());
		//System.out.println("test case num =" + totalCase);
		
		int seed, product, digitCount, singleDigit, lastNum = 0;
		boolean digits[] = new boolean[10];
		for (int caseNum = 1; caseNum <= totalCase; ++caseNum) {
			// reset digit array
			for (int i = 0; i < 10; ++i) {
				digits[i] = false;
			}
		
			seed = Integer.valueOf(sc.nextInt());
			//System.out.println("seed = " + seed);	
			
			// special case
			if (0 == seed) {
				System.out.println("Case #" + caseNum + ": INSOMNIA");
				continue;
			}
			
			// naive approach
			for (int i = 1; i < Integer.MAX_VALUE; ++i) {
				product = i * seed;
				lastNum = product;
				
				// check digits				
				while (product > 0) {
					singleDigit = product % 10;
					digits[singleDigit] = true;
					product /= 10;
				}
				
				// check all digits found
				digitCount = 0;
				for (int m = 0; m < 10; ++m) {
					if (digits[m]) {
						++digitCount;
					}
				}
				
				if (digitCount == 10) {
					break; 
				}
			}
			
			// Print result
			System.out.println("Case #" + caseNum + ": " + lastNum);
			
		}		
	}	

}
