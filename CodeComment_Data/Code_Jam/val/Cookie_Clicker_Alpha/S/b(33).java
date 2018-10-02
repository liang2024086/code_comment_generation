package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1426;

import java.util.*;

public class b {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		int numCases = stdin.nextInt();

		for (int loop=1; loop<=numCases; loop++) {

			double C = stdin.nextDouble();
			double F = stdin.nextDouble();
			double X = stdin.nextDouble();

			double[] sum = new double[1000000];
			sum[0] = 0;
			double den = 2;
			double best = X/2;
			for (int i=1; i<1000000; i++) {
				sum[i] = sum[i-1] + C/(2+(i-1)*F);
				double cur = sum[i] + X/(2+i*F);
				if (cur < best)
					best = cur;
			}
			System.out.println("Case #"+loop+": "+best);
		}

	}
}
