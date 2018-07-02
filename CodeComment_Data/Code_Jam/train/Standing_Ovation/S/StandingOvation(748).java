package methodEmbedding.Standing_Ovation.S.LYD2114;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class StandingOvation {
	static String fileName = "A-small-attempt0.in";

	public static void main(String[] args) {
		Scanner s = null;
		try {
			s = new Scanner(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			System.out.println(fileName + " not found!");
		}
		int N = Integer.parseInt(s.nextLine()); // number of test cases
		for (int i = 1; i <= N; i++) {
			String z = s.nextLine();
			String[] results = z.split(" ");
			int SMAX = Integer.parseInt(results[0]);
			int[] shyness = new int[SMAX + 1];
			for (int j = 0; j <= SMAX; j++)
				shyness[j] = Character.getNumericValue(results[1].charAt(j));
			int current = 0;
			int level = 0;
			int add = 0;
			while (current < SMAX) {
				if (current >= level) {
					current = current + shyness[level];
					level++;
				} else {
					add++;
					current++;
				}
			}
			System.out.println("Case #" + i + ": " + add);
		}
		s.close();
	}
}
