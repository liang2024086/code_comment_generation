package methodEmbedding.Revenge_of_the_Pancakes.S.LYD226;

import java.util.Scanner;

public class qcodejam2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int t = 0; t < T; t++) {
			String inp = sc.next();
			char[] in = inp.toCharArray();
			int output = 0;
			if (in.length == 1) {
				if (in[0] == '+')
					System.out.println("Case #" + (t + 1) + ": 0");
				else
					System.out.println("Case #" + (t + 1) + ": 1");
			} else {
				char prev = in[0];
				for (int i = 1; i < in.length; i++) {
					char next = in[i];
					if (next != prev) {
						in[i] = next;
						output++;
						prev = next;
					}

				}
				if (prev == '-') {
					System.out.println("Case #" + (t + 1) + ": " + (output + 1));
				} else {
					System.out.println("Case #" + (t + 1) + ": " + output);
				}
			}
		}

	}

}
