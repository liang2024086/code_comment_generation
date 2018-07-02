package methodEmbedding.Standing_Ovation.S.LYD1163;

/*
 * 
 * 
 */

import java.io.*;
import java.util.*;

public class SHEM {
	// CLASS
	public static void main(String args[]) throws IOException {
		// MAIN

		BufferedReader bf = new BufferedReader(new FileReader("A-small-attempt0.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"A.out")));

		int T = Integer.parseInt(bf.readLine());
		for (int loop = 1; loop <= T; loop++) {
			// TEST CASE

			out.print("Case #" + loop + ": ");

			// //////////////////////////
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int s = Integer.parseInt(st.nextToken());
			String str = st.nextToken();
			int a[] = new int[s + 1];

			for (int i = 0; i <= s; i++)
				a[i] = Integer.parseInt(str.substring(i, i + 1));

			int sum = a[0];
			int f = 0;
			for (int i = 1; i <= s; i++) {
				int x = i - (sum + f);
				if (x > 0)
					f += x;
				sum += a[i];
			}
			// /////////////////////////
			//System.out.println(f);
			out.println(f);
			// TEST CASE ENDS
		}

		out.close();
		// MAIN ENDS
	}
	// CLASS ENDS
}
