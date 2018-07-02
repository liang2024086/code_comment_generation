package methodEmbedding.Magic_Trick.S.LYD901;

import java.util.*;
import java.io.*;

public class Magic {
	public static void main(String[] args) throws Exception {
		// Set up the input and output files
		System.setIn(new FileInputStream("A-small-attempt1.in"));
		System.setOut(new PrintStream(new FileOutputStream("A-small-attempt1.out")));
		Scanner in = new Scanner(System.in);
		// Read in T
		int totalCases = in.nextInt();
		in.nextLine();
		for (int caseNumber = 1; caseNumber <= totalCases; caseNumber++) {
			// Read in C
			int first = in.nextInt();
			in.nextLine();
			String line = "";
			String[] cards1 = new String[4];
			for (int card = 1; card <= 4; card++) {
				line = in.nextLine();
				if (card == first)
					cards1 = line.split(" ");
			}
			Arrays.sort(cards1);

			int second = in.nextInt();
			in.nextLine();
			line = "";
			String[] cards2 = new String[4];
			for (int card = 1; card <= 4; card++) {
				line = in.nextLine();
				if (card == second)
					cards2 = line.split(" ");
			}
			Arrays.sort(cards2);

			ArrayList<Integer> dup = new ArrayList<>();
			for (int card = 0; card < 4; card++) {
				for (int j = 0; j < 4; j++)
					if (cards1[card].equals(cards2[j]))
						dup.add(Integer.parseInt(cards1[card]));
			}

			String result = "";
			switch (dup.size()){
			case 1:
				result = dup.get(0).toString(); break;
			case 0:
				result = "Volunteer cheated!";break;
			default:
				result = "Bad magician!";  break;
			}

			System.out.print("Case #" + caseNumber + ":");
			System.out.print(" " + result);
			System.out.println();   // Move to the next line
		}
	}
}
