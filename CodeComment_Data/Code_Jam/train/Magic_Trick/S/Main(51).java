package methodEmbedding.Magic_Trick.S.LYD816;

import java.io.*;

import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("A-small-attempt0.in"));
		PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
		int t;

		while(in.hasNext()) {
			Integer[] a = new Integer[4];
			Integer[] b = new Integer[4];
			t = in.nextInt();
			for(int i = 0; i < t; i++) {
				int r1 = in.nextInt();
				int[][] first = new int[4][4];
				int[][] second = new int[4][4];
				for(int ii = 0; ii < 4; ii++) {
					for(int jj = 0; jj < 4; jj++) {
						first[ii][jj] = in.nextInt();
					}
				}
				int r2 = in.nextInt();
				for(int ii = 0; ii < 4; ii++) {
					for(int jj = 0; jj < 4; jj++) {
						second[ii][jj] = in.nextInt();
					}
				}
				for(int k = 0; k < 4; k++) {
					a[k] = first[r1 - 1][k];
					b[k] = second[r2 - 1][k];
				}
				int res = 0;
				int card = 0;
				for(int x = 0; x < a.length; x++)
					if(Arrays.asList(b).contains(a[x])) {
						card = a[x];
						res++;
					}
				Arrays.sort(a);
				Arrays.sort(b);
				if(res == 0)
					writer.println("Case #" + (i + 1) + ": " + "Volunteer cheated!");
				else if(res == 1) 
					writer.println("Case #" + (i + 1) + ": " + card);
				else
					writer.println("Case #" + (i + 1) + ": " + "Bad magician!");
			}
		}
		writer.close();
	}
}
