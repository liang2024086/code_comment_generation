package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1132;

import java.util.Scanner;


public class CookieClickerAlpha {

	public static void main(String[] args) {
		double T, C, F, X;
		Scanner sc = new Scanner(System.in);
		
		T = sc.nextInt();
		for (int CASES = 0; CASES < T; CASES++){
			C = sc.nextDouble();
			F  = sc.nextDouble();
			X = sc.nextDouble();
			
			if (X < C){
				System.out.printf("Case #%d: %f%n",CASES+1, X/2.0);
			} else{
				double[] numberOfFarms = new double[2000];
				numberOfFarms[0] = 0;

				for (int i = 1; i < numberOfFarms.length; i++){
					numberOfFarms[i] = numberOfFarms[i-1] + (C/(2.0+(i-1)*F));
				}
				
				double min = Double.MAX_VALUE;
				double time;
				for (int i = 0; i <numberOfFarms.length; i++){
					time = numberOfFarms[i] + (X/(2.0+(i*F)));
					if (time < min){
						min = time;
					}
				}
				
				System.out.printf("Case #%d: %f%n", CASES+1, min);
			}
			
		}
		sc.close();
	}
	
}
