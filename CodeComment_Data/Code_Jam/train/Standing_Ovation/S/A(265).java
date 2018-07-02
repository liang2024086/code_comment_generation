package methodEmbedding.Standing_Ovation.S.LYD533;

import java.util.Scanner;


public class A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int test = 1; test <= t; test++) {
			int s = sc.nextInt();
			String data = sc.next();
			int result = 0;
			int audience = 0;
			for (int i = 0; i <= s; i++) {
				result = Math.max(result, i - audience);
				audience += Integer.parseInt("" + data.charAt(i));
			}
			System.out.println("Case #" + test + ": " + result);
		}
	}

}
