package methodEmbedding.Cookie_Clicker_Alpha.S.LYD499;


import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

import com.google.codejam.converters.StringOfNumbers;
import com.google.codejam.io.IOHelper;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = IOHelper.createScanner(Main.class, args[0]);
		
		int numberOfTestCases = s.nextInt();
		String testCase = null;
		List<Double> testCaseL = null;
//		int defaultCookieRate = 2;
		double totalNumberOfSeconds = 0;
		double currentCookieRate = 2;
		double secondsToBuyFarm = 0;
		double secondsToFinish = 0;
		DecimalFormat df = new DecimalFormat("#.0000000");
		df.setRoundingMode(RoundingMode.HALF_UP);
		for (int i = 1; i <= numberOfTestCases;++i){
			totalNumberOfSeconds = 0;
			currentCookieRate = 2;
			secondsToBuyFarm = 0;
			secondsToFinish = 0;
			testCase = s.next();
			
			testCaseL = StringOfNumbers.toDoubleList(testCase, " ");
			
			if (testCaseL.get(2) < testCaseL.get(0)){
				System.out.println("Case #"+i+": "+df.format(testCaseL.get(2)/currentCookieRate));
			}else{
				while(true){
					secondsToFinish = testCaseL.get(2)/currentCookieRate;
					secondsToBuyFarm = testCaseL.get(0)/currentCookieRate;
					
					if (totalNumberOfSeconds + secondsToFinish <= totalNumberOfSeconds+secondsToBuyFarm+(testCaseL.get(2) / (currentCookieRate + testCaseL.get(1))) ){	
						System.out.println("Case #"+i+": "+df.format((totalNumberOfSeconds+secondsToFinish)));
						break;
					}

					currentCookieRate += testCaseL.get(1);
					
					totalNumberOfSeconds += secondsToBuyFarm;
				}
				
			}
		}
	}
}
