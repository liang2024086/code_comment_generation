package methodEmbedding.Standing_Ovation.S.LYD443;

import java.io.*;
import java.util.*;

public class A {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();
		StringTokenizer st;
		int numcases = Integer.parseInt(br.readLine().trim());
		int num[] = new int[1005];
		for (int casenum = 1; casenum <= numcases; casenum++) {
			st = new StringTokenizer(br.readLine());
			int Smax = Integer.parseInt(st.nextToken());
			String input = st.nextToken();
			for (int i = 0; i <= Smax; i++)
				num[i] = (input.charAt(i) - '0');
			int added = 0, standing = 0;
			for (int i = 0; i <= Smax; i++) {
				if (num[i] == 0)
					continue;
				if (standing < i) {
					added += i - standing;
					standing = i;
				}
				standing += num[i];
			}
			out.append(String.format("Case #%d: %d\n", casenum, added));
		}
		System.out.print(out);
	}
}
