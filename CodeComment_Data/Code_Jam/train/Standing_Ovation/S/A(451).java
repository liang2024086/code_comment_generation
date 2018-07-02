package methodEmbedding.Standing_Ovation.S.LYD299;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class A {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bf.readLine());
		for (int tc = 1; tc <= t; tc++) {
			String[] parts = bf.readLine().split(" ");
			int sMax = Integer.parseInt(parts[0]);
			int[] counts = new int[sMax + 1];
			for (int i = 0; i <= sMax; i++) {
				counts[i] = Integer.parseInt(parts[1].substring(i, i + 1));
			}

			int curStanding = counts[0];
			int needed = 0;
			for (int i = 1; i <= sMax; i++) {
				if (curStanding < i) {
					needed += i - curStanding;
					curStanding = i;
				}
				curStanding += counts[i];
			}
			System.out.println("Case #" + tc + ": " + needed);
		}
	}
}
