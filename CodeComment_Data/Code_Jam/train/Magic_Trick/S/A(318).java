package methodEmbedding.Magic_Trick.S.LYD1137;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class A {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(
				new FileInputStream("A.in")));
		PrintWriter out = new PrintWriter("A.out");
		int t = Integer.parseInt(in.readLine());
		for (int i = 1; i <= t; i++) {
			int n = 0;
			int num = 0;
			boolean guess[][] = new boolean[16][2];
			for (int j = 0; j < 2; j++) {
				int g = Integer.parseInt(in.readLine());
				for (int k = 0; k < 4; k++) {
					String[] row = in.readLine().split(" ");
					if (k + 1 == g)
						for (int l = 0; l < row.length; l++) {
							guess[Integer.parseInt(row[l]) - 1][j] = true;
						}
				}
			}
			for (int j = 0; j < guess.length; j++) {
				if (guess[j][0] && guess[j][1]) {
					n++;
					num = j + 1;
				}
			}
			out.print("Case #" + i + ": ");
			if (n == 1) {
				out.println(num);
			} else if (n > 1) {
				out.println("Bad magician!");
			} else if (n == 0) {
				out.println("Volunteer cheated!");
			}
		}
		in.close();
		out.close();
	}
}
