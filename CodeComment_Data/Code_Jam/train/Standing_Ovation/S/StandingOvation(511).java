package methodEmbedding.Standing_Ovation.S.LYD98;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandingOvation {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(in.readLine());
		for (int _ = 1; _ <= t; _++) {
			String[] S = in.readLine().split(" ");
			int res = 0;
			int cnt = 0;
			for (int i = 0; i < S[1].length(); i++) {
				if (cnt < i) {
					res += i - cnt;
					cnt = i;
				}
				cnt += S[1].charAt(i) - '0';
			}
			System.out.println("Case #" + _ + ": " + res);
		}
	}
}
