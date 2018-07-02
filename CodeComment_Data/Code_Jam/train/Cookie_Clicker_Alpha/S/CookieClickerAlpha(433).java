package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1477;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class CookieClickerAlpha {

	private static String inputFile = "input1.txt";
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File(inputFile));
		int numberOfTest = scanner.nextInt(); 
		
		for(int t = 1 ; t <= numberOfTest ; t++) {
			double cokkiesRate = 2.0;
			double C_FARMCOST = scanner.nextDouble();
			double F_COKKIES_PER_SEC = scanner.nextDouble();
			double X_TARGET = scanner.nextDouble();
			
			double consumedTime = 0.0;
			
			boolean keeprun = true;
			
			while(keeprun) {
				if((X_TARGET - C_FARMCOST)/(cokkiesRate) 
						< X_TARGET / (cokkiesRate + F_COKKIES_PER_SEC)){
					consumedTime = consumedTime + (X_TARGET/cokkiesRate);
					cokkiesRate+=F_COKKIES_PER_SEC;
					keeprun = false;
				}else {
					
					consumedTime = consumedTime + (C_FARMCOST/cokkiesRate);
					cokkiesRate+=F_COKKIES_PER_SEC;
				}
			}		
//			System.out.printf("%.7f",consumedTime);
//			System.out.println(String.format("%.7f", consumedTime));
			System.out.println("Case #"+t+": "+String.format("%.7f", consumedTime));
		}		
	}
}
