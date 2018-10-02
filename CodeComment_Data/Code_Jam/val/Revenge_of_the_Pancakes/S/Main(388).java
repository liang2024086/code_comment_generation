package methodEmbedding.Revenge_of_the_Pancakes.S.LYD571;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 1; i <= T; i++) {
			String s = sc.next();
			int times = 0;
			char prev = '+';
			for (int j = s.length() - 1; j >= 0; j--) {
				if (s.charAt(j) != prev) {
					prev = s.charAt(j);
					times++;
				}
			}
			System.out.println("Case #" + i + ": " + times);
		}
		sc.close();
	}
}
