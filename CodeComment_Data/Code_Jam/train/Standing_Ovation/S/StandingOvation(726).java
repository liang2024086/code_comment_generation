package methodEmbedding.Standing_Ovation.S.LYD1223;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class StandingOvation {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new  BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(in.readLine());
		
		for (int i = 1; i <= t; i++) {
			int smax;
			String occurences;
			
			String[] next = in.readLine().split(" ");
			smax = Integer.parseInt(next[0]);
			occurences = next[1];
			
			int count = 0;
			int currentsum = 0;
			for (int j = 0; j <= smax; j++) {
				int sj = Integer.parseInt(Character.toString(occurences.charAt(j)));
				if (currentsum >= j) {
					currentsum += sj;
				}
				else {
					count += (j - currentsum);
					currentsum += sj + (j - currentsum);
				}
			}
			
			System.out.println("Case #" + i + ": " + count);
			
		}
	}

}
