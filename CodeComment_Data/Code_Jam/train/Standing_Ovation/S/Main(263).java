package methodEmbedding.Standing_Ovation.S.LYD1398;

import java.io.*;
import java.util.*;

/**
 * Problem A
 * 
 */
public class Main {
	
	
	public static void main(String[] args)  throws IOException {
		
		Scanner input = new Scanner(System.in);
		PrintStream output = System.out;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "ISO-8859-1"));
		OutputStreamWriter cout = new OutputStreamWriter(System.out, "ISO-8859-1");
		
		int numCases = input.nextInt();
		for (int i=1; i<=numCases; i++) {
			int highestShy = input.nextInt();
			int audience = input.nextInt();
			int[] audienceArr = new int[highestShy+1];
			for (int j=highestShy; j>=0; j--) {
				audienceArr[j] = audience%10;
				audience/=10;
			}
			int result = 0;
			int curStanding=0;
			for (int j=0; j<=highestShy; j++) {
				if (curStanding < j) {
					result++;
					curStanding++;
				}
				curStanding+=audienceArr[j];
			}
			System.out.printf("Case #%d: %d\n", i, result);
			
		}
		
		
		
	}
	
	
	

}
