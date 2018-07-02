package methodEmbedding.Standing_Ovation.S.LYD729;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class StandingOvation 
{
	public static void main(String[] args) throws IOException 
	{
		Scanner sc = new Scanner (new File("standing_ovation.in"));
		BufferedWriter fw = new BufferedWriter(new FileWriter(new File("standing_ovation.out")));
		int T = sc.nextInt();
		for (int caseNum = 1; caseNum <= T; caseNum++)
		{
			int maxShyness = sc.nextInt();
			char[] audienceChars = sc.nextLine().substring(1).toCharArray();
			int amountOfFriends = 0;
			int amountOfAudience = 0;
			int amountOfPeople = 0;
			for (int i = 0; i<audienceChars.length; i++)
			{
				int amountInThisShynessLevel = (int)(audienceChars[i]-'0');
				if(i-amountOfPeople > 0)
					amountOfFriends += i-amountOfPeople;
				amountOfAudience += amountInThisShynessLevel;
				amountOfPeople = amountOfAudience + amountOfFriends;
			}
			fw.write("Case #"+caseNum+": "+amountOfFriends+"\n");
		}
		fw.flush();
		fw.close();
		sc.close();
	}
}

