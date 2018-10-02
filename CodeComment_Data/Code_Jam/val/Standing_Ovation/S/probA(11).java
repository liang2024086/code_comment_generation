package methodEmbedding.Standing_Ovation.S.LYD636;

import java.util.*;
import java.io.*;

public class probA {
	public static void main(String[] Args) throws IOException {
		BufferedReader fin = new BufferedReader(new FileReader("A-small-attempt0.in"));
		PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("A.out")));
		
		StringTokenizer in = new StringTokenizer(fin.readLine());
		
		int T = Integer.parseInt(in.nextToken());
		
		for (int i = 0; i < T; i++) {
			in = new StringTokenizer(fin.readLine());
			int S = Integer.parseInt(in.nextToken());
			String aud = in.nextToken();
			
			int ans = 0, total = 0;
			for (int x = 0; x < aud.length(); x++) {
				if (total < x) {
					ans += x - total;
					total += x - total;
				}
				
				total += aud.charAt(x) - '0';
			}
			
			System.out.println(ans);
			
			fout.println("Case #" + (i+1) + ": " + ans);
		}
		
		fout.close();
	}
}
