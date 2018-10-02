package methodEmbedding.Cookie_Clicker_Alpha.S.LYD685;

import java.util.Locale;
import java.util.Scanner;

public class Problem2 {

	public Problem2()  {
	//	Scanner in = new Scanner(new File("B-small-attempt0.in"));
		 Scanner in = new Scanner(System.in);
		
	// PrintWriter out = new PrintWriter("B-small-attempt0.out");
		
		in.useLocale(Locale.US);
		int T = in.nextInt();

		for (int i = 1; i <= T; i++) {
			double C = in.nextDouble();
			double F = in.nextDouble();
			double X = in.nextDouble();

			if (X < C) {
				String result = String.format("%.6f", X / 2).replace(',', '.');
				System.out.println("Case #" + i + ": " + result);
				continue;
			}

			double cookiesPS = 2;
			double time = 0;
			double _min = X / cookiesPS;
			int a = 0;
			while (true) {
				
				time += (C / cookiesPS);
				cookiesPS += F;
				
				if (time + (X / cookiesPS) > _min){
					a++;
					if(a == 1000)
						break;
				}else{
					_min = time + (X / cookiesPS);
				}

				
			}
			String result = String.format("%.7f", _min).replace(',', '.');
			System.out.println("Case #" + i + ": " + result);
		}

		in.close();
	}

	public static void main(String[] args) {
		new Problem2();
	}

}
