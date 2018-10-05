package methodEmbedding.Magic_Trick.S.LYD630;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;

public class MagicTrick {
	private static final String SMALL_IN = "data/magicTrick/A-small-attempt0.in";
	private static final String SMALL_OUT = "data/magicTrick/small0.out";

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(SMALL_IN));
		BufferedWriter bw = new BufferedWriter(new FileWriter(SMALL_OUT));
		int T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; ++t) {
			int ans1 = Integer.parseInt(br.readLine());
			HashSet<String> set1 = new HashSet<String>();
			for (int i = 0; i < 4; ++i) {
				if (i == ans1 - 1) {
					String[] row = br.readLine().split(" ");
					for (int j = 0; j < 4; ++j) {
						set1.add(row[j]);
					}
				} else {
					br.readLine();
				}
			}

			int ans2 = Integer.parseInt(br.readLine());
			HashSet<String> set2 = new HashSet<String>();
			for (int i = 0; i < 4; ++i) {
				if (i == ans2 - 1) {
					String[] row = br.readLine().split(" ");
					for (int j = 0; j < 4; ++j) {
						if (set1.contains(row[j])) {
							set2.add(row[j]);
						}
					}
				} else {
					br.readLine();
				}
			}
			String result = "";
			if (set2.size() == 1) {
				for (String card : set2) {
					result = card;
				}
			} else if (set2.size() == 0) {
				result = "Volunteer cheated!";
			} else {
				result = "Bad magician!";
			}
			bw.write("Case #" + t + ": " + result + "\r\n");
		}
		bw.close();
		br.close();
	}
}
