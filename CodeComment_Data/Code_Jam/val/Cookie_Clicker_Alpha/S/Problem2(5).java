package methodEmbedding.Cookie_Clicker_Alpha.S.LYD807;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Problem2 {

	public static void main(String[] args) {
		
		BufferedReader reader = null;
		
		try {
			reader = new BufferedReader(new FileReader("B-small-attempt0.in"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		String line = null;
		int lineCount = 1;
		
		int totalNumberOfTestCases = 0;
		int numberOfTestCase = 0;
		
		try {
			while ((line = reader.readLine()) != null) {					
			    if (lineCount == 1){
			    	totalNumberOfTestCases = Integer.parseInt(line);
			    } else {
			    	numberOfTestCase++;
			    	
			    	if (numberOfTestCase > totalNumberOfTestCases){
			    		break;
			    	}			
			    	
					double timeUsedInSeconds = 0;
					double cookiesProducingSpeed = 2;
			    	
			    	String[] testCaseComponents = line.split(" ");
			    	double farmPrice = Double.parseDouble(testCaseComponents[0]);
			    	double increment = Double.parseDouble(testCaseComponents[1]);
			    	double target = Double.parseDouble(testCaseComponents[2]); 
			    	double remainingCookiesToProduce = target;
			    	double currentProducedCookies = 0;
			    	
			    	while(true) {
			    		double timeUsedIfNotBuildFarm = remainingCookiesToProduce / cookiesProducingSpeed;
			    		double timeUsedToBuldFarm = (farmPrice - currentProducedCookies) / cookiesProducingSpeed; 
			    		double timeUsedIfBuildFarm = remainingCookiesToProduce / (cookiesProducingSpeed + increment) + 
				    			timeUsedToBuldFarm;
				    	
				    	if (timeUsedIfNotBuildFarm <= timeUsedIfBuildFarm){
				    		timeUsedInSeconds += timeUsedIfNotBuildFarm;
				    		System.out.println("Case #" + numberOfTestCase + ": " + String.format("%.7f", timeUsedInSeconds));
				    		break;
				    	} else {
				    		cookiesProducingSpeed += increment;
				    		timeUsedInSeconds += timeUsedToBuldFarm;
				    	}
			    	}
			    }
			    
			    lineCount++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
