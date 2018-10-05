package methodEmbedding.Standing_Ovation.S.LYD1379;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;


public class ProblemA {
	public static void main(String args[]) throws Exception { 
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		//Scanner in = new Scanner(new File("input.txt"));
		//PrintWriter out = new PrintWriter("output.txt");
		int t = in.nextInt();
		
		for (int i=0;i<t;i++) {
			int ans = 0;
			int s = in.nextInt();
			String av = in.next();
			int cnt = (int)(av.charAt(0) - '0');
			for (int j=1;j<av.length();j++) {
				
				int kol = (int)(av.charAt(j) - '0');
				if (cnt<j) {
					ans+=(j - cnt);
					cnt = j;
				}
				
				cnt+=kol;
			}
			out.println("Case #"+(i+1)+": "+ans);
		}
		
		in.close();
		out.close();
	}
}
