package methodEmbedding.Cookie_Clicker_Alpha.S.LYD188;

import java.util.*;
import java.io.*;

public class CookieClickerAlpha 
{
	static double ee = 1e-6;
	
	public static void main(String[] args) throws Exception
	{
		String inputfile = "D:\\in2.txt";
		String outputfile = "D:\\out2.txt";
		
		Scanner in = new Scanner(new File(inputfile));
		FileWriter fstream = new FileWriter(outputfile);
		BufferedWriter out = new BufferedWriter(fstream);
		
		int N = in.nextInt();
		for (int n = 1; n <= N; ++n)
		{
			System.out.println("iteration " + n);
			
			double C, F, X;
			C = in.nextDouble();
			F = in.nextDouble();
			X = in.nextDouble();
			
			double rate = 2.0;
			double elapsedTime = 0.0;
			
			// default to never buying any farms ever
			double minTime = X / rate;
			
			for (;;)
			{				
				// try buying a farm
				elapsedTime += (C / rate);
				rate += F;

				// what happens if we never buy another farm???
				double newTime = elapsedTime + (X / rate);
				if (newTime > minTime)
					break;
				
				minTime = newTime;
			}
			
			out.write(String.format("Case #%d: %.7f", n, minTime));
			out.newLine();
		}
		
		System.out.println("done...");
		out.close();
	}
}
