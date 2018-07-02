package methodEmbedding.Magic_Trick.S.LYD72;

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader("A-small-attempt0.in"));
		PrintWriter writer = new PrintWriter("output.txt");
		StringTokenizer st;
		HashSet<Integer> set1 = new HashSet<Integer>();
		HashSet<Integer> set2 = new HashSet<Integer>();
		int T = Integer.parseInt(reader.readLine());
		for (int i = 1; i <= T; i++) {
			String result = null;
			set1.clear();
			set2.clear();

			int ans = Integer.parseInt(reader.readLine());
			for (int j = 0; j < 4; j++) {
				if (j + 1 == ans) {
					st = new StringTokenizer(reader.readLine());
					while (st.hasMoreTokens())
						set1.add(Integer.parseInt(st.nextToken()));
				} else {
					reader.readLine();
				}
			}

			// System.out.println("Set 1: " + set1.toString());

			ans = Integer.parseInt(reader.readLine());
			for (int j = 0; j < 4; j++) {
				if (j + 1 == ans) {
					st = new StringTokenizer(reader.readLine());
					while (st.hasMoreTokens())
						set2.add(Integer.parseInt(st.nextToken()));
				} else {
					reader.readLine();
				}
			}

			// System.out.println("Set 2: " + set2.toString());

			set1.retainAll(set2);

			// System.out.println("Common: " + set1.toString());

			if (set1.isEmpty()) {
				result = "Volunteer cheated!";
			} else if (set1.size() == 1) {
				result = "" + set1.iterator().next();
			} else {
				result = "Bad magician!";
			}

			writer.println("Case #" + i + ": " + result);
		}
		writer.close();
		reader.close();
	}
}
