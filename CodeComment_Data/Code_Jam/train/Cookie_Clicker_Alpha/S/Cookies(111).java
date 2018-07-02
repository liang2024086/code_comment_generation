package methodEmbedding.Cookie_Clicker_Alpha.S.LYD203;

import java.util.Scanner;


public class Cookies {
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		int numberOfCases = input.nextInt();
		double farmCost = 0;
		double farmOutput = 0;
		double goal = 0;
		double cookiesPerSecond;
		double runningTime;
		
		for(int i = 0; i < numberOfCases; i++){
			cookiesPerSecond = 2;
			runningTime = 0;
			
			farmCost = input.nextDouble();
			farmOutput = input.nextDouble();
			goal = input.nextDouble();
			
			if(goal <= farmCost){
				System.out.println("Case #" + (i + 1) + ": " + (goal/cookiesPerSecond));
				continue;
			}
			
			while((goal/cookiesPerSecond) > (farmCost/cookiesPerSecond) + (goal/(cookiesPerSecond + farmOutput))){
				runningTime += farmCost/cookiesPerSecond;
				cookiesPerSecond += farmOutput;
			}
			
			runningTime += goal/cookiesPerSecond;
			
			System.out.println("Case #" + (i + 1) + ": " + runningTime);
			
		}
		
		input.close();
	}

}
