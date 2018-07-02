package methodEmbedding.Standing_Ovation.S.LYD476;

import java.util.*;
import java.io.*;


public class Main {
	final static String IO_DIR = "";
	final static String INPUT_NAME = "input.in";
	final static String OUTPUT_NAME = "output.out";
	
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(new FileReader(IO_DIR + INPUT_NAME));
		PrintWriter pw = new PrintWriter(new FileWriter(IO_DIR + OUTPUT_NAME));
		
		int caseSize = sc.nextInt();
		
		for ( int caseNum = 0; caseNum < caseSize; caseNum++ ) {
			pw.print("Case #" + (caseNum + 1) + ": ");
			
			//Where the magic happens
			int s = sc.nextInt();
			String rawShyLevels = sc.next();
			int currentShyLevel = 0;
			int answer = 0;
			
			for (int k = 0; k < rawShyLevels.length(); k++) {
			
				int shyAmount = Character.getNumericValue(rawShyLevels.charAt(k));
				
				if (currentShyLevel + answer < k && shyAmount > 0) {
					answer += (k - (currentShyLevel + answer));
				}
				
				currentShyLevel += shyAmount;
			}
			
			
			pw.println(answer);
		}
		
		pw.flush();
		pw.close();
		sc.close();
	}
	

}
