package methodEmbedding.Revenge_of_the_Pancakes.S.LYD416;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
	    in.nextLine();
	    String[] testCases = new String[t];
	    int[] results = new int[t];
	    for (int i = 0; i < t; i++) {
	      String N = in.nextLine();
	      testCases[i] = N;
	    }
	    for (int i=0; i<t; i++) {
	   	 char[] partial = new StringBuilder(testCases[i]).reverse().toString().toCharArray();
	   	 boolean oddFlips = false;
	   	 int flips = 0;
	   	 for(int j=0; j<partial.length; j++) {
	   		 if (partial[j] == (oddFlips?'+':'-')) {
	   			 flips++;
	   			 oddFlips = !oddFlips;
	   		 }
	   	 }
	   	 results[i] = flips;
	   	 String output = String.format("Case #%d: %s", (i+1), results[i]);
	   	 System.out.println(output);
	    }
	    in.close();
	}

}
