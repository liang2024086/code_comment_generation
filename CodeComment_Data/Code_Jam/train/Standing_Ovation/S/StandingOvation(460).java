package methodEmbedding.Standing_Ovation.S.LYD899;

import java.io.File;
import java.util.Scanner;

public class StandingOvation {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			int t = sc.nextInt();
			for (int j = 0 ; j < t; j++) {
				int standing = 0;
				int helpRequired = 0;
				int max = sc.nextInt();
				final String sis = sc.next();
				final char[] siChar = sis.toCharArray();
				for (int i = 0; i <= max; i++) {
					int si = siChar[i] - '0';
					int helpRequiredForThisLevel = si == 0 ? 0 : Math.max(0, i - standing);
					helpRequired += helpRequiredForThisLevel;
					standing += (si + helpRequiredForThisLevel);
				}
				System.out.println("Case #" + (j+1) + ": " + helpRequired);
			}
		} catch (final Exception e) {
			e.printStackTrace();
			System.err.println("Error");
		}
	}
}
