package methodEmbedding.Revenge_of_the_Pancakes.S.LYD466;

import java.io.*;
import java.util.*;


public class Problem2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {
			String s = br.readLine();
			int numPar = 0; // number of partitions
			boolean started = false;
			char current = '+';
			for (int i = s.length()-1; i >= 0; i--) {
				if (!started && s.charAt(i) == '-') {
					started = true;
					current = '-';
					numPar++;
				}
				if (started && s.charAt(i) != current) {
					numPar++;
					current = s.charAt(i);
				}
			}
			System.out.println("Case #" + t + ": " + numPar);
		}
	}
}
