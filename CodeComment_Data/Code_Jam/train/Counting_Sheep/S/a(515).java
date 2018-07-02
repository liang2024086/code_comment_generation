package methodEmbedding.Counting_Sheep.S.LYD1682;

import java.util.*;
 

public class a {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Get number of test cases
		int T = in.nextInt();
		
		// Begin
		for(int kase = 1; kase <= T; kase++) {
			// Get number of lines
			int N = in.nextInt();
			
			if(N == 0) {
				System.out.println("Case #" + kase + ": INSOMNIA");
				continue;
			}
			
			// Setup
			boolean[] seenNumbers = new boolean[10];
			int seenNumberCount = 0;
			
			// Run through
			int multiplier = 0;
			while(seenNumberCount < 10 && multiplier < 1000) {
				multiplier++;
				int temp = N * multiplier;
				
				while(temp != 0 && seenNumberCount < 10) {
					int lastDigit = temp % 10;
					temp /= 10;
					if(!seenNumbers[lastDigit]) {
						seenNumberCount++;
						seenNumbers[lastDigit] = true;
					}
				}
			}
			
			// Output
			System.out.println("Case #" + kase + ": " + (seenNumberCount == 10 ? multiplier * N : "INSOMNIA"));
		}
	}

}
