package methodEmbedding.Standing_Ovation.S.LYD92;


import java.io.*;
import java.util.*;

public class ovation {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("ovation.in"));
				//new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ovation.out")));
				//new OutputStreamWriter(System.out)));
		int t = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < t; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int smax = Integer.parseInt(st.nextToken());
			String numShy = st.nextToken();
			int ans = 0;
			int people = 0;
			for (int i = 0; i <= smax; i++) {
				if (people < i) {
					ans += i - people;
					people = i;
				}
				people += numShy.charAt(i) - '0';
			}
			out.printf("Case #%d: %d\n", tc + 1, ans);
		}
		out.flush();
		System.exit(0);
	}

}
