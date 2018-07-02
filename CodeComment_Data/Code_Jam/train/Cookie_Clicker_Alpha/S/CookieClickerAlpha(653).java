package methodEmbedding.Cookie_Clicker_Alpha.S.LYD194;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class CookieClickerAlpha {
	public static void main(String[]Args) throws FileNotFoundException{
		Scanner sc = new Scanner(new File("B-small-attempt0 (1).in"));
		PrintWriter out = new PrintWriter(new File("things.out"));
//		Scanner sc = new Scanner(System.in);
		boolean[] things = new boolean[16];
		int t = sc.nextInt(),cc=0;
		while(t-->0){
			double C = sc.nextDouble();
			double F = sc.nextDouble();
			double X = sc.nextDouble();
			double ans = X / 2;
			double curTime = 0;
			int numFarm = 0;
			while(curTime < ans){
				double deltaTime = C / (F * numFarm + 2.0);
				curTime += deltaTime;
				numFarm++;
				double newTime = curTime + X / (F * numFarm + 2.0);
				ans = Math.min(ans, newTime);
			}
			out.printf("Case #%d: %.07f%n",++cc, ans);
		}
		out.close();
	}
}
