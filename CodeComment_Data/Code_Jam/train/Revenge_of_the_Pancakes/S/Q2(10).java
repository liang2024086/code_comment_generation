package methodEmbedding.Revenge_of_the_Pancakes.S.LYD929;


import java.util.Scanner;

public class Q2 {
	public static void main(String... args) {
		try (Scanner in = new Scanner(System.in)) {
			int T = Integer.parseInt(in.nextLine());
			for (int caseI = 0; caseI < T; caseI++) {
				char[] sequence = in.nextLine().toCharArray();
				char symbolPrev = '+';
				int swap = 0;
				for (int i = sequence.length - 1; i >= 0; i--) {
					char symbol = sequence[i];
					if (symbol != symbolPrev) {
						swap++;
						symbolPrev = symbol;
					}
				}
				System.out.println("Case #" + (caseI + 1) + ": " + swap);
			}
		}
	}
}
