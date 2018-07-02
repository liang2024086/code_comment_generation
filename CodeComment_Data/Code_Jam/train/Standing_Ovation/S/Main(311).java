package methodEmbedding.Standing_Ovation.S.LYD2102;

import java.util.*;
import java.io.*;
//import java.text.*;

public class Main {
	
	public static void main(String[] args)  throws FileNotFoundException{
		Scanner input = new Scanner(new File("A-small-attempt2.in.txt"));
		PrintWriter output = new PrintWriter(new File("output.txt"));
		
		int dataset = input.nextInt();
		String audience;
		int maxShy = 0;
		int friends = 0;
		int current = 0;
		int total= 0;
		
		for (int x=1; x<dataset+1; x++) {
			audience = null;
			maxShy = 0;
			friends = 0;
			current = 0;
			total = 0;
			
			maxShy = input.nextInt();
			audience = input.next();
			
			for (int y=0; y<maxShy+1; y++) {
				current = Character.getNumericValue(audience.charAt(y));
				total += current;
				if (y>=total && current==0) {
					friends++;
					total++;
				}
			}
			
			output.printf("Case #%d: %d\n", x, friends);
		}
		input.close();
		output.close();
	}
}
