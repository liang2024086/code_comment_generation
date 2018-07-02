package methodEmbedding.Cookie_Clicker_Alpha.S.LYD967;

import java.io.*;
import java.util.*;

public class Cookie {

	

	public static void main(String args[]) throws Exception {
		String inFile = "in";
		String outFile = "cookie.out";
		LineNumberReader lin = new LineNumberReader(new InputStreamReader(new FileInputStream(inFile)));
		PrintWriter out = new PrintWriter(new File(outFile));
		int NCASE = Integer.parseInt(lin.readLine());
		for(int CASE = 1; CASE <= NCASE; CASE++)
		{
			out.print("Case #" + CASE + ": ");
			System.out.println("\n==================================> CAS " + CASE);

			double C=0.0d,F=0.0d,X=0.0d;
			String[] strArray = lin.readLine().split(" ");
			for(int i = 0; i < strArray.length; i++)
			{
			    double doubleRead = Double.parseDouble(strArray[i]);
				if(i==0)
					C = doubleRead;
				else if(i==1)
					F = doubleRead;
				else if(i==2)
					X = doubleRead;
			}
			System.out.println("C = " + C + "; F = " + F + "; X = " + X);
			
			
			double totalTime = 0.0;
			int numberOfFarms = -1;
			while(true)
			{
				numberOfFarms++;
				double currentProductionSpeed = 2.0;
				double totalTimeToGetFarms = 0.0;
				for(int n=1; n<=numberOfFarms ; n++)
				{
					totalTimeToGetFarms += C/currentProductionSpeed;
					currentProductionSpeed += F;
				}
				double totalTimeIteration = totalTimeToGetFarms + X/currentProductionSpeed;
				if(numberOfFarms > 0)
				{
					if(totalTimeIteration < totalTime)
					{
						totalTime = totalTimeIteration;
					}
					else
					{
						break;
					}
				}
				else
				{
					totalTime = totalTimeIteration;
				}
			}
			System.out.println("TOTAL TIME FOR " + numberOfFarms + " FARMS : " + String.format(Locale.ENGLISH, "%.7f", totalTime)  );
			out.print(String.format(Locale.ENGLISH, "%.7f", totalTime));
			if(CASE != NCASE)
				out.println();
		}
		lin.close();
		out.close();
	}
}
