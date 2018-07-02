package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1275;

import java.util.Scanner;

public class Cookie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double c, f, x, r;
		int t, i;
		double t1, t2;
		Scanner in = new Scanner(System.in);
		t = in.nextInt();
		double re[] = new double[t];
		for (i = 0; i < t; ++i) {
			c = in.nextDouble();
			f = in.nextDouble();
			x = in.nextDouble();
			r = 2.0 ;
			while (true) {
				t1 = x / r;
				t2 = c / r;
				r = f + r;
				t2 += x / r;
				if (t1 < t2) {
					re[i] += t1;
					break;
				} else {
					t2 = c / (r-f);
					re[i] += t2;
				}
			}
		}
		for (i = 0; i < t; ++i)
			System.out.printf("Case #" + (i + 1) + ": "+"%.7f\n",re[i]);
		in.close();
	}

}
