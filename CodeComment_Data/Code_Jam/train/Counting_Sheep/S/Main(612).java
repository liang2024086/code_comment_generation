package methodEmbedding.Counting_Sheep.S.LYD1305;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 1; i <= T; i++) {
			int N = sc.nextInt(), y = 0;
			if (N != 0) {
				HashSet<Character> digits = new HashSet<Character>();
				while (digits.size() < 10) {
					for (char e : String.valueOf(++y * N).toCharArray()) {
						digits.add(e);
					}
				}
			}
			System.out.println("Case #" + i + ": " + (y == 0 ? "INSOMNIA" : y * N));
		}
		sc.close();
	}
}
