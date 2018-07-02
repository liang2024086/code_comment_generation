package methodEmbedding.Revenge_of_the_Pancakes.S.LYD980;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RevengeOfThePancakes {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		int nCases = Integer.parseInt(lector.readLine());

		for (int i = 0; i < nCases; i++) {
			String[] stack = lector.readLine().split("");
			long nFlips = 0;
			while (true) {

				boolean test = true;
				for (int j = 0; j < stack.length; j++) {
					// System.out.println(" "+stack[j]);
					if (!stack[j].equals("+")) {
						test = false;
					}
				}
				if (test) {
					 System.out.println("Case #" + (i + 1) + ": " + nFlips);
					break;
				}

				String temp = stack[0];

				for (int j = 0; j < stack.length; j++) {
					if (stack[j].equals(temp)) {
						if (stack[j].equals("+")) {
							stack[j] = "-";
						} else {
							stack[j] = "+";
						}
					} else {
						break;
					}

				}
				nFlips++;
			}
		}

	}
}
