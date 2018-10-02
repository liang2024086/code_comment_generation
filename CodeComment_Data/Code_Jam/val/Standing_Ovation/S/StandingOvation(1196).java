package methodEmbedding.Standing_Ovation.S.LYD215;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StandingOvation {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		String[] split;
		int T;
		T = Integer.parseInt(br.readLine());

		// solution
		int levels[], max, people, extra;
		for (int I = 1; I <= T; I++) {
			extra = 0;
			people = 0;
			s = br.readLine();
			split = s.split(" ");
			max = Integer.parseInt(split[0]);
			levels = new int[max + 1];
			for (int i = 0; i < max; i++) {
				people += Integer.parseInt(split[1].charAt(i) + "");
				System.err.println(people);
				if (i + 1 > people) {
					extra += i + 1 - people;
					people = i + 1;
				}
			}
			System.out.println("Case #" + I + ": " + extra);
		}
	}
}
