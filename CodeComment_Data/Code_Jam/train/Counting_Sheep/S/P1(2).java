package methodEmbedding.Counting_Sheep.S.LYD474;

import java.io.*;
import java.util.*;

public class P1 {
	
	public static void main(String [] args) throws Exception {
		BufferedReader in = new BufferedReader(new FileReader("/Users/andykong/Downloads/gcj2016/p1.small.in"));
		PrintWriter out = new PrintWriter(new FileWriter("/Users/andykong/Downloads/gcj2016/p1.small.out"));
		int T = Integer.parseInt(in.readLine());
		for(int cc = 1; cc <= T; cc++) {
			int N = Integer.parseInt(in.readLine());
			if(N == 0)
				out.printf("Case #%d: INSOMNIA\n",cc);
			else {
				boolean [] seen = new boolean[10];
				int k = 1;
				while(true) {
					int v = N*k;
					while(v > 0) {
						seen[v % 10] = true;
						v /= 10;
					}
					boolean allseen = true;
					for(int i = 0; i < seen.length && allseen; i++)
						allseen = allseen && seen[i];
					if(allseen)
						break;
					k++;
				}
				out.printf("Case #%d: %d\n",cc,k*N);
			}
		}
		in.close();
		out.close();
	}
}
