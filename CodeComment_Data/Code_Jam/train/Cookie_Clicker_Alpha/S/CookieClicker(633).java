package methodEmbedding.Cookie_Clicker_Alpha.S.LYD96;

import java.text.DecimalFormat;
import java.util.Scanner;


public class CookieClicker {

	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		
		int testCases = scanner.nextInt();
		
		String output = "";
		
		DecimalFormat format = new DecimalFormat("#.0000000");
		
		for( int i =1; i<= testCases; i++){
			
			double c = scanner.nextDouble();
			double f = scanner.nextDouble();
			double x  = scanner.nextDouble();
			
			double r = 2;

			double timeline = 0d;

			while( true ){

				double targetAtCurrentRate = timeline + x/r;

				double timeTakenAfterBuyingfarm = 0d;

				double targetAfterBuyingFarm = 0;

				timeTakenAfterBuyingfarm = timeline + c/r;

				targetAfterBuyingFarm = timeTakenAfterBuyingfarm + (x/ (r+f) );

				if( targetAtCurrentRate <= targetAfterBuyingFarm ){
					timeline = targetAtCurrentRate;
					break;
				}else{
					timeline = timeTakenAfterBuyingfarm;
					r+= f;
				}
			}

			double timeToAwesomeness = (Math.round(timeline * 10000000.0d) / 10000000.0d);
			output += "Case #"+i+": "+format.format(timeToAwesomeness)+"\n";
		}
		scanner.close();
		System.out.print(output);
	}
}
