package methodEmbedding.Magic_Trick.S.LYD525;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MagicTrick {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scanner = new Scanner(new File("input.in"));
		int t = scanner.nextInt();
		for (int i = 0; i < t; i++) {
			int f = scanner.nextInt();

			int arr1[][] = new int[4][4];
			int arr2[][] = new int[4][4];
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++)
					arr1[j][k] = scanner.nextInt();
			}

			int s = scanner.nextInt();
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++)
					arr2[j][k] = scanner.nextInt();
			}

			Set<Integer> answer = new HashSet<Integer>();
			for (int j = 0; j < 4; j++)
				for (int k = 0; k < 4; k++)
					if (arr1[f-1][j] == arr2[s-1][k])
						answer.add(arr1[f-1][j]);

			if (answer.size() > 1)
				System.out.println("Case #" + (i + 1) + ": Bad magician!");
			else if (answer.size() == 0)
				System.out.println("Case #" + (i + 1) + ": Volunteer cheated!");
			else
				System.out.println("Case #" + (i + 1) + ": " + answer.iterator().next());
		}

	}

}
