package methodEmbedding.Standing_Ovation.S.LYD1188;

import java.io.*;
import java.util.*;

public class P1 {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(new File("in.txt"));
		PrintWriter w = new PrintWriter("out.txt");

		int cases = Integer.parseInt(scan.nextLine());

		for (int i = 0; i < cases; i++) {
			String[] split = scan.nextLine().split("");
			int max = Integer.parseInt(split[0]);

			int has = 0;
			int ans = 0;
			int level = 0;
			for (int j = 2; j < split.length; j++) {
				int newAud = Integer.parseInt(split[j]);
				if (level > has) {
					int toAdd = level - has;
					ans += toAdd;
					has += toAdd;
				}
				has += newAud;
				level++;
			}
			w.print("Case #");
			w.print(i+1);
			w.print(": ");
			w.print(ans);
			w.println();
		}



		w.close();
	}

}
