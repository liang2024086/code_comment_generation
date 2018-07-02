package methodEmbedding.Cookie_Clicker_Alpha.S.LYD877;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
String[] split = null;
		int caseNr;
		int T = Integer.valueOf(reader.readLine());
		Double C, F, X, currentCookieRate, totalSeconds, achieveInSeconds, spentSeconds, achieveInSeconds2;
		for (caseNr = 1; caseNr <= T; caseNr++)
		{
			split = reader.readLine().split("\\s+");
			C = Double.valueOf(split[0]);
			F = Double.valueOf(split[1]);
			X = Double.valueOf(split[2]);
			
			currentCookieRate = 2.0;
			totalSeconds = 0.0;
			
			while(true)
			{
				//System.out.println(X + " " + amount);
				achieveInSeconds = X / currentCookieRate;
				achieveInSeconds2 = C / currentCookieRate + X / (currentCookieRate + F);
				
				if (achieveInSeconds2 < achieveInSeconds)
				{
					spentSeconds = C / currentCookieRate;
					currentCookieRate += F;
				}
				else
				{
					spentSeconds = achieveInSeconds;
					break;
				}
				
				totalSeconds += spentSeconds;
			}
			totalSeconds += spentSeconds;
			
			System.out.printf("Case #%d: %.7f%n", caseNr, totalSeconds);
		}
	}
}
