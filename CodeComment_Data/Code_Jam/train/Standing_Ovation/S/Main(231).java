package methodEmbedding.Standing_Ovation.S.LYD243;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int Smax = sc.nextInt();
			String line = sc.next();
			int[] audience = new int[Smax + 1];
			for (int i = 0; i < audience.length; i++) {
				audience[i] = Character.getNumericValue(line.charAt(i));
			}

			int friend = 0;
			int standing = 0;
			for (int i = 0; i < audience.length; i++) {
				if (standing >= i) {
					standing += audience[i];
				} else {
					friend += (i - standing);
					standing = i;
					standing += audience[i];
				}
			}
			System.out.println("Case #" + (t + 1) + ": " + friend);
		}

	}

}
