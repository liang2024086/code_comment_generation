package methodEmbedding.Magic_Trick.S.LYD2143;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class A {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader buf = new BufferedReader(new FileReader("A-small-attempt0.in"));
		PrintWriter writer = new PrintWriter("A.out");
		int tCases = Integer.parseInt(buf.readLine().trim());

		for (int t = 1; t <= tCases; t++) {
			int r1 = Integer.parseInt(buf.readLine().trim()) - 1;
			String[] s = new String[4];
			s[0] = buf.readLine();
			s[1] = buf.readLine();
			s[2] = buf.readLine();
			s[3] = buf.readLine();
			StringTokenizer str = new StringTokenizer(s[r1]);
			TreeSet<Integer> set = new TreeSet<Integer>();
			int itr = 4;
			while (itr-- > 0)
				set.add(Integer.parseInt(str.nextToken()));
			int r2 = Integer.parseInt(buf.readLine().trim()) - 1;
			s[0] = buf.readLine();
			s[1] = buf.readLine();
			s[2] = buf.readLine();
			s[3] = buf.readLine();
			str = new StringTokenizer(s[r2]);
			int cnt = 0;
			itr = 4;
			int number = 0;
			while (itr-- > 0) {
				int x = Integer.parseInt(str.nextToken());
				if (set.contains(x)) {
					cnt++;
					number = x;
				}
			}
			if (cnt == 1)
				writer.printf("Case #%d: %d\n", t, number);
			else if (cnt > 1)
				writer.printf("Case #%d: Bad magician!\n", t);
			else
				writer.printf("Case #%d: Volunteer cheated!\n", t);
		}
		writer.close();
	}
}
