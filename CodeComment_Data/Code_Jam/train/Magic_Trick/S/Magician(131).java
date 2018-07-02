package methodEmbedding.Magic_Trick.S.LYD1346;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Magician {

	public static void main(String[] args) {
		String str = null;
		BufferedReader br = null;
		int noc = 0;
		int i = 0;

		try {
			br = new BufferedReader(new FileReader("E:\\A-small-attempt0.in"));

			noc = Integer.parseInt(br.readLine());

			int[] ans = new int[1000];
			String[][] sq = new String[1000][];
			int caseno = 1;

			while ((str = br.readLine()) != null) {
				ans[i] = Integer.parseInt(str);

				for (int k = 1; k <= 4; k++) {
					if (ans[i] == k) {
						sq[i] = br.readLine().split(" ", 4);
					} else {
						br.readLine();
					}
				}
				i++;
			}

			for (int j = 0; j < i; j++) {
				int cnt = 0;
				int val = 0;

				for (int m = 0; m < 4; m++) {
					for (int n = 0; n < 4; n++) {
						if (sq[j][m].equals(sq[j + 1][n])) {
							val = Integer.parseInt(sq[j][m]);
							cnt++;
						}
					}
				}
				if (cnt == 1) {
					System.out.println("Case #" + caseno + ": " + val);
					caseno++;
				} else if (cnt > 1) {
					System.out.println("Case #" + caseno + ": Bad magician!");
					caseno++;
				} else if (cnt == 0) {
					System.out.println("Case #" + caseno
							+ ": Volunteer cheated!");
					caseno++;
				}

				j++;
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}
}
