package methodEmbedding.Standing_Ovation.S.LYD690;

import java.io.*;
import java.util.*;

class StandingOvation {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		int T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			char[] cc = st.nextToken().toCharArray();
			int sum = 0;
			int cnt = 0;
			for (int i = 0; i <= m; i++) {
				if (sum < i) {
					cnt += i - sum;
					sum = i;
				}
				sum += cc[i] - '0';
			}
			pw.println("Case #" + t + ": " + cnt);
		}
		pw.close();
	}
}

