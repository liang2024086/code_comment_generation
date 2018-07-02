package methodEmbedding.Magic_Trick.S.LYD199;

import java.util.Scanner;

public class A {
	public static void main(String[] argv) {
		Scanner in = new Scanner(System.in);

		int cases = in.nextInt();

		for (int i = 0; i < cases; i++) {

			int ans1 = in.nextInt();

			int cardsA[] = new int[4];
			for (int y = 0; y < 4; y++)
				if (y == (ans1 - 1))
					for (int x = 0; x < 4; x++) {
						cardsA[x] = in.nextInt();
					}
				else
					for (int x = 0; x < 4; x++) {
						in.nextInt();
					}

			int ans2 = in.nextInt();

			int cardsB[] = new int[4];
			for (int y = 0; y < 4; y++) {
				if (y == (ans2 - 1))
					for (int x = 0; x < 4; x++) {
						cardsB[x] = in.nextInt();
					}
				else
					for (int x = 0; x < 4; x++) {
						in.nextInt();
					}
			}

			int matches = 0;
			int correct = 0;

			for (int x = 0; x < 4; x++)
				for (int y = 0; y < 4; y++) {
					if (cardsA[x] == cardsB[y]) {
						matches++;
						correct = cardsA[x];
					}
				}
			System.out.print("Case #" + (i + 1) + ": ");
			if (matches == 0)
				System.out.println("Volunteer cheated!");
			else if (matches == 1)
				System.out.println(correct);
			else
				System.out.println("Bad magician!");
		}

		in.close();

	}
}
