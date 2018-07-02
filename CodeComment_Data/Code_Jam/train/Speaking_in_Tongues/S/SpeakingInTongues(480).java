package methodEmbedding.Speaking_in_Tongues.S.LYD796;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SpeakingInTongues {
	private static String source = "abcdefghijklmnopqrstuvwxyz";
	private static String dest = "ynficwlbkuomxsevzpdrjgthaq";

	public static void main(String[] args) {
		int cases, caseno;
		String line, result;
		BufferedReader reader;

		if (args.length < 1) {
			System.out.println("No input file specified");
			return;
		}

		try {
			reader = new BufferedReader(new FileReader(args[0]));

			if ((line = reader.readLine()) != null) {
				cases = Integer.parseInt(line);

				if (cases < 1 || cases > 30) {
					System.out.println("Invalid number of test cases\n");
					return;
				}

				caseno = 1;

				while ((line = reader.readLine()) != null) {
					result = "";

					for (int i = 0; caseno <= cases && i < line.length(); i++) {
						if(SpeakingInTongues.dest.indexOf(line.charAt(i)) >= 0)
							result += SpeakingInTongues.source.charAt(SpeakingInTongues.dest.indexOf(line.charAt(i)));
						else
							result += line.charAt(i);
					}

					System.out.println("Case #" + (caseno++) + ": " + result);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found\n");
		} catch (IOException e) {
			System.out.println("error on reading file\n");
		}
	}
}
