package methodEmbedding.Standing_Ovation.S.LYD1802;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 1; i <= T; i++) {
			sc.nextInt();
			int sum = 0, result = 0;
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				result = Math.max(result, j - sum);
				sum += s.charAt(j) - '0';
			}
			System.out.println("Case #" + i + ": " + result);
		}
		sc.close();
	}
}
