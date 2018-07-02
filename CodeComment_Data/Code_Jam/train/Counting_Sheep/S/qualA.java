package methodEmbedding.Counting_Sheep.S.LYD1696;


import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class qualA {
	private static final int MAX = 1_000_000;

	public static void main(String[] args) throws Throwable {
		Scanner sc = new Scanner(new File("A-small-attempt0.in"));
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			Set<Integer> digits = new HashSet<>(Arrays.asList(new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }));
			BigDecimal n = new BigDecimal(sc.nextInt());

			int j = 0;
			BigDecimal solution = null;
			for (; !digits.isEmpty() && j < MAX; j++) {
				BigDecimal m = n.multiply(new BigDecimal(j));
				solution = m;

				while (m.intValue() > 0) {
					int digit = m.remainder(BigDecimal.TEN).intValue();
					digits.remove(digit);
					m = m.divide(BigDecimal.TEN);
				}

			}
			
			if (j == MAX) {
				System.out.println("Case #" + (i + 1) + ": INSOMNIA");
			} else {
				System.out.println("Case #" + (i + 1) + ": " + solution);
			}
		}
	}
}
