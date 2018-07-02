package methodEmbedding.Revenge_of_the_Pancakes.S.LYD504;

import java.util.*;
import java.math.BigInteger;
import java.lang.StringBuilder;

public class b {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// Get number of test cases
		int T = in.nextInt();
		in.nextLine();
		
		// Begin
		for(int kase = 1; kase <= T; kase++) {
			// Output
			System.out.print("Case #" + kase + ": ");
			
			// Get N and J
			String pancakeString = in.nextLine();
			char[] pancakes = pancakeString.toCharArray();
			//System.out.println(pancakeString);
			
			int flip = 0;
			int position = 0;

			// Check for an initial flip
			while(position < pancakes.length && pancakes[position] == '-') {
				position++;
			}
			if(position != 0) {
				flip++;
			}
			
			// Remaining flips
			boolean onBlank = false;
			while(position < pancakes.length) {
				if(pancakes[position] == '-') {
					onBlank = true;
				} else if(pancakes[position] == '+' && onBlank) {
					onBlank = false;
					flip += 2;
				}
				
				position++;
			}
			
			if(onBlank) {
				flip += 2;
			}
			
			System.out.println(flip);
		}
	}
}
