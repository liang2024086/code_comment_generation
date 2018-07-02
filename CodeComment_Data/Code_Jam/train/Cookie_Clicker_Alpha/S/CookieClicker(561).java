package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1146;

import java.io.*;
import java.util.*;
import static java.lang.Math.*;

public class CookieClicker {

	static final String SRC = "B-small-attempt0.in";

	public static void main (String[] args) throws IOException {
		Scanner sc = new Scanner(new File(SRC));
		PrintWriter out = new PrintWriter(SRC + ".out");

		int m = sc.nextInt();

		for (int q = 1; q <= m; q++) {
			double costPerFarm = sc.nextDouble();
			double speedup = sc.nextDouble();
			double goal = sc.nextDouble();

			//System.out.println(costPerFarm + " " + speedup + " " + goal);

			double speed = 2;
			double money = 0;
			double t = 0;

			double bestTime = Double.MAX_VALUE;

			for (int speedups = 0; t < bestTime; speedups++) {
				//System.out.println(t + " " + money);
				double goalTime = t + (goal-money)/speed;
				bestTime = min(bestTime, goalTime);

				double dt = costPerFarm/speed;
				t += dt;
				money -= costPerFarm;
				money += dt*speed;

				speed += speedup;
			}

			out.printf("Case #%d: %.7f\n", q, bestTime);
		}

		out.close();
	}
}
