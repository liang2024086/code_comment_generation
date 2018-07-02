package methodEmbedding.Standing_Ovation.S.LYD1589;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * @author: Ahmed Othman
 * @codeJame: AMedOs
 * @email :amedhat.cs@gmail.com
 * */
public class A {

	public static void main(String[] args) throws Exception  {
		
		int T;
		int tc = 0;
		
		// Input file
		String in = "A-small-attempt0.in";
		//String in = "A.in";
		FileInputStream fin = new FileInputStream(in);
		Scanner scn = new Scanner(fin);
		
		// Output file
		String out = "A.out";
		FileOutputStream fout = new FileOutputStream (out);
		PrintStream ps = new PrintStream(fout);
		
		 
		T = scn.nextInt();
		
		for (tc=1 ; tc <= T ; tc++) {
			int l = scn.nextInt();
			
			String str = scn.next();
			
			int[] shy = new int[l+1];
			for (int i =0; i <= l; i ++) {
				shy[i] = str.charAt(i) - '0';
			}
			
			int sum = shy[0];
			int res = 0;
			for (int i =1; i <= l; i++) {
				if (i > sum) {
					res += i-sum;
					sum += i-sum + shy[i];
				} else {
					sum += shy[i];
				}
			}
			
			ps.println("Case #" + tc + ": " + res);
			System.out.println("-----=-=-=-=-=-=--=");
		}
		
		fout.close();
		scn.close();
		fin.close();
		System.out.println("Done:.......");
		System.exit(0);
	}
}
