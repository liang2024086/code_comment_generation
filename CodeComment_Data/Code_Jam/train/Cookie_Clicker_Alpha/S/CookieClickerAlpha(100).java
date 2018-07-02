package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1504;

import java.util.Scanner;


public class CookieClickerAlpha {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt(); in.nextLine();
		
		for (int i = 0; i < T; i++) {
			double factory = in.nextDouble();
			double increment = in.nextDouble();
			double total = in.nextDouble();			
			in.nextLine();
			
			if (factory >= total) {
				double time = total / 2;
				System.out.println("Case #" + (i + 1) + ": " + time);
			} else {
				double time = 0;
				
				for (double rate = 2; true; rate += increment) {
					double timeToTotalNotBuying = total / rate;
					double timeToTotalBuying = factory / rate + total / (rate + increment);
					
					if (timeToTotalNotBuying <= timeToTotalBuying) {
						time += timeToTotalNotBuying;
						break;
					} else {
						time += factory / rate;
					}
				}
				
				System.out.println("Case #" + (i + 1) + ": " + time);	
			}			
		}
		
		in.close();
	}

}
