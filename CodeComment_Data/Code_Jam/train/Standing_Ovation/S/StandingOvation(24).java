package methodEmbedding.Standing_Ovation.S.LYD483;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class StandingOvation {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("A-small-attempt0.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("StandingOvation.out")));

		int T = Integer.parseInt(in.readLine());

		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			int max = Integer.parseInt(st.nextToken());
			int[] shy = new int[max + 1];
			String s = st.nextToken();
			int people = 0;
			int standing = 0;
			for (int j = 0; j < max + 1; j++) {
				if (standing < j) {
					people = people + (j - standing);
					standing = j;
				}
				shy[j] = Integer.parseInt(s.substring(j, j+1));
				standing = standing + shy[j];
			}
			int c = i + 1;
			out.write("Case #" + c + ": " + people + "\n");
		}
		out.close();
		System.exit(0);
	}
}
