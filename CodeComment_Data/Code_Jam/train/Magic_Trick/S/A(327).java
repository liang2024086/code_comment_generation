package methodEmbedding.Magic_Trick.S.LYD1946;

import java.util.*;
import java.io.*;

public class A {
	public static void main(String args[]) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(in.readLine());

		for(int i = 0; i < cases; i++) {
			int r1 = Integer.parseInt(in.readLine()) - 1;
			int[][] b1 = new int[4][4];

			for(int j = 0; j < 4; j++) {
				String[] parts = in.readLine().split(" ");

				for(int k = 0; k < 4; k++) {
					b1[j][k] = Integer.parseInt(parts[k]);
				}
			}

			int r2 = Integer.parseInt(in.readLine()) - 1;
			int[][] b2 = new int[4][4];

			for(int j = 0; j < 4; j++) {
				String[] parts = in.readLine().split(" ");

				for(int k = 0; k < 4; k++) {
					b2[j][k] = Integer.parseInt(parts[k]);
				}
			}

			List<Integer> possible = new ArrayList<Integer>();

			for(int j = 0; j < 4; j++) {
				if(b1[r1][j] == b2[r2][0] || b1[r1][j] == b2[r2][1] || b1[r1][j] == b2[r2][2] || b1[r1][j] == b2[r2][3]) {
					possible.add(b1[r1][j]);
				}
			}

			if(possible.size() == 0) System.out.println("Case #" + (i + 1) + ": Volunteer cheated!");
			if(possible.size() > 1) System.out.println("Case #" + (i + 1) + ": Bad magician!");
			if(possible.size() == 1) System.out.println("Case #" + (i + 1) + ": " + possible.get(0));
		}
	}
}
