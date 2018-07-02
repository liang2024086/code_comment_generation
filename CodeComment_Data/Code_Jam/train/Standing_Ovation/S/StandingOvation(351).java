package methodEmbedding.Standing_Ovation.S.LYD1385;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class StandingOvation {

	/*
	 * 	Input 
 	
		4
		4 11111
		1 09
		5 110011
		0 1
		
		Output 
		
		Case #1: 0
		Case #2: 1
		Case #3: 2
		Case #4: 0
	 * */
	
//	3 2201
//	6 0000001
//	0 1
//	6 9120301
	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(new File("src/A-small-attempt1.in"));
		
		int numCases = Integer.parseInt(input.nextLine());
        for (int n = 0; n < numCases; n++) {
        	// Num people standing now
        	int stNum = 0;
        	// Num people to be added
        	int cnt = 0;
        	int sMax = input.nextInt();
        	String t =  input.nextLine();
        	if( t != null && !t.isEmpty()) {
        		t = t.trim();
        	}
        	char[] p = t.toCharArray();
        	
        	//System.out.println("Processing line " + t);
        	
        	for(int i=0; i<=sMax; i++) {
        		
        		if( stNum < i ) {
        			
        			int d = i - stNum;
        			
        			stNum += d;
        			cnt += d;
        			
        		}
        		
        		int k = Integer.parseInt("" + t.charAt(i));
        		stNum += k;
        		
        	}
        	
        	System.out.println("Case #" + (n + 1) + ": " + cnt);
        	
        }
		
	}
	
}
