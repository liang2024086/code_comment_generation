package methodEmbedding.Standing_Ovation.S.LYD1922;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;


public class A {
	public static void main (String[] args) throws Exception {
		Scanner sc = new Scanner(new File("A-small-attempt0.in"));
		PrintWriter writer = new PrintWriter("A-small-attempt0.out.txt", "UTF-8");
//		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int t = 1; t <= T; ++t) {
			int Smax = sc.nextInt();
			String S = sc.next();
			
			int sum = 0;
			int add = 0;
			for (int i = 0; i < S.length(); ++i) {
				int s = ((int)S.charAt(i)) - 48;
				add += (s == 0 ? 0 : Math.max(i - sum, 0));
				sum += (add + s);
			}
//			System.out.println("Case #" + t + ": " + add);
			writer.println("Case #" + t + ": " + add);
		}
		writer.close();
	}
	

}
