package methodEmbedding.Cookie_Clicker_Alpha.S.LYD329;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;


public class CookieClickerAlpha {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		DecimalFormat df = new DecimalFormat("#.#######");
		int numCases;
		final int BASE_RATE = 2;
		
		double farmCost;
		double farmRate;
		double goal;
		
		double currentRate;
		double timePassed = 0;
		
		FileInputStream fis = new FileInputStream("B-small-attempt0.in");
		BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
		
		numCases = Integer.parseInt(reader.readLine());
		for (int i = 1; i <= numCases; i++)
		{
			//read in the case
			String[] read = reader.readLine().split(" ");
			farmCost = Float.parseFloat(read[0]);
			farmRate = Float.parseFloat(read[1]);
			goal = Float.parseFloat(read[2]);
			
			//figure out the optimum time
			boolean complete = false;
			currentRate = BASE_RATE;
			timePassed = 0;
			while (!complete)
			{	
				timePassed += (farmCost / currentRate);
				if (goal / (currentRate + farmRate) > (goal - farmCost) / currentRate)
				{
					timePassed += ((goal - farmCost) / currentRate);
					complete = true;
				}
				else
				{
					currentRate += farmRate;
				}
			}
			
			//print the result
			System.out.println("Case #" + i + ": " + df.format(timePassed));
		}
	}

}
