package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1324;


import java.util.Scanner;

public class B_Cookie_Clicker_Alpha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();		/* number of testcases */

		for (int testcase = 0; testcase < T; testcase++) {
			double C = sc.nextDouble();			/* cost of cookie farm */
			double F = sc.nextDouble();			/* extra F cookies per farm */
			double X = sc.nextDouble();			/* target number of cookies */

			double time = 0;
			double rate = 2;
			double current_cookies = 0;
			boolean done = false;

			if(X <= C) {
				time = X / rate;
				done = true;
			}
			if(!done) {
				current_cookies = C;
				time = C / rate;
			}

			while(!done && ((X-current_cookies+C) / (rate+F) < (X - current_cookies)/rate)) {	/* check if buying a farm reduces total time to reach X */
				current_cookies -= C;
				rate += F;

				if(current_cookies < C) {
					time += ((C - current_cookies) / rate);
					current_cookies = C;
				}
			}

			if(!done && (current_cookies < X))
				time += (X - current_cookies)/rate;

			System.out.print("Case #" + (1 + testcase) + ": ");
			System.out.printf("%.7f\n", time);
		}
	}
}

