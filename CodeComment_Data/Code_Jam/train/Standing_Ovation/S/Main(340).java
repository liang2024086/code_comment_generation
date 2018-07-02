package methodEmbedding.Standing_Ovation.S.LYD978;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

	public static void main(String args[]) {
		Pattern whiteSpacePattern = Pattern.compile("\\s*");
		Pattern digitsPattern = Pattern.compile("\\d*");
		String inputFilename = args[0];
		File f = new File("data/" + inputFilename);
		String outputFilename = inputFilename.replaceFirst("(\\.in)?$", ".out");
		try {
			Scanner s = new Scanner(new FileReader(f));
			PrintWriter out = new PrintWriter(new FileWriter("data/"
					+ outputFilename));
			int testCases = s.nextInt();
			for (int t = 1; t <= testCases; ++t) {
				int shyMax = s.nextInt();
				s.skip(whiteSpacePattern);
				int[] shyness = new int[1 + shyMax];
				String digits = s.next(digitsPattern);
				for (int i = 0; i <= shyMax; ++i) {
					String digit = digits.substring(i, 1 + i);
					int count = Integer.parseInt(digit);
					shyness[i] = count;
				}

				int neededCount = 0;
				int clappingSoFar = 0;
				for (int i = 0; i <= shyMax; ++i) {
					if (clappingSoFar < i) {
						int needed = i - clappingSoFar;
						System.out.println("Needed: " + needed);
						neededCount += needed;
						clappingSoFar += needed;
					}

					clappingSoFar += shyness[i];
				}
				out.println("Case #" + t + ": " + neededCount);
			}

			out.close();
			s.close();
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}
