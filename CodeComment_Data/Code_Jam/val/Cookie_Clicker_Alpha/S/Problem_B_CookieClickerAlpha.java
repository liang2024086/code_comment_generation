package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1544;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.annotation.Retention;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Problem_B_CookieClickerAlpha {
	public static void main(String[] args) throws Exception {
		BufferedReader k = new BufferedReader(new FileReader(new File("B.txt")));
		// Scanner k = new Scanner(new File("B.txt"));
		 
		 PrintWriter out = new PrintWriter(new FileWriter("resB.out"));
		 
		 int t = Integer.parseInt(k.readLine());
		 StringTokenizer s;
		for (int i = 1; i <= t; i++) {
			s = new StringTokenizer(k.readLine());
			double c = Double.parseDouble(s.nextToken());
			double f = Double.parseDouble(s.nextToken());
			double x = Double.parseDouble(s.nextToken());
			
			double ans = Double.MAX_VALUE, sofar=0.0;
			
//			int it = (int)Math.ceil(c/4.0)+20;
			double res1,res2;
			double rate = 2.0;
			while (true) {
				res1 = c/rate;
				if(Double.compare(res1, 1e-4)<=0)
					break;
				res2 = x/rate + sofar;
				ans = Math.min(ans, res2);
				sofar += res1;
				rate+=f;
			}
			out.printf("Case #%d: %.7f\n",i,ans);
			
		}
		out.close();
	}
}
