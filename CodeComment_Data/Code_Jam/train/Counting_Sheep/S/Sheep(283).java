package methodEmbedding.Counting_Sheep.S.LYD607;

import java.util.Scanner;

public class Sheep {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int T = sc.nextInt();
		for (int caseNo = 1; caseNo <= T; caseNo++) {
			final int N = sc.nextInt();
			if (N == 0) {
				System.out.println("Case #" + caseNo + ": INSOMNIA");
				continue;
			}
			boolean[] digitHasBeenSeen = new boolean[10];
			int noOfSeenDigits = 0;
			int n = 0;
			do {
				n += N;
				for (char c : Integer.toString(n).toCharArray()) {
					if (!digitHasBeenSeen[Character.getNumericValue(c)]) {
						digitHasBeenSeen[Character.getNumericValue(c)] = true;
						noOfSeenDigits++;
					}
				}
			} while (noOfSeenDigits < 10);
			System.out.println("Case #" + caseNo + ": " + n);
		}
	}
}
