package methodEmbedding.Cookie_Clicker_Alpha.S.LYD520;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;


public class Minesweeper {
	public static void main(String [] args) throws NumberFormatException, IOException{
		BufferedReader reader = new BufferedReader(new FileReader(new File("B-small.in")));
		PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
		DecimalFormat d = new DecimalFormat("#.0000000");
		
		int testCases = Integer.parseInt(reader.readLine());
		
		double previousTotalTime,previousFarmTime,previousRate;
		double currentTotalTime,currentRate,currentCookies,currentFarmTime;
		double farmCost, rateIncrease,goal;
		int count = 0;


		for(int x = 0;x < testCases;x++){
			count++;
			String [] params = reader.readLine().split("\\s+");

			previousTotalTime = Double.MAX_VALUE;
			previousFarmTime = 0.0;
			currentTotalTime = 0.0;
			currentRate = 2.0;

			farmCost = Double.parseDouble(params[0]);
			rateIncrease = Double.parseDouble(params[1]);
			goal = Double.parseDouble(params[2]);

			previousFarmTime = 0.0;
			previousTotalTime = goal / currentRate;
			double first = previousTotalTime;
			double tempValue = previousTotalTime;
			do{
				previousTotalTime = tempValue;
				
				currentFarmTime = previousFarmTime + ((farmCost)/(currentRate));
				currentRate += rateIncrease;
				currentTotalTime = currentFarmTime + (goal / currentRate);
				
				tempValue = currentTotalTime;
				previousFarmTime = currentFarmTime;

			}while(currentTotalTime <= previousTotalTime);

			if(previousTotalTime == first){
				writer.println("Case #" + (x+1) + ": " + d.format(first));
				
			}
			else{
				writer.println("Case #" + (x+1) + ": " + d.format(previousTotalTime));
			}

			
		}
		reader.close();
		writer.close();
	}
}
