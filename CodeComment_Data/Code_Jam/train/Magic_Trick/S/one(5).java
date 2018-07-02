package methodEmbedding.Magic_Trick.S.LYD1919;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class one {
	public static void main(String[] args) {
		try {
			Scanner s = new Scanner(new File(args[0] + args[1]));
			FileWriter f = new FileWriter(new File(args[0] + "output1"));
			int N = s.nextInt();

			int b1[][] = new int[4][4];
			int b2;

			String m = null;
			String b = "Bad magician!";
			String v = "Volunteer cheated!";

			for (int n = 0; n < N; n++) {
				int count = 0;
				int match = 0;
				int g1 = s.nextInt()-1;
				for (int i = 0; i < 4; i++)
					for (int j = 0; j < 4; j++)
						b1[i][j] = s.nextInt();

				int g2 = s.nextInt()-1;
				for (int i = 0; i < 4; i++)
					for (int j = 0; j < 4; j++) {
						b2 = s.nextInt();
						if (i == g2
								&& (b1[g1][0] == b2
										|| b1[g1][1] == b2
										|| b1[g1][2] == b2 || b1[g1][3] == b2)) {
							count++;
							match = b2;
						}
					}

				if (count == 1) {
					m = String.valueOf(match);
				} else if (count == 0) {
					m = v;
				} else {
					m = b;
				}
				f.write("Case #"+(n+1)+": " + m + "\n");
			}
			f.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
