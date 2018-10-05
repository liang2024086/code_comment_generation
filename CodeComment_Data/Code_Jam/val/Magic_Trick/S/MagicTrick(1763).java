package methodEmbedding.Magic_Trick.S.LYD928;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Google Code Jam problem A Magic Trick
 * @author Henry Bullingham
 * @version 11 April 2014
 */
public class MagicTrick
{
	
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner keyboard = new Scanner(System.in);
		
		int numberOfTestCases = keyboard.nextInt();
		
		PrintWriter outFile = new PrintWriter(new File ("magictrick.out"));
		
		for (int testCase = 1; testCase <= numberOfTestCases;testCase++)
		{
			int firstChoice = keyboard.nextInt() - 1;
			int [] [] cards = new int [4] [4];
			for (int y = 0; y < 4; y++)
				for (int x = 0; x < 4; x ++)
					cards[x][y] = keyboard.nextInt();
			int secondChoice = keyboard.nextInt() - 1;
			int [] [] secondCards = new int [4] [4];
			for (int y = 0; y < 4; y++)
				for (int x = 0; x < 4; x ++)
					secondCards[x][y] = keyboard.nextInt();
			
            boolean magicianFail = false;
            boolean spectatorCheat = false;
            int card = -1;
            
            int numberPossibleCards = 0;
            
            for (int col1 = 0; col1 < 4; col1 ++ )
            {
            	for (int col2 = 0; col2 < 4; col2++)
            	{
            		if (cards[col1][firstChoice] == secondCards[col2][secondChoice])
            		{
            			numberPossibleCards++;
            			card = cards[col1][firstChoice];
            		}
            	}
            }
			
			outFile.print("Case #" + testCase+ ": ");
			if (numberPossibleCards < 1)
				outFile.println("Volunteer cheated!");
			else if (numberPossibleCards == 1)
				outFile.println(card);
			else
				outFile.println("Bad magician!");
		}
		
		keyboard.close();
		outFile.close();
	}

}
