package methodEmbedding.Standing_Ovation.S.LYD1549;

import java.io.*;
import java.util.*;

public class Main {
	public static void main (String[] args) throws IOException {
		BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
		int T = Integer.parseInt(reader.readLine());
		for (int ii = 1; ii <= T; ii++) {
			String[] line = reader.readLine().split(" ");
			int Smax = Integer.parseInt(line[0]);
			int[] shyness = new int[Smax + 1];
			for (int jj = 0; jj < line[1].length(); jj++) {
				shyness[jj] = line[1].charAt(jj) - '0';
			}
			int need = 0;
			int accumulator = 0;
			accumulator = accumulator + shyness[0];
			for (int jj = 1; jj < shyness.length; jj++) {
				if(shyness[jj] > 0) { 
					if(accumulator < jj) {
						need = need + (jj - accumulator);
						accumulator = accumulator + (jj - accumulator) + shyness[jj];
					} else {
						accumulator = accumulator + shyness[jj];
					}
				}
			}
			System.out.println("Case #" + ii + ": " + need);
		}
	}
}
