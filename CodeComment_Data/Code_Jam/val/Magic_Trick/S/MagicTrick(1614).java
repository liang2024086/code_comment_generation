package methodEmbedding.Magic_Trick.S.LYD1107;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class MagicTrick {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int test_cases = 0, n1, n2, common;
		StringTokenizer temp;
		int a[][], b[][];

		test_cases = Integer.parseInt(br.readLine());
		for (int i = 0; i < test_cases; i++) {

			common = 0;
			a = new int[4][4];
			n1 = Integer.parseInt(br.readLine());
			for (int j = 0; j < 4; j++) {
				temp = new StringTokenizer(br.readLine());
				for (int j2 = 0; j2 < 4; j2++) {
					a[j][j2] = Integer.parseInt(temp.nextToken());
				}
			}

			b = new int[4][4];
			n2 = Integer.parseInt(br.readLine());
			for (int j = 0; j < 4; j++) {
				temp = new StringTokenizer(br.readLine());
				for (int j2 = 0; j2 < 4; j2++) {
					b[j][j2] = Integer.parseInt(temp.nextToken());
				}
			}

			int x, y = 0;
			for (int j = 0; j < 4; j++) {
				x = a[n1 - 1][j];
				for (int j2 = 0; j2 < 4; j2++) {
					if (x == b[n2 - 1][j2]) {
						common++;
						y = x;
					}
				}
			}

			if (common == 0)
				pw.println("Case #" + (i + 1) + ": Volunteer cheated!");
			else if (common == 1)
				pw.println("Case #" + (i + 1) + ": " + y);
			else
				pw.println("Case #" + (i + 1) + ": Bad magician!");

		}
		
		pw.flush();
	}
}
