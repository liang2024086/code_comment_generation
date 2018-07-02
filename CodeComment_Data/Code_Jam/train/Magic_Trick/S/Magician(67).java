package methodEmbedding.Magic_Trick.S.LYD1111;

/*
 * Google Code Challenge Java
 * 
 * Code written for the Google Code Challenge by Greg Dougherty
 * Created: April 12, 2013
 * 
 * Copyright 2013 by Greg Dougherty
 */


import java.io.*;
import java.util.*;

/**
 * @author Greg Dougherty
 *
 */
public class Magician
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
			
			// Run each test case
			for (int i = 0; i < numCases; ++i)
			{
				line = dataReader.readLine ();
				
				int				firstRow = Integer.parseInt (line) - 1;
				Set<Integer>	possible = new HashSet<Integer> ();
				Set<Integer>	actual = new HashSet<Integer> ();
				
				for (int j = 0; j < 4; ++j)
				{
					line = dataReader.readLine ();
					if (j != firstRow)
						continue;
					
					String[]	values = line.split (" ");
					for (String value : values)
						possible.add (Integer.valueOf (value));
				}
				
				line = dataReader.readLine ();
				int		secondRow = Integer.parseInt (line) - 1;
				
				for (int j = 0; j < 4; ++j)
				{
					line = dataReader.readLine ();
					if (j != secondRow)
						continue;
					
					String[]	values = line.split (" ");
					for (String value : values)
					{
						Integer	test = Integer.valueOf (value);
						if (possible.remove (test))
							actual.add (test);
					}
				}
				
				
				dataWriter.write ("Case #" + (i + 1) + ": ");
				int	size = actual.size ();
				if (size == 0)
					dataWriter.write ("Volunteer cheated!");
				else if (size > 1)
					dataWriter.write ("Bad magician!");
				else
					dataWriter.write (actual.iterator ().next ().toString ());
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
