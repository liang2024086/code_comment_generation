package methodEmbedding.Counting_Sheep.S.LYD827;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int testCases = in.nextInt();

		for (int i = 1; i <= testCases; ++i) {

			int inicial = in.nextInt();

			if (inicial<1) {
				System.out.println("Case #" + i + ": INSOMNIA");
			} else {
				int bucket[] = new int[10];
				int over = 10;
				int multiplyFactor = 1;
				int answer = inicial;

				int proximoDivisor = inicial;
				while (over > 0) {
					int resto;

					int numberOfDigits = (int) Math.log10(proximoDivisor) + 1;
					answer = proximoDivisor;

					for (int j = numberOfDigits - 1; j >= 0; j--) {
						resto = proximoDivisor % 10;
						proximoDivisor = proximoDivisor / 10;
						if (bucket[resto] != 1) {
							over--;
							bucket[resto] = 1;
						}
					}
					multiplyFactor++;
					proximoDivisor = multiplyFactor * inicial;
				}

				System.out.println("Case #" + i + ": " + answer);
			}
		}
	}
}
