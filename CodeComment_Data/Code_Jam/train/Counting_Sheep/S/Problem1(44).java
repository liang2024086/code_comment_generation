package methodEmbedding.Counting_Sheep.S.LYD762;

import java.io.*;
import java.util.*;


public class Problem1 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {
			int N = Integer.parseInt(br.readLine());
			String result = "";
			if (N == 0)
				result = "INSOMNIA";
			else {
				boolean[] record = new boolean[10];
				int total = 0;
				boolean done = false;
				int k = 1;
				while (!done) {
					String n = Integer.toString(k * N);
					for (int i = 0; i < n.length(); i++) {
						int index = Integer.parseInt(n.substring(i, i+1));
						if (!record[index]) {
							if (total == 9) {
								done = true;
								result = n;
								break;
							}
							total++;
							record[index] = true;
						}
					}
					k++;
				}
			}
			
			System.out.println("Case #" + t + ": " + result);
		}

	}
}
