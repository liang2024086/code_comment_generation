package methodEmbedding.Counting_Sheep.S.LYD1496;

import java.util.*;


public class Main_Qualification_Round_2016_A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for (int casei = 1; casei <= t; casei++) {
			long n = sc.nextInt();

			if (n == 0) {
				System.out.printf("Case #%d: INSOMNIA\n", casei);
				continue;
			}

			int i = 1;
			long tmp = n;
			Set<Integer> hs = new HashSet<>();
			while (hs.size() < 10) {
				char[] s = Long.toString(tmp).toCharArray();
				for (char c : s) {
					hs.add(c - '0');
				}

				tmp = n * ++i;
			}

			System.out.printf("Case #%d: %d\n", casei, n * (i - 1));
		}

		sc.close();
	}
}
