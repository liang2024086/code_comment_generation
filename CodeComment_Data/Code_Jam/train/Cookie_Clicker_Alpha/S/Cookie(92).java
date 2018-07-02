package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1497;

import java.util.*;

class Cookie {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; ++t) {
			double C = sc.nextDouble();
			double F = sc.nextDouble();
			double X = sc.nextDouble();
			double R = 2.0;
			double time = 0.0;
			
			while(true) {
				double t1 = X/R;
				double t2 = C/R + X/(R+F);
				if (t1 > t2) {
					time += C/R;
					R += F;
				}
				else {
					time += X/R;
					break;
				}
			}
			
			System.out.printf("Case #%d: %.7f\n", t, time);
		}
	}
}
