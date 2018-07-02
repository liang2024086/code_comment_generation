package methodEmbedding.Counting_Sheep.S.LYD220;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class R1A2016 {

	static int n;

	public static void main(String args[]) {
		Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int cases = scan.nextInt();
		scan.nextLine();

		for (int i = 0; i < cases; i++) {
			n = scan.nextInt();

			System.out.print("Case #" + (i + 1) + ": ");

			if (n == 0) {
				System.out.println("INSOMNIA");
				continue;
			}

			Set<Integer> digits = new HashSet<>();
			int num = 0;
			while (digits.size() != 10) {
				num += n;
				int fra = num;

				while (fra != 0) {
					digits.add(fra % 10);
					fra /= 10;
				}

			}

			System.out.println(num);
		}

		scan.close();
	}
}
