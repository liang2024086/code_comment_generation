package methodEmbedding.Counting_Sheep.S.LYD1714;

import java.util.Scanner;

class CountingSheep {
	public static void main(String argv[]) {
		Scanner reader = new Scanner(System.in);
		long T, N, c, result;
		T = reader.nextInt();
		for (long i = 1; i <= T; i++) {
			N = reader.nextInt();
			result = 0;
			System.out.print("Case #" + i + ": ");
			if(N == 0) {
				System.out.println("INSOMNIA");
				continue;
			}

			boolean[] digit = new boolean[10];
			for (long j = 1; j <= 1000; j++) {
				c = j*N;
				result = j*N;
				while(c != 0) {
					digit[(int) (c % 10)] = true;
					c = c / 10;
				}
				for (boolean b : digit)
					if (b == false) result = 0;
				if(result != 0) break;
			}
			if(result == 0) System.out.println("INSOMNIA");
			else System.out.println(result);
		}
	}
}
