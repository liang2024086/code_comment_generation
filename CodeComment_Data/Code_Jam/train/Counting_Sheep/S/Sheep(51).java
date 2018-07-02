package methodEmbedding.Counting_Sheep.S.LYD877;

import java.util.*;

public class Sheep {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		for (int i = 1; i <= t; i++) {
			int n = in.nextInt();

			if (n == 0) {
				System.out.println("Case #1: INSOMNIA");
				continue;
			}

			boolean[] digit = new boolean[10];

			for (int j = 1; true; j++) {
				int num = n * j;

				while (num > 0) {
					digit[num % 10] = true;
					num /= 10;
				}

				boolean solved = true;

				for (int index = 0; index < digit.length; index++) {
					if (!digit[index]) {
						solved = false;
						break;
					}
				}

				if (solved) {
					System.out.println("Case #" + i + ": " + (n*j));
					break;
				}
			}
		}

	}
}
