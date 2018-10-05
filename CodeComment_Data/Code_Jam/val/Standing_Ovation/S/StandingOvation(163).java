package methodEmbedding.Standing_Ovation.S.LYD1834;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandingOvation
{
	public static void main(String[] args) throws IOException
	{
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		FileReader filea = new FileReader("hi.txt");
	    BufferedReader in = new BufferedReader(filea);
		
		int noOfCases = 0;
		try
		{
			noOfCases = Integer.parseInt(in.readLine());
		}
		catch (NumberFormatException | IOException e)
		{
			e.printStackTrace();
		}
		
		File file = new File("standingovation.out");
		file.createNewFile();
		BufferedWriter out = new BufferedWriter(new FileWriter(file));
		
		for (int caseNo = 0; caseNo < noOfCases; caseNo++)
		{
			String values = in.readLine();
			int maxShyness = Integer.parseInt(values.substring(0,1));
			int[] newValues = new int[maxShyness+1];
			
			for (int i = 0; i <= maxShyness; i++)
			{
				newValues[i] = Integer.parseInt(values.substring(2+i, 3+i));
			}
			
//			for (int i = 0; i < newValues.length; i ++)
//			{
//				System.out.println(newValues[i]);
//			}
			
			int peopleStanding = 0;
			int friendsRequired = 0;
			for (int level = 0; level <= maxShyness; level++)
			{
				while (peopleStanding < level)
				{
					friendsRequired++;
					peopleStanding++;
				}
				
				peopleStanding += newValues[level];
			}
			
			out.write("Case #" + (caseNo+1) + ": " + friendsRequired+"\n");
		}
		out.close();
	}
}
