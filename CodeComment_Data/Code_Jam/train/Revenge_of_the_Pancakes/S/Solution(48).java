package methodEmbedding.Revenge_of_the_Pancakes.S.LYD47;

import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

		// Since we're limited to fliping from the left,
		// the fastest way to flip is just flip the left most every time



        int testCaseCount = Integer.parseInt(sc.nextLine());
        for (int testCase = 0; testCase < testCaseCount; testCase++) {
        
			
			// removing unique characters, get count to last -
			String pancakes = sc.nextLine();

			char lastPancake = 'x';

			int answer = 0;
			int uniquePancakes = 0;
			for (int i = 0; i < pancakes.length(); i++)
			{
			    char  pancake = pancakes.charAt(i);        
			    if (lastPancake != pancake) {
			    	lastPancake = pancake;
			    	uniquePancakes++;
			    }

			    if (pancake == '-') {
			    	answer = uniquePancakes;
			    }


			}

            
   
            
            System.out.println("Case #" + (testCase+1) + ": " + answer);
            
        }
                
    }
}
