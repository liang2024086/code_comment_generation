package methodEmbedding.Cookie_Clicker_Alpha.S.LYD814;


import java.util.Scanner;

public class CookieClickerAlpha {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		int numberOfCases = scanner.nextInt();
		
		for (int c = 0; c < numberOfCases; c++) {
			double C = scanner.nextDouble();
			double F = scanner.nextDouble();
			double X = scanner.nextDouble();
			
			double time = X/2;
			for (int N = 1; ; N++) {
				double timeCost = C/(2+F*(N-1));
				double timeSaved = X/(2+F*(N-1)) - X/(2+F*N);
				
				if (timeCost < timeSaved) {
					time = time + timeCost - timeSaved;
				} else {
					break;
				}
			}
			
			System.out.printf("Case #%d: %.7f\n", c+1, time);
		}
	}

}
