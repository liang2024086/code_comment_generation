package methodEmbedding.Cookie_Clicker_Alpha.S.LYD582;

import java.io.*;
import java.util.*;

public class CookieClickerMain {

	public static void main(String[] args)
	{
		String filename = args[0];

		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader (filename);
			br = new BufferedReader(fr);

			int indexTrickCurrTrial = 1;
			
			String line = br.readLine();
            while ((line = br.readLine()) != null)
    		{	
            	// given input values
            	StringTokenizer st = new StringTokenizer(line, " ");
            	float c = Float.parseFloat(st.nextToken());
            	float f = Float.parseFloat(st.nextToken());
            	float x = Float.parseFloat(st.nextToken());
            	
            	// current states
            	double totalSecondsElapsed = 0;
            	double currCookieGainRate = 2.0f;
            
            	double secondsReachGoalFromNowWithoutAnotherFarm =  x / currCookieGainRate;

            	while (true)
            	{
            		// decision making: make new farm or wait for cookies to fill
            		double secondsCanBuyFarmFromNow = c / currCookieGainRate;
            		double secondsReachGoalFromNextWithAnotherFarm = x / (currCookieGainRate + f);
            		
            		// build farm
            		if ((secondsCanBuyFarmFromNow + secondsReachGoalFromNextWithAnotherFarm) < secondsReachGoalFromNowWithoutAnotherFarm)
            		{
            			totalSecondsElapsed += secondsCanBuyFarmFromNow;
            			currCookieGainRate += f;
            			secondsReachGoalFromNowWithoutAnotherFarm = secondsReachGoalFromNextWithAnotherFarm;
            		}
            		else
            		{
            			totalSecondsElapsed += secondsReachGoalFromNowWithoutAnotherFarm;
            			break;
            		}
            	}
            	System.out.println("Case #" + indexTrickCurrTrial + ": " + totalSecondsElapsed);

            	indexTrickCurrTrial++;
    		}
			
			
			
			
		} catch (FileNotFoundException ex) {
			// exception handling
		} catch (IOException ex) {
			// exception handling
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException ex) {
				// exception handling
			}
		}

	}

}
