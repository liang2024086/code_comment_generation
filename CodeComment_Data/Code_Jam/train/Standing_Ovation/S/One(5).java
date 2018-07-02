package methodEmbedding.Standing_Ovation.S.LYD325;

import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int t = 1; t <= T; t++) {
			int sMax = in.nextInt();
			int friends = 0, standingAudience = 0;
			//int[] audience = new int[sMax + 1];
			String s = in.next();
			for (int i = 0; i <= sMax; i++) {
				int curr = Integer.parseInt(String.valueOf(s.charAt(i)));
				//audience[i] = curr;
				if (curr > 0) {
					while (standingAudience < i) {
						friends++;
						standingAudience++;
					}
					standingAudience += curr;
				}
			}
			System.out.printf("Case #%d: %d",t,friends);
			System.out.println();
		}
	}
}
