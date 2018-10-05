package methodEmbedding.Cookie_Clicker_Alpha.S.LYD7;

import java.util.*;
import java.lang.Double;

public class Problem2{

	public static void main(String[] args){
	
		double c = 0.0, f = 0.0, x = 0.0;	
		
		double currentRate;
		double bestTime;
		double tempTime = 0.0;
		double tempBestTime = 0.0;
		
		Scanner sc = new Scanner(System.in);
		
		int numCases = sc.nextInt();
		
		for (int n = 0; n < numCases; n++){
		
			c = sc.nextDouble();
			f = sc.nextDouble();
			x = sc.nextDouble();
			
			currentRate = 2.0;
			bestTime = x / currentRate;
			
			for (int i = 0; ; i++){
			
				tempTime += (c / currentRate);
				
				//Update new rate.
				currentRate += f;
				
				tempBestTime = tempTime + (x / currentRate);
				
				if (tempBestTime < bestTime){
				
					bestTime = tempBestTime;
				} else {
				
					break;
				}
				
			}
			
			tempTime = 0.0;
			bestTime = Math.round(bestTime * 10000000.0) / 10000000.0;
			System.out.println("Case #" + (n + 1) + ": " + bestTime);
		}
	}
}
