package methodEmbedding.Cookie_Clicker_Alpha.S.LYD742;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CookieClickerAlpha {
	public static final double RATE = 2.0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfRounds = sc.nextInt();
		DecimalFormat df = new DecimalFormat("0.0000000");
		
		for(int i = 0; i < numberOfRounds; i++){
			double costOfFactory = sc.nextDouble();
			double rateOfFactory = sc.nextDouble();
			double target = sc.nextDouble();
			
			double timePrevious = target/RATE; 
			double additionalTerm = target/(RATE + rateOfFactory);
			double timeNow = costOfFactory/RATE + additionalTerm;
			int count = 1;
			
			while(timePrevious > timeNow ){
				count++;
				timePrevious = timeNow;
				timeNow = timeNow - additionalTerm + costOfFactory/(RATE + rateOfFactory * (count-1)) + target/(RATE + rateOfFactory * count);
				additionalTerm = target/(RATE + rateOfFactory * count);
				
			}
			
			System.out.println("Case #"+i+": "+df.format(timePrevious));
		}
	}

}
