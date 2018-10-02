package methodEmbedding.Standing_Ovation.S.LYD938;


import java.io.*;
import java.util.Scanner;

public class StandingOvation {
	/* First read from the input file. For each input line starting at line 2:
	 * create an integer array with corresponding size starting from back
	 * if the running sum is less than (size-index value-1), add people with less shyness, update the sum */
		
	public static void main (String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File("A-small-attempt3.in"));
		} catch (Exception e) {}
		
		PrintWriter writer = new PrintWriter("A.out", "UTF-8");
	
		int depth = scanner.nextInt();
		
		// the main for loop
		for (int d = 0; d < depth; d++) {
			// create an integer array with number of people with shyness = index
			// populate the array backwards
			int size = scanner.nextInt()+1;
			String temp = scanner.next();
			int[] people_count = new int[size];
			for (int i = 0; i<size; i++) {
				people_count[i] = Character.getNumericValue(temp.charAt(i)); // need to check for exception here?
			}
			// go through the list while keep a running sum of people count
			int sum = 0;
			int extra = 0;
			for (int i = 0; i < size; i++) {
				if (sum < i && people_count[i]!=0) {
					extra += i-sum;
					sum += extra;
				}
				sum += people_count[i];
			}
			int case_num = d+1;
			// write to output file
			writer.println("Case #" + case_num + ": " + extra);

		}
		writer.close();
	}
	
}
