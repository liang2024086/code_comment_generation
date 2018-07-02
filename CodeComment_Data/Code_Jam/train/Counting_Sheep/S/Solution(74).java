package methodEmbedding.Counting_Sheep.S.LYD165;

import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

		// Since we're limited to fliping from the left,
		// the fastest way to flip is just flip the left most every time


        int testCaseCount = sc.nextInt();
        for (int testCase = 0; testCase < testCaseCount; testCase++) {
        
        	
        	BigInteger N = sc.nextBigInteger();
			BigInteger multiple = BigInteger.ZERO;
        	HashSet<Character> found = new HashSet<Character>();
			String answer = "";
        	// Only 0 returns insomnia
        	if (N.intValue() == 0) {
				System.out.println("Case #" + (testCase+1) + ": " + "INSOMNIA");
        	} else {

	        	// Until we've found 0 through 9, keep trying
				while(found.size() < 10) {

					multiple = multiple.add(BigInteger.ONE);
					answer = N.multiply(multiple).toString();
					 // System.out.println(N);
					// System.out.println(multiple);
					// System.out.println(answer);
					for (int curDigit = 0; curDigit < answer.length(); curDigit++){
						Character c = answer.charAt(curDigit);
						if (!found.contains(c)) {
							found.add(c);
							// System.out.println("found: " + c);
						}
					}
				}

            	System.out.println("Case #" + (testCase+1) + ": " + answer);

			}    
   
            
            
        }
                
    }
}
