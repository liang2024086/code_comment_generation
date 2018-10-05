package methodEmbedding.Magic_Trick.S.LYD401;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class MagicTrick {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("input.txt"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
		int t = Integer.parseInt(in.readLine());
		for (int k = 1; k <= t; ++k) {
			Set<Integer> ansSet1 = new HashSet<Integer>(), ansSet2 = new HashSet<Integer>();
			int ans = Integer.parseInt(in.readLine());
			for (int i = 1; i <= 4; ++i) {
				if (i == ans) {
					StringTokenizer stok = new StringTokenizer(in.readLine());
					for (int j = 0; j < 4; ++j)
						ansSet1.add(Integer.parseInt(stok.nextToken()));
				}
				else
					in.readLine();
			}
			ans = Integer.parseInt(in.readLine());
			for (int i = 1; i <= 4; ++i) {
				if (i == ans) {
					StringTokenizer stok = new StringTokenizer(in.readLine());
					for (int j = 0; j < 4; ++j)
						ansSet2.add(Integer.parseInt(stok.nextToken()));
				}
				else
					in.readLine();
			}
			ansSet1.retainAll(ansSet2);
			out.print("Case #" + k + ": ");
			if (ansSet1.size() == 1)
				out.println(ansSet1.toArray()[0]);
			else if (ansSet1.size() > 1)
				out.println("Bad magician!");
			else
				out.println("Volunteer cheated!");
		}
		in.close();
		out.close();
	}
}
