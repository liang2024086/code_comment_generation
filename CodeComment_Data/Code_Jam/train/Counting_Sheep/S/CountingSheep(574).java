package methodEmbedding.Counting_Sheep.S.LYD1553;


import java.util.HashSet;
import java.util.Scanner;

public class CountingSheep {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int _ = 1; _ <= t; _++) {
			long n = in.nextLong();
			if (n == 0) {
				System.out.println("Case #" + _ + ": INSOMNIA");
			} else {
				HashSet<Integer> H = new HashSet<Integer>();
				int i = 0;
				for (; H.size() < 10; i++) {
					long k = n * (i + 1);
					while (k > 0) {
						H.add((int) (k % 10));
						k /= 10;
					}
				}
				System.out.println("Case #" + _ + ": " + n * i);
			}
		}
	}
}
