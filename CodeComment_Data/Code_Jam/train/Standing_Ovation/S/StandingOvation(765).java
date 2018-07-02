package methodEmbedding.Standing_Ovation.S.LYD1234;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StandingOvation {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner in = new Scanner(new File("A-small-attempt0.in"));
		PrintWriter out = new PrintWriter(new File("A-small-attempt0.out"));
		int T = in.nextInt();

		for (int t = 0; t < T; t++) {

			int size = in.nextInt();
			String values = in.next();

			int sum = 0;
			int added = 0;
			for (int i = 0; i < values.length(); i++) {
				if (sum < i) {
					added += 1;
					sum += 1;
				}

				sum += Character.getNumericValue(values.charAt(i));
			}
			out.println(String.format("Case #%d: %d",(t+1),added));
		}
		out.close();
		in.close();
	}
}
