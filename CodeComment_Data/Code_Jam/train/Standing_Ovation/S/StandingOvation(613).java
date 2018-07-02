package methodEmbedding.Standing_Ovation.S.LYD1413;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StandingOvation {
	public static void main(String[] args) {
		File file = new File(System.getProperty("user.dir") + "/src/A-small-attempt0.in");
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(
					System.getProperty("user.dir") + "/src/A-small-attept0.out"));
			Scanner sc = new Scanner(file);
			int T = sc.nextInt();

			for (int t = 0; t < T; t++) {
				int maxK = sc.nextInt();
				String a = sc.next();
				int[] aud = new int[maxK + 1];
				for (int k = 0; k <= maxK; k++) {
					aud[k] = Integer.parseInt(a.substring(k, k + 1));
				}
				int curStand = 0;
				int friends = 0;
				for (int i = 0; i <= maxK; i++) {
					if (curStand < i) {
						friends += (i - curStand);
						curStand += (i - curStand);
					}
					curStand += aud[i];
				}

				System.out.println("Case #" + (t + 1) + ": " + friends);
				out.write("Case #" + (t + 1) + ": " + friends);
				out.newLine();

			}
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
