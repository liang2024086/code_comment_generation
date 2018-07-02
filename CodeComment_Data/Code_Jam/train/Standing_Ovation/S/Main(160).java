package methodEmbedding.Standing_Ovation.S.LYD844;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(new FileInputStream("input.txt"));
			scanner.useLocale(Locale.ENGLISH);
			BufferedWriter out = new BufferedWriter(new FileWriter("output.txt"));
			int tests = scanner.nextInt();
			for (int i = 0; i < tests; i++) {
				int maxShy = scanner.nextInt();
				String counts = scanner.next("\\w+");
				int sum = 0;
				int max = 0;
				for (int j = 0; j < counts.length(); j++) {
					max = Math.max(max, j - sum);
					sum += Character.getNumericValue(counts.charAt(j));
				}
				out.write("Case #" + (i + 1) + ": " + max + "\n");
			}
			out.close();
		} catch (FileNotFoundException e) {
			// ????
		} catch (IOException e) {
			// ????
		}
	}
}
