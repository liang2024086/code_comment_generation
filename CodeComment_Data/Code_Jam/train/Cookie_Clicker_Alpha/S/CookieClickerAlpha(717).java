package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1114;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CookieClickerAlpha {
	public static void main (String args[]) throws IOException {
		Scanner sc = new Scanner (new FileReader("B-small-attempt4.in"));
		PrintWriter pw = new PrintWriter (new FileWriter("output.txt"));
		int numTest = sc.nextInt();
		for (int z = 1; z <= numTest; z++) {
			double costFarm = sc.nextDouble();
			double cookiePerMin = sc.nextDouble();
			double goal = sc.nextDouble();
			double cookies = 2.0;
			double maxTime = goal/cookies;
			double time = costFarm/cookies;
			cookies = cookies +  cookiePerMin;
			while (time + goal/cookies < maxTime) {
				double cTime = time;
				cTime = cTime + costFarm/cookies;
				double nCookies = cookies +  cookiePerMin;
				if (cTime + goal/nCookies < time + goal/cookies) {
					time = cTime;
					cookies = nCookies;
				}
				else {
					break;
				}
			}
			double t = 0.0;
			if (time + goal/cookies < maxTime) {
				t = time + goal/cookies;
			}
			else {
				t = maxTime;
			}
			System.out.println(costFarm + " " + cookiePerMin + " " + goal);
			pw.printf("Case #%d: %.7f",z,t);
			if (z != numTest) {
				pw.println();
			}
			pw.flush();
		}
		pw.close();
	}
}
