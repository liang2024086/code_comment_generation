package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1167;

import java.util.Scanner;

public class CookieClicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		double[] results = new double[testCases];

		for (int i = 0; i < testCases; i++) {

			double C = scanner.nextDouble();
			double F = scanner.nextDouble();
			double X = scanner.nextDouble();
			double G = 2.0;
			double time = 0.0;
			boolean run = true;

			while (run) {
				double secondsForFarm = C / G;
				if (X / G > (secondsForFarm + (X / (G + F)))) {
					time += secondsForFarm;
					G += F;
				}else{
					time += X / G;
					run = false;
				}
			}
			
			results[i] = time;

		}
		
		System.out.println();
		for(int i=0; i<testCases;i++){
			System.out.printf("Case #%d: %.7f\n", (i+1),results[i]);
		}
	}
}
