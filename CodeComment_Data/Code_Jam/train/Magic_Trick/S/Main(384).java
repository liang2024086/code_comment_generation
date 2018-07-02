package methodEmbedding.Magic_Trick.S.LYD30;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

	static int res = 0;
	static int card = 0;

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		PrintWriter out = new PrintWriter(new FileOutputStream("C:\\Users\\Kristijan\\Desktop\\out.txt"));
		StringTokenizer st;
		int t = Integer.parseInt(in.readLine());

		for (int i = 1; i <= t; i++) {
			int vRow = Integer.parseInt(in.readLine());
			StringBuilder sb = new StringBuilder();
			sb.append("Case #" + i + ": ");
			HashSet<Integer> first = new HashSet<>();

			for (int j = 1; j <= 4; j++) {
				st = new StringTokenizer(in.readLine());
				if (j == vRow) {
					for (int k = 0; k < 4; k++)
						first.add(Integer.parseInt(st.nextToken()));
				}
			}
			int mRow = Integer.parseInt(in.readLine());

			for (int j = 1; j <= 4; j++) {
				st = new StringTokenizer(in.readLine());
				if (j == mRow) {
					for (int k = 0; k < 4; k++) {
						int c = Integer.parseInt(st.nextToken());
						if (first.contains(c)) {
							res++;
							card = c;
						}
					}
				}
			}
			if (res == 1) {
				sb.append(card);
			} else if (res == 0) {
				sb.append("Volunteer cheated!");
			} else {
				sb.append("Bad magician!");
			}
			System.out.println(sb.toString());
			out.print(sb.toString()+"\n");
			out.flush();
			res = 0;
		}
		out.close();
	}
}
