package methodEmbedding.Cookie_Clicker_Alpha.S.LYD98;

import java.util.Scanner;

/**
 * Created by Kevin_2 on 4/12/14.
 */
public class QualificationB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());

		for (int i = 1; i <= N; i++) {
			String[] input = sc.nextLine().split("\\s");
			double C = Double.parseDouble(input[0]),    // Cost of cookie farm
				F = Double.parseDouble(input[1]),       // Additional cookies per second for farm
				X = Double.parseDouble(input[2]);       // Cookie goal

			double bal = 0.0;   // current number of cookies
			double time = 0.0;  // current time elapsed
			double cps = 2.0;   // current cookies per second

			// loop every time we want to buy a cookie farm
			while (true) {
				// Get to the point where we can buy a cookie farm

				// bal == 0

				// if we win before we buy a new cookie farm
				// then break
				if (X < C)
					break;

				time += (C - bal) / cps;
				bal = C;

				// Consider two possibilities:
				//   Time to finish with a new cookie farm
				//   Time to finish without a new cookie farm

				// bal == C

				double ttf_current = (X - bal) / cps;
				double ttf_new = (X) / (cps + F);

				if (ttf_new < ttf_current) { // buy a farm
					bal = 0; // (subtract C)
					cps += F;
				}
				else { // dont buy no farm anymore
					break;
				}
			}

			// buy cookies until we win
			time += (X - bal) / cps;
			bal = X; // add (X - bal)

			System.out.println("Case #" + i + ": " + String.format("%.7f", time));
		}

		sc.close();
	}
}
