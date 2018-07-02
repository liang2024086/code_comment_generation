package methodEmbedding.Magic_Trick.S.LYD1696;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;

public class MagicTrickSmall {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("A-small-attempt0.in"));
		PrintWriter pw = new PrintWriter(new File("MagicTrickOut.txt"));
		int T = sc.nextInt();
		for (int a = 0; a < T; a++) {
			HashSet<Integer> m = new HashSet<Integer>();
			int inp;
			int A = sc.nextInt();
			// System.out.println(A);
			for (int i = 0; i < 16; i++) {
				inp = sc.nextInt();
				if ((i / 4 + 1) == A) {
					m.add(inp);
				}
			}
			A = sc.nextInt();
			HashSet<Integer> n = new HashSet<Integer>();
			for (int i = 0; i < 16; i++) {
				inp = sc.nextInt();
				if ((i / 4 + 1) == A && m.contains(inp)) {
					n.add(inp);
				}
			}
			pw.print(String.format("Case #%d: ", a + 1));
			if (n.size() == 0) {
				pw.println("Volunteer cheated!");
			} else if (n.size() == 1) {
				pw.println(n.iterator().next());
			} else {
				pw.println("Bad magician!");
			}
		}
		sc.close();
		pw.close();
	}
}
