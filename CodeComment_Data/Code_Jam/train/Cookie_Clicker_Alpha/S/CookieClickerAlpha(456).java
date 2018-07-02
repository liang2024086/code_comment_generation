package methodEmbedding.Cookie_Clicker_Alpha.S.LYD91;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;


public class CookieClickerAlpha {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("B-small-attempt0.in"));
		System.setOut(new PrintStream(new File("B-small-attempt0.out")));
		int t = in.nextInt();
		int cases = 0;
		while(t-->0){
			cases++;
			double c = in.nextDouble();
			double ff = in.nextDouble();
			double x = in.nextDouble();
			double f = 2.0;
			double res = x/f;
			double curr = 0;
			while(curr<res&&(c<x)){
				curr += c/f;
				res = Math.min(curr+((x-c)/f), res);
				f+=ff;
			}
			System.out.printf("Case #%d: %.7f\n",cases,res);
		}
		in.close();
	}

}
