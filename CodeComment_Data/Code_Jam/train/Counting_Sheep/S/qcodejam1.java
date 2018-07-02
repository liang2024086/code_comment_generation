package methodEmbedding.Counting_Sheep.S.LYD1705;

import java.util.Scanner;

public class qcodejam1 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int t = 0; t < T; t++) {
			int N = sc.nextInt();
			boolean result[] = new boolean[10];
			for (int j = 0; j < result.length; j++) {
				result[j] = false;
			}
			int counter = 1;
			int r_counter = 0;
			if (N == 0) {
				System.out.println("Case #" + (t + 1) + ": " + "INSOMNIA");
			}
			while (counter >= 1 && N != 0) {
				r_counter = 0;
				int i = N * counter;
				int fix_i = i;
				while (i > 0) {
					int rem = i % 10;
					result[rem] = true;
					i = i / 10;
				}

				for (boolean j : result) {
					if (j == true) {
						r_counter++;
					}
				}
				if (r_counter == 10) {
					System.out.println("Case #" + (t + 1) + ": " + fix_i);
					break;
				}
				counter++;
			}

		}

	}

}
