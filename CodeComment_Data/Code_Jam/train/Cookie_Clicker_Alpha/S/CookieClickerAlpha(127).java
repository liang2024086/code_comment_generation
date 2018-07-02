package methodEmbedding.Cookie_Clicker_Alpha.S.LYD561;

import java.text.DecimalFormat;
import java.util.Scanner;


public class CookieClickerAlpha {

	private static final Scanner sc = new Scanner(System.in);	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int T = sc.nextInt();
		
		for (int i = 0; i < T; i++){
			
			double C = sc.nextDouble();
			double F = sc.nextDouble();
			double X = sc.nextDouble();
			
			
			double cookiesPerSec = 2;
			double totalTime = 0;
			
			while (true){
				
				if (X/cookiesPerSec <= C/cookiesPerSec){
					totalTime += X/cookiesPerSec;
					break;
				}else if (totalTime + X/cookiesPerSec <= totalTime + C/cookiesPerSec + X/(cookiesPerSec + F)){
					
					totalTime += X/cookiesPerSec;
					break;
				}
				else{
						
					totalTime += C/cookiesPerSec;
					cookiesPerSec += F;
					
				}
				
			}
			
			DecimalFormat df = new DecimalFormat("0.0000000");
			totalTime = Double.parseDouble(df.format(totalTime));
			
			System.out.println("Case #" + (i + 1) + ": " + totalTime);
			
			
			
		}
			
	}

}
