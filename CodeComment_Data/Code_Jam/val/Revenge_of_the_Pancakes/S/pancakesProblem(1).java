package methodEmbedding.Revenge_of_the_Pancakes.S.LYD505;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class pancakesProblem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(
				System.in)));
		int t = sc.nextInt();

		for (int i = 1; i <= t; i++) {
			StringBuilder sb = new StringBuilder(sc.next());
			String s = null;
			int count = 0;
			for (int j = 0; j < sb.length() - 1; j++) {
				if (sb.charAt(j) != sb.charAt(j + 1)) {
					if (sb.charAt(j) == '+') {
						s = sb.substring(0, j + 1).replace("+", "-");
						sb.replace(0, j + 1, s);
						count++;
					} else {
						s = sb.substring(0, j + 1).replace("-", "+");
						sb.replace(0, j + 1, s);
						count++;
					}

					// System.out.println(sb);
				}

			}
			if (sb.charAt(sb.length() - 1) == '-') {
				s = sb.substring(0, sb.length()).replace("-", "+");
				sb.replace(0, sb.length(), s);
				count++;
				// System.out.println(sb);
			}

			System.out.println("Case #" + i + ": " + count);
		}
		sc.close();
	}

}
