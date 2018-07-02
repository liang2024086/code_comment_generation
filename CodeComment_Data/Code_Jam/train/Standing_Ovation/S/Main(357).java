package methodEmbedding.Standing_Ovation.S.LYD1943;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfTests = sc.nextInt();

		for (int i = 1; i < numOfTests + 1; i++) {
			int max_S = sc.nextInt();
			String dataString = sc.next();
			int[] bits = new int[max_S + 1];
			char[] stringBits = dataString.toCharArray();

			for (int j = 0; j < bits.length; j++) {
				bits[j] = Character.getNumericValue(stringBits[j]);
			}

			int toReturn = 0;
			int netSum = 0;

			for (int j = 0; j < bits.length; j++) {
				if (j > netSum) {
					toReturn += j - netSum;
					netSum += j - netSum;
				}
				netSum += bits[j];
			}

			System.out.println("Case #" + i + ": " + toReturn);
		}
	}
}
