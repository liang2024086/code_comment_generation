package methodEmbedding.Cookie_Clicker_Alpha.S.LYD462;

import java.util.Scanner;


public class Question2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfTestCases = scanner.nextInt();
		
		for (int i = 0; i < numberOfTestCases; i++) {
			double C = scanner.nextDouble();
			double F = scanner.nextDouble();
			double X = scanner.nextDouble();
			double productionRate = 2.0;
			double previouslyWaited = 0.0;
			
			while (true) {
				double waitPeriod = X / productionRate;
				double buyAndWait = (C / productionRate) + (X / (productionRate + F));
				if (waitPeriod <= buyAndWait) {
					previouslyWaited += waitPeriod;
					break;
				}
				else {
					previouslyWaited += (C / productionRate);
					productionRate += F;
				}
			}
			
			System.out.print("Case #" + (i + 1) + ": ");
			System.out.printf("%.7f", previouslyWaited);
			System.out.println();
		}

	}

}
