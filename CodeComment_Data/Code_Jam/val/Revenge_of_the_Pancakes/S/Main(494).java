package methodEmbedding.Revenge_of_the_Pancakes.S.LYD902;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String args[]) {

		Locale.setDefault(Locale.US);

		Scanner in;
		try {
			in = new Scanner(new File("input.txt"));
		} catch (Exception e) {
			in = new Scanner(System.in);
		}

		PrintWriter out;
		try {
			out = new PrintWriter("output.txt");
		} catch (Exception e) {
			out = new PrintWriter(System.out);
		}

		int t = in.nextInt();
		in.nextLine();

		for (int i = 0; i < t; ++i) {

			String s = in.nextLine();

			String res = "Case #" + (i + 1) + ": ";

			int r = 0;

			while (s.contains("-")) {

				int blankPos = s.indexOf("-");
				if (blankPos > 0) {
					String blanks = "";
					for (int j = 0; j < blankPos; ++j) {
						blanks += "-";
					}
					s = blanks + s.substring(blankPos);
					++r;
				}

				int lastBlankPos = s.lastIndexOf("-");
				if (lastBlankPos > -1) {
					String initial = s.substring(0, lastBlankPos + 1);
					String flipped = "";
					for (int j = initial.length() - 1; j >= 0; --j) {
						if (initial.charAt(j) == '+') {
							flipped += "-";
						}
						else {
							flipped += "+";
						}
					}
					s = flipped + s.substring(lastBlankPos + 1);
					++r;
				}
			}

			res += r;

			System.out.println(res);
			out.println(res);
		}

		out.close();
	}
}
