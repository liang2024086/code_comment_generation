package methodEmbedding.Counting_Sheep.S.LYD851;

import java.util.*;
import java.io.*;

public class aEasy {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numCases = input.nextInt();
		for (int n = 0; n < numCases; n++) {
			int[] checks = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
			int N = input.nextInt();
			int originalN = N;
			int output = 0;
			if (N == 0)
				System.out.printf("Case #%d: INSOMNIA\n", n + 1);
			else {
				output = -1;
				while (checks[0] == 0 || checks[1] == 0 || checks[2] == 0
						|| checks[3] == 0 || checks[4] == 0 || checks[5] == 0
						|| checks[6] == 0 || checks[7] == 0 || checks[8] == 0
						|| checks[9] == 0) {
					int number = N;
					while (number > 9) {
						int digit = number % 10;
						checks[digit] = 1;
						number = number / 10;
					}
					checks[number] = 1;
					output = N;
					N += originalN;
				}
				System.out.printf("Case #%d: %d\n", n + 1, output);
			}
		}
	}
}
