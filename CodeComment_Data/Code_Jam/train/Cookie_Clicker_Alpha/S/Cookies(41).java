package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1177;

/*
 * Google Code Challenge Java
 * 
 * Code written for the Google Code Challenge by Greg Dougherty
 * Created: April 12, 2013
 * 
 * Copyright 2013 by Greg Dougherty
 */


import java.io.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * @author Greg Dougherty
 *
 */
public class Cookies
{
	
	private static final String	kInSuffix = ".in";
	private static final String	kOutSuffix = ".out";
	
	
	/**
	 * @param args
	 */
	public static void main (String[] args)
	{
		String	inName = args[0];
		int		nameLen = inName.indexOf (kInSuffix);
		String	outName = inName.substring (0, nameLen) + kOutSuffix;
		File	dataFile = new File (args[0]);
		File	resultFile = new File (outName);
		
		try
		{
			BufferedReader	dataReader = new BufferedReader (new FileReader (dataFile));
			BufferedWriter	dataWriter = new BufferedWriter (new FileWriter (resultFile));
			String			line = dataReader.readLine ();	// Get first line
			int				numCases = Integer.parseInt (line);
			NumberFormat	formatter = new DecimalFormat ("#0.0000000");
			
			// Run each test case
			for (int i = 0; i < numCases; ++i)
			{
				line = dataReader.readLine ();
				
				String[]	values = line.split (" ");
				double		curSpeed = 2.0;
				double		cost = Double.parseDouble (values[0]);
				double		output = Double.parseDouble (values[1]);
				double		total = Double.parseDouble (values[2]);
				double		elapsedTime = 0.0;
				double		timeToFarm = cost / curSpeed;
				double		timeToDone = total / curSpeed;
				double		bestTime = timeToDone;
				int			missed = 4;
				
				while (missed > 0)
				{
					elapsedTime += timeToFarm;
					curSpeed += output;
					timeToFarm = cost / curSpeed;
					timeToDone = total / curSpeed;
					
					double	endTime = elapsedTime + timeToDone;
					if (endTime < bestTime)
						bestTime = endTime;
					else
						--missed;
				}
				
				dataWriter.write ("Case #" + (i + 1) + ": ");
				dataWriter.write (formatter.format (bestTime));
				dataWriter.newLine ();
				dataWriter.flush ();
			}
			
			dataReader.close ();
			dataWriter.close ();
		}
		catch (IOException ioE)
		{
			ioE.printStackTrace ();
		}
	}
	
}
