package methodEmbedding.Cookie_Clicker_Alpha.S.LYD41;

import java.util.Scanner;


public class Cookie {

	
	
	public static void main(String[] args){
		
		
		Scanner scanner = new Scanner(System.in);
		
		int numTestCases = Integer.parseInt(scanner.nextLine().trim());
		
		for(int count = 1; count<=numTestCases; count++){
				
		String[] options = scanner.nextLine().split(" ");
		
		double costFarm = Double.parseDouble(options[0]);
		double additionalRate = Double.parseDouble(options[1]);
		double numCookiesWin = Double.parseDouble(options[2]);

		double cookies = 0.0;
		double currentRate = 2;
		double seconds = 0.0;
		
		while(cookies < numCookiesWin){
			
						
			double secondsToFarm = costFarm/currentRate;

			
			
			
			//Decide if buy farm
						
			double timeNoBuy = (numCookiesWin-costFarm)/currentRate;
			double timeIfBuy = numCookiesWin/(currentRate+additionalRate);
			
			
			if(timeIfBuy >  timeNoBuy){ //DONT BUY
				
				if(cookies +currentRate*secondsToFarm > numCookiesWin){
					
					double difference = numCookiesWin - cookies; //10
					double ratio = costFarm/difference;
					
					seconds+= secondsToFarm/ratio;
					cookies+= difference;
					
					
				}
				
				else{
					cookies += currentRate*secondsToFarm;
					seconds +=secondsToFarm;
				}
				
			}else{ //BUY
				
				
				if(cookies +currentRate*secondsToFarm > numCookiesWin){
					
					double difference = numCookiesWin - cookies; //10
					double ratio = costFarm/difference;
					
					seconds+= secondsToFarm/ratio;
					cookies+= difference;
					
					
				}else{
				
					currentRate += additionalRate;
					seconds +=secondsToFarm;
				}
				
			}
			
			
		
			
			
		}
		
		System.out.println("Case #"+ count + ": "+seconds);
		
		
		
		
		
		
		
	} // TEST CASES
	
	
	} // END MAIN
		
	
}
