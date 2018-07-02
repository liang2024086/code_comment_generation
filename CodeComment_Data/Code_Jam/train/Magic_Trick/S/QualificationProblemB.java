package methodEmbedding.Magic_Trick.S.LYD1002;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;

public class QualificationProblemB {
	static String HEADER = "Case #";
	static String BAD = "Bad magician!";
	static String CHEAT = "Volunteer cheated!";

	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new FileReader("input.txt"));
			int n = Integer.parseInt(in.readLine());
			for (int i = 0; i < n; i++) {
				int r1 = Integer.parseInt(in.readLine());
				for (int k = 0; k < r1 - 1; k++) {
					in.readLine();
				}
				String[] row1 = in.readLine().split(" ");
				for (int k = 0; k < 4 - r1; k++) {
					in.readLine();
				}

				int r2 = Integer.parseInt(in.readLine());
				for (int k = 0; k < r2 - 1; k++) {
					in.readLine();
				}
				String[] row2 = in.readLine().split(" ");
				for (int k = 0; k < 4 - r2; k++) {
					in.readLine();
				}

				HashSet<String> seen = new HashSet<String>();
				String result = "cheat";
				for (int k = 0; k < 4; k++) {
					seen.add(row1[k]);
				}
				for (int k = 0; k < 4; k++) {
					if (seen.contains(row2[k]) && result.equals("cheat")) {
						result = row2[k];
					} else if (seen.contains(row2[k])) {
						result = "bad";
					} else {
					}
				}
				if (result.equals("cheat")) {
					System.out.println(HEADER + (i + 1) + ": " + CHEAT);
				} else if (result.equals("bad")) {
					System.out.println(HEADER + (i + 1) + ": " + BAD);
				} else {
					System.out.println(HEADER + (i + 1) + ": " + result);
				}
			}
			in.close();
		} catch (Exception e) {
		}
	}
}
