package methodEmbedding.Standing_Ovation.S.LYD1544;

import java.util.*;
import java.io.*;

public class StandingOvation {

	public static void main(String[] args) throws FileNotFoundException 
	{
		File fileToRead = new File("A-small-attempt1.in");
		Scanner input = new Scanner(fileToRead);
		
		int num = input.nextInt();
		
		for(int i = 1; i <= num; i++)
		{
			int maxShyness = input.nextInt();
			String peopleWithSpace = input.nextLine();
			String people = peopleWithSpace.substring(1);
			int peopleStanding = 0;
			int numberToInvite = 0;
			for(int j = 0; j <= maxShyness; j++)
			{
				int shyPeople = (people.charAt(j) - '0');
				if(peopleStanding >= j)
				{
					peopleStanding += shyPeople;
				}
				else
				{
					if(shyPeople != 0)
					{
						int moreInvited = j - peopleStanding;
						numberToInvite += moreInvited;
						peopleStanding += shyPeople + moreInvited;
					}
				}
			}			
			
			System.out.printf("Case #%d: %d\n", i, numberToInvite);
		}

	}

}
