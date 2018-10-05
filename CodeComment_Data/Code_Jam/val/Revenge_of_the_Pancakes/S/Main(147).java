package methodEmbedding.Revenge_of_the_Pancakes.S.LYD502;

import java.util.*;
import java.io.*;

// Input 
// 	
// 5
// -
// -+
// +-
// +++
// --+-
//
// Output 
//
// Case #1: 1
// Case #2: 1
// Case #3: 2
// Case #4: 0
// Case #5: 3

public class Main {
	public static void main(String[] args) throws IOException {

		//Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	    Scanner in = new Scanner(new File("src/B-small-attempt0.in"));

		int t = in.nextInt();

		for (int i = 0; i < t; i++) {
			
			String s = in.next();
			int flips = 0;
			
			for(int j=0; j<s.length() -1; j++) {
				
				if(s.charAt(j) != s.charAt(j + 1)) flips++;
				
			}
			
			if(s.charAt(s.length() - 1) == '-') flips++;
			
			System.out.println("Case #" + (i + 1) + ": " + flips);
			
		}
		
		in.close();
		
	}
	
}
