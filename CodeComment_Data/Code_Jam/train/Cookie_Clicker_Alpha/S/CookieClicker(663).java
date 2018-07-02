package methodEmbedding.Cookie_Clicker_Alpha.S.LYD723;

import java.io.BufferedInputStream;
import java.util.Scanner;


public class CookieClicker {
	public static void main(String[] args) {
		
		//read in input
		Scanner scanner = new Scanner(new BufferedInputStream(System.in));
		int n = scanner.nextInt();
		
		for (int i = 0; i < n; i++) {
			double cost = scanner.nextDouble();
			double rate = scanner.nextDouble();
			double goal = scanner.nextDouble();
			boolean finished = false;
			double time = 0;
			double income = 2;
			while (!finished) {
				if (goal/income > (cost/income + goal/(income + rate))) {
					time += cost/income;
					income += rate;
				}
				else {
					time += goal/income;
					finished = true;
				}
			}
			System.out.println("Case #" + (i+1) + ": "+ time);
		}
	}
}
