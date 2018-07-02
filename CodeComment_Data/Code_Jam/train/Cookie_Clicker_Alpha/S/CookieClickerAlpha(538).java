package methodEmbedding.Cookie_Clicker_Alpha.S.LYD475;

import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class CookieClickerAlpha {
	
	public static void main(String[] args) throws Exception{
		
		File file = new File("C:/Users/Rishabh/workspace/GoogleCodeJam/src/input.txt");
		Scanner scanner = new Scanner(file);
		int numberCases = Integer.parseInt(scanner.next());
		
		double cookieProduction = 2;
		
		int counter = 0;
		
		while(counter < numberCases){
			
			cookieProduction = 2.0;
			double time = 0.0;
		
			double costOfFarm = Double.parseDouble(scanner.next());
//			System.out.print("Cost of farm: ");
//			System.out.println(costOfFarm);
			
			double increase = Double.parseDouble(scanner.next());
//			System.out.print("Increase: ");
//			System.out.println(increase);
			
			double target = Double.parseDouble(scanner.next());
//			System.out.print("Target: ");
//			System.out.println(target);
			
			if(target < costOfFarm){
				time += (target/cookieProduction);
				
				System.out.println("Case #" + (counter + 1) + ": " + Math.round(time * 10000000.0)/10000000.0);
			}
			
			else{
				double threshold = ((target*increase)/costOfFarm) - increase;
				
				//System.out.println("Threashold = " + threshold);
				//System.out.println("Cookie Production = " + cookieProduction);
				
				while(cookieProduction < threshold){
					time += costOfFarm/cookieProduction;
					
					cookieProduction += increase;
				}
				
				//System.out.println("Time = " + time);
				//System.out.println("CookieProduction = " + cookieProduction);
							
				time += target/cookieProduction;
				
				System.out.println("Case #" + (counter + 1) + ": " + Math.round(time * 10000000.0)/10000000.0);
			}
						
			counter++;
		}
	}

}
