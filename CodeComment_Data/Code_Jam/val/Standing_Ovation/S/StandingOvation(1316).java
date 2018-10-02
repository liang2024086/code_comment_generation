package methodEmbedding.Standing_Ovation.S.LYD912;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class StandingOvation {

	public static void main(String[] args) throws IOException{
        // //Users//emilyzhang//Documents//Spring 2015//Coding//
		BufferedReader in = new BufferedReader(new FileReader("//Users//emilyzhang//Documents//Spring 2015//Coding//A-small-attempt0.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt"))); 
		
		int T = Integer.parseInt(in.readLine()); //num test cases
		//read and parse shit with below

        for (int testCase = 1; testCase <= T; testCase++) {

    		String line = in.readLine();
    		// - 48 to get from ascii to numbers
    		// space is 32 so it would get to be negative
    		int ASCII_CONV = 48;
    		int max = (int)(line.charAt(0)) - ASCII_CONV;
    		int[] totalClappers = new int[max + 1];
            int maxExtra = 0;
    		for (int j = 0; j < max + 1; j++) {
    			if (j == 0) {
    				totalClappers[j] = (int)(line.charAt(j + 2)) - ASCII_CONV;
    			} else {
                    totalClappers[j] = (int)(line.charAt(j + 2)) - ASCII_CONV + totalClappers[j - 1];
                }
                int extra = j + 1 - totalClappers[j];
                if (extra > maxExtra) {
                    maxExtra = extra;
                }
    		}
            //test
            // for (int i = 0; i < max + 1; i++) {
            //     System.out.print(totalClappers[i] + " ");
            //     System.out.println();
            // }

    		out.print("Case #" + testCase + ": ");
    		out.println(maxExtra);
        }
	
		in.close();
		out.close();
		System.exit(0);
	}
		
}

