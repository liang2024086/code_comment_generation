package methodEmbedding.Standing_Ovation.S.LYD1167;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int T = in.nextInt();
		
		for (int t = 0; t < T; t++) {
			int Smax = in.nextInt();
			String shy = in.nextLine().trim();
			
			int res = 0;
			int standing = 0;

			for (int i = 0; i <= Smax; i++) {
				if (standing < i) {
					int newStanding = i - standing;
					res += newStanding;
					standing += newStanding;
				}
				standing += (shy.charAt(i) - '0');
			}

			System.out.format("Case #%d: %d\n", t+1, res);
		}
		
		in.close();

	}

}
