package methodEmbedding.Cookie_Clicker_Alpha.S.LYD295;

import java.util.*;

public class b {
	static int MAXFARMS = 1000000;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int t=1; t<=T; t++) {
			double c = in.nextDouble();
			double f = in.nextDouble();
			double x = in.nextDouble();
			int curFarms = 0;
			double ans = 1e9;
			double time = 0;
			boolean done = false;
			while(!done || curFarms < MAXFARMS) {
				double tans = (x / (2 + f*curFarms)) + time;
				if(tans <= ans) ans = tans;
				else done = true;
				time += c / (2 + f*curFarms);
				curFarms++;
			}
			System.out.printf("Case #%d: %.7f%n", t, ans+1e-9);
		}
	}
}
