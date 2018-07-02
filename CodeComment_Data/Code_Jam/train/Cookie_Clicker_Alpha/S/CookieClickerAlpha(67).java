package methodEmbedding.Cookie_Clicker_Alpha.S.LYD949;

import java.util.*;
import java.io.*;
public class CookieClickerAlpha {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("src\\B-small-attempt0.in"));
		PrintWriter pw = new PrintWriter(new FileWriter("src\\B-small2.out"));
		int T = scan.nextInt();
		for(int N=0; N<T; N++) {
			double c = scan.nextDouble();
			double f = scan.nextDouble();
			double x = scan.nextDouble();
			double curRate = 2;
			double newRate=2;
			double curTime=0, buyTime=0; 
			double newTime=0, ans=0;
			while(true) {
				curTime = buyTime +(x/curRate);
				buyTime += c/curRate;
				newRate += f;
				newTime = buyTime + (x/newRate);
				curRate = newRate;
				if((curTime<newTime)) {
					ans = curTime;
					break;
				}

			}
			pw.printf("Case #%d: %.7f\n", N+1,ans);
		}
		pw.close();
		scan.close();
	}
}
