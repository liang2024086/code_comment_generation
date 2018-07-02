package methodEmbedding.Magic_Trick.S.LYD1294;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		FileReader in = new FileReader("A-small-attempt0.in");
		BufferedReader buff = new BufferedReader(in);
		// BufferedReader buff = new BufferedReader(new InputStreamReader(
		// System.in));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"A-small-attempt0.out")));

		StringTokenizer st;
		int T = Integer.parseInt(buff.readLine());
		for (int c = 1; c <= T; c++) {
			int ans1 = Integer.parseInt(buff.readLine()) - 1;
			int[][] map1 = new int[4][4];
			for (int i = 0; i < 4; i++) {
				st = new StringTokenizer(buff.readLine());
				for (int j = 0; j < 4; j++)
					map1[i][j] = Integer.parseInt(st.nextToken());
			}

			int ans2 = Integer.parseInt(buff.readLine()) - 1;
			int[][] map2 = new int[4][4];
			for (int i = 0; i < 4; i++) {
				st = new StringTokenizer(buff.readLine());
				for (int j = 0; j < 4; j++)
					map2[i][j] = Integer.parseInt(st.nextToken());
			}

			int counter = 0, ans = -1;
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					if (map1[ans1][j] == map2[ans2][k]) {
						counter++;
						ans = map1[ans1][j];
					}
				}
			}
			if (ans == -1)
				out.println("Case #" + c + ": Volunteer cheated!");
			else if (counter > 1)
				out.println("Case #" + c + ": Bad magician!");
			else
				out.println("Case #" + c + ": " + ans);
		}
		in.close();
		out.close();
	}
}
