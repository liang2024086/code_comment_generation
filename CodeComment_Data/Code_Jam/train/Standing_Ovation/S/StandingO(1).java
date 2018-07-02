package methodEmbedding.Standing_Ovation.S.LYD1506;

/*
 * Google Code Challenge Java
 * 
 * Code written for the Google Code Challenge by Greg Dougherty
 * Created: April 12, 2013
 * 
 * Copyright 2013 by Greg Dougherty
 */


import java.io.*;

/**
 * @author Greg Dougherty
 *
 */
public class StandingO
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
			StringBuilder	results = new StringBuilder (200);
			
			// Run each test case
			for (int i = 0; i < numCases; ++i)
			{
				line = dataReader.readLine ();
				String[]	values = line.split (" ");
				
				int		maxShy = Integer.parseInt (values[0]) + 1;
				String	data = values[1];
				int[]	counts = new int[maxShy];
				int		numNeeded = 0;
				int		curTotal = 0;
				
				for (int j = 0; j < maxShy; ++j)
					counts[j] = Integer.parseInt (data.substring (j, j + 1));
				
				for (int j = 0; j < maxShy; ++j)
				{
					int	needed = j - curTotal;
					if (needed > 0)
					{
						numNeeded += needed;
						curTotal += needed;
					}
					
					curTotal += counts[j];
				}
				
				results.delete (0, results.length ());
				results.append ("Case #");
				results.append (i + 1);
				results.append (": ");
				results.append (numNeeded);
				dataWriter.write (results.toString ());
				dataWriter.newLine ();
				dataWriter.flush ();
				System.out.println (results.toString ());
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
