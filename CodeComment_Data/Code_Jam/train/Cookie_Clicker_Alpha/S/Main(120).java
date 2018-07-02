package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1633;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int iter = input.nextInt();
		for  (int i = 1; i <= iter; i++ ){
			double C = input.nextDouble();
			double F = input.nextDouble();
			double X = input.nextDouble();
			boolean done = false;
			double time = 0;
			double rate = 2;
			while(!done) {
				time += C/rate;
				double noBuy = ((X-C)/rate) + time;
				double buy = X/(rate+F) + time;
				if (noBuy <= buy) {
					time = noBuy;
					done = true;
				} else {
					rate += F;
				}
			}
			System.out.println("Case #" + i + ": " + time);
		}
	}
}
