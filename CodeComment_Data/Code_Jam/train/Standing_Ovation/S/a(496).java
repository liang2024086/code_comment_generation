package methodEmbedding.Standing_Ovation.S.LYD301;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class a {
	public static void main(String[] args) {
		Scanner in = null;
		PrintWriter writer = null;
		try {
			in = new Scanner(new File("A-small-attempt3.in"));
			writer = new PrintWriter("output.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		int test_cases = in.nextInt();
		for (int t = 1; t <= test_cases; t++) {
			int Smax = in.nextInt();
			int s = in.nextInt();
			int digs[] = new int[Smax + 1];
			for (int i = 0; i <= Smax; i++) {
				digs[Smax - i] = s % 10;
				s /= 10;
			}
			int willapplaud = 0;
			int addedPeople = 0;
			for (int i = 0; i < digs.length; i++) {
				if (digs[i] > 0) {
					if (willapplaud >= i) {
						willapplaud += digs[i];
					} else {
						int pplToAdd = i - willapplaud;
						addedPeople += pplToAdd;
						willapplaud += pplToAdd;
						willapplaud += digs[i];
					}
				}
			}

			 //System.out.println("Case #" + t + ": " + addedPeople);
			 writer.println("Case #" + t + ": " + addedPeople);

		}
		writer.close();
	}
}
