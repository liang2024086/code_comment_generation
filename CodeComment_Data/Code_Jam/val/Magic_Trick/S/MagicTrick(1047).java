package methodEmbedding.Magic_Trick.S.LYD1845;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class MagicTrick {

	public MagicTrick() throws FileNotFoundException {
		File vstup = new File("A-small-attempt0.in");
		Scanner s = new Scanner(vstup);
		int T = s.nextInt();
		for (int i = 0; i < T; i++) {
			int[] pom = new int[4];
			int[] pom2 = new int[4];
			int m = s.nextInt() - 1;

			for (int j = 0; j < 4; j++) {
				for (int l = 0; l < 4; l++) {
					if (j == m) {
						pom[l] = s.nextInt();
					} else {
						s.nextInt();
					}
				}
			}

			m = s.nextInt() - 1;
			for (int j = 0; j < 4; j++) {
				for (int l = 0; l < 4; l++) {
					if (j == m) {
						pom2[l] = s.nextInt();
					} else {
						s.nextInt();
					}
				}
			}
			for (int j = 0; j < pom.length; j++) {
				boolean found = false;
				for (int k = 0; k < pom2.length; k++) {
					if (pom[j] == pom2[k])
						found = true;
				}
				if (!found) {
					pom[j] = 0;
				}
			}
			int count = 0;
			for (int j = 0; j < pom.length; j++) {
				if (pom[j] != 0)
					count++;
			}
			System.out.printf("Case #%d: ", i + 1);
			if (count == 0) {
				System.out.println("Volunteer cheated!");
			}
			if (count == 1) {
				for (int j = 0; j < pom.length; j++) {
					if (pom[j] != 0)
						System.out.println(pom[j]);
				}
			}
			if (count > 1) {
				System.out.println("Bad magician!");
			}
		}

	}

	public static void main(String[] args) throws FileNotFoundException {
		MagicTrick mg = new MagicTrick();

	}

}
