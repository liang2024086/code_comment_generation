package methodEmbedding.Magic_Trick.S.LYD400;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;

public class CJ14QRAS {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		PrintWriter pw = new PrintWriter("output.txt");
		int T = Integer.parseInt(br.readLine());
		String tokens[] = null;
		for (int i = 1; i <= T; i++) {
			int r1 = Integer.parseInt(br.readLine());
			for (int j = 1; j <= 4; j++) {
				if (j == r1) {
					tokens = br.readLine().split(" ");
				} else {
					br.readLine().split(" ");
				}
			}
			HashSet<Integer> hs = new HashSet<Integer>();
			for (int j = 0; j < 4; j++) {
				hs.add(Integer.parseInt(tokens[j]));
			}

			int r2 = Integer.parseInt(br.readLine());
			for (int j = 1; j <= 4; j++) {
				if (j == r2) {
					tokens = br.readLine().split(" ");
				} else {
					br.readLine().split(" ");
				}
			}
			int ans = 0;
			int card = 0;
			for (int j = 0; j < 4; j++) {
				if (hs.contains(Integer.parseInt(tokens[j]))) {
					card = Integer.parseInt(tokens[j]);
					ans++;
				}
			}
			if (ans == 0) {
				pw.println("Case #" + i + ": Volunteer cheated!");
			} else if (ans == 1) {
				pw.println("Case #" + i + ": " + card);
			} else {
				pw.println("Case #" + i + ": Bad magician!");
			}
		}
		pw.close();

	}

}
