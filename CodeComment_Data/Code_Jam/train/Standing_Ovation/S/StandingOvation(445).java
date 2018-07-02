package methodEmbedding.Standing_Ovation.S.LYD2194;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class StandingOvation {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		sc.nextLine();

		int i = 1;
		int shyLevels = 0;
		String input;
		while (i <= testCases) {
			shyLevels = sc.nextInt();
			input = sc.next();
			int friendsAdded = 0;

			int j = 1;
			int sum = 0;
			sum += Integer.parseInt(input.substring(0, 1));

			while (j <= shyLevels) {
				int num = Integer.parseInt(input.substring(j, j + 1));
				if (j > sum && num > 0) {
					friendsAdded += (j - sum);
					sum += friendsAdded;
				}
				sum += num;
				j++;

			}
			System.out.println("Case #" + i + ": " + friendsAdded);
			sc.nextLine();
			i++;
		}

	}
}
