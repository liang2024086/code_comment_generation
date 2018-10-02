package methodEmbedding.Magic_Trick.S.LYD281;

import java.util.*;
import java.io.*;

public class MagicTrick {

	public static Scanner in;
	public static PrintWriter out;
	public static long cases;

	public static void main(String[] args) {
		try {
			in = new Scanner(new File("A-small-attempt0.in"));
			out = new PrintWriter("output.txt", "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
		}

		cases = in.nextLong();
		in.nextLine();

		for (long i = 1; i <= cases; i++) {
			int firstRowChosen = in.nextInt();
			
			int[] firstRowCards = new int[4];
			for(int j = 0; j < 4; j++) {
				for(int k = 0; k < 4; k++) {
					if(j == firstRowChosen - 1) {
						firstRowCards[k] = in.nextInt();
					} else {
						in.nextInt();
					}
				}
			}
            
            int secondRowChosen = in.nextInt();

            int[] secondRowCards = new int[4];
			for(int j = 0; j < 4; j++) {
				for(int k = 0; k < 4; k++) {
					if(j == secondRowChosen - 1) {
						secondRowCards[k] = in.nextInt();
					} else {
						in.nextInt();
					}
				}
			}

			int matches = 0;
			int match = 0;
            //cross-check the two rows of cards chosen
            for(int j = 0; j < 4; j++) {
				for(int k = 0; k < 4; k++) {
					if(firstRowCards[j] == secondRowCards[k]) {
						matches++;
						match = firstRowCards[j];
					}
				}
			}

			String output = null;
			if(matches == 0) {
				output = "Volunteer cheated!";
			} else if(matches > 1) {
				output = "Bad magician!";
			} else {
				output = "" + match;
			}
			
            out.print("Case #" + i + ": " + output);

			out.println();
		}
		out.close();
	}
}
