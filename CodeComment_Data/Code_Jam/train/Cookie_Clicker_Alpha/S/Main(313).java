package methodEmbedding.Cookie_Clicker_Alpha.S.LYD761;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;


public class Main 
{

	public static void main(String[] args) 
	{
		int argsCount = 0;
		int testCases = Integer.parseInt(args[argsCount]);
		String[] strings = new String[100];
		DecimalFormat df = new DecimalFormat("#.0000000");
		
		for(int i = 0; i < testCases; ++i)
		{
			double cookiesPerSecond = 2;
			double farmPrice = Double.parseDouble(args[++argsCount]);
			double farmCookieIncrease = Double.parseDouble(args[++argsCount]);
			double totalCookiesNeeded = Double.parseDouble(args[++argsCount]);
			
			double totalPurchaseTime = 0;
			double farmPurchaseTime;
			
			ArrayList<Double> timesList = new ArrayList<Double>();
			
			timesList.add(totalPurchaseTime + (totalCookiesNeeded / cookiesPerSecond));
			
			do
			{
				farmPurchaseTime = farmPrice / cookiesPerSecond;
				totalPurchaseTime += farmPurchaseTime;
				cookiesPerSecond += farmCookieIncrease;
				timesList.add(totalPurchaseTime + (totalCookiesNeeded / cookiesPerSecond));
			} while(timesList.get(timesList.size()-2) > timesList.get(timesList.size()-1));
			
			Collections.sort(timesList);
			
			strings[i] = "Case #" + (i+1) + ": " + df.format(timesList.get(0));
		}
		
		for(String current : strings)
		{
			if(current != null)
			{
				System.out.println(current);
			}
			
		}

	}

}
