package methodEmbedding.Standing_Ovation.S.LYD1962;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new FileReader(new File(
				"C:\\Users\\Chintan Trivedi\\Downloads\\A-small-attempt3.in")));
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int j = 1; j <= T; j++) {

			String s[] = br.readLine().split(" ");
	//		System.out.println(s[0] + " " + s[1]);
			int l = Integer.parseInt(s[0]);

			int aud = Integer.parseInt(s[1]);
			int total = 0;
			List<Integer> reqs = new ArrayList<Integer>();
			reqs.add(new Integer(0));
			int req = 0;
			for (int i = 0; i <= l; i++) {
				int shy = i;
				int aud_cnt = Integer.parseInt(Character.toString(s[1]
						.charAt(i)));

				if (total >= i) {
					total += aud_cnt;
				} else {
					req = i - total;
					reqs.add(new Integer(req));
					total += aud_cnt;
				}

			}

			System.out.println("Case #" + (j) + ": " + Collections.max(reqs));

		}

	}
}
