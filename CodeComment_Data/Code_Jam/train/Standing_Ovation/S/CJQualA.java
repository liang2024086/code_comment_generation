package methodEmbedding.Standing_Ovation.S.LYD934;

import java.io.*;
import java.util.*;


public class CJQualA {
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("A-small-attempt1.in"));
		PrintWriter out  = new PrintWriter(new File("QualAout.txt"));
		int T = Integer.parseInt(in.readLine());
		for(int a = 1; a < T+1; a++){
			String[] NL = in.readLine().split(" ");
			int N = Integer.parseInt(NL[0]);
			String[] L = NL[1].split("");
			System.out.println(N);
			System.out.println(Arrays.toString(L));
			int need = 0;
			int count = 0;
			for (int i = 0; i < N+1; i++){
				int cur = Integer.parseInt(L[i]);
				if (cur > 0 && count < i) {
					need += i-count;
					count += need;
				}
				count += cur;
			}
			out.println("Case #"+a+": "+need);
		}
		in.close();
		out.close();
	}
	
}
