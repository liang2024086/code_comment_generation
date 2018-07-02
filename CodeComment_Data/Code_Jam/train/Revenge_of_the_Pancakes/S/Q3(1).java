package methodEmbedding.Revenge_of_the_Pancakes.S.LYD859;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) throws IOException {

		// Scanner scanner = new Scanner(new File(
		// "/Users/sametozcan/Desktop/test.txt"));
		Scanner scanner = new Scanner(new File(
				"/Users/sametozcan/Downloads/B-small-attempt0.in"));
		int caseCounter = 0;
		int i = 0;
		String s;
		caseCounter = scanner.nextInt();
		BufferedWriter out = new BufferedWriter(new FileWriter(
				"/Users/sametozcan/Desktop/result.txt"));

		for (i = 0; i < caseCounter; i++) {

			s = scanner.next();
			int count = 0;
			char[] arr = s.toCharArray();
			char current = arr[0];

			for (int j = 1; j < arr.length; j++) {

				if (arr[j] != current) {
					current = arr[j];
					count++;
				}

			}

			if (arr[arr.length - 1] == '-')
				count++;

			out.write("Case #" + (i + 1) + ": " + count + "\n");
			// if (i < caseCounter - 1)
			// out.newLine();
		}

		out.close();
		scanner.close();

	}


}
