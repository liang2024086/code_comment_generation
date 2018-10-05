package methodEmbedding.Standing_Ovation.S.LYD1505;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class StandingOvation
{

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader in = new BufferedReader (new FileReader ("A-small-attempt0.in"));
		//BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
		
		int T = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= T; t++)
		{
			String [] line = in.readLine().split(" ");
			
			int Smax = Integer.parseInt(line [0]);
			String audience = line [1];
			
			int peopleStanding = 0;
			int friendsAdded = 0;
			
			for (int s = 0; s < audience.length(); s++)
			{
				int people = Character.getNumericValue(audience.charAt(s));
				if (peopleStanding >= s)
					peopleStanding += people;
				else if (people > 0)
				{
					int added = s - peopleStanding; 
					friendsAdded += added;
					peopleStanding += (added + people);
				}
			}
			
			System.out.printf("Case #%d: %d%n", t, friendsAdded);

		}
	}

}
