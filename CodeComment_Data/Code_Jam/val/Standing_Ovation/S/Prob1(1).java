package methodEmbedding.Standing_Ovation.S.LYD93;

import java.io.*;

class Prob1
{
	public static void main(String args[]) throws IOException
	{	
		String path = "A-small-attempt0.in";
		FileReader fr = new FileReader(path); 
		BufferedReader brReader = new BufferedReader(fr);
		String line = brReader.readLine();
		int tcase = Integer.parseInt(line);	//Total Cases
		for(int i = 0; i < tcase; i++)	//For each case
		{
			int friend = 0;	//Initialize needed friend to 0
			int people = 0;	//Initialize people so far standing up to 0
			line = brReader.readLine();	
			String[] token = line.split(" ");
			int smax = Integer.parseInt(token[0]);	//Read Smax
			for(int level = 0; level <= smax; level++)	//For each shyness level between 0 to Smax
			{
				if(Character.getNumericValue(token[1].charAt(level)) != 0)
				{
					if(people < level)	//Number of people stading is less than current level
					{
						friend += (level - people);	//You need these many friends for this level people to get stand up
						people += Character.getNumericValue(token[1].charAt(level)) + friend;	//Add current level people to total plus new friend invited
					}
					else
					{
						people += Character.getNumericValue(token[1].charAt(level)); //Add current level people to total people so far
					}
				}				
			}
			System.out.println("Case #" + (i+1) + ": " + friend);
		}		
	}
}
