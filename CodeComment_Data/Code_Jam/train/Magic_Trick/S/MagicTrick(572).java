package methodEmbedding.Magic_Trick.S.LYD1745;

import java.util.*;
import java.lang.System.*;
import java.io.*;

public class MagicTrick {
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(new File("A-small-attempt0.in"));
		
		int nums = in.nextInt();
	
		for(int i = 1; i<=nums; i++)
		{ 
			int volchosen1st = in.nextInt();
			int[][] cardspre = new int[4][4];
			int[][] cardspost = new int[4][4];
			for(int r = 0; r<cardspre.length; r++)
			{
				for(int c = 0; c<cardspre[r].length; c++)
				{
					cardspre[r][c] = in.nextInt();
				}
			}
			int volchosen2nd = in.nextInt();
			for(int a = 0; a<cardspost.length; a++)
			{
				for(int b = 0; b<cardspost[a].length; b++)
				{
					cardspost[a][b] = in.nextInt(); 
				}
			}
			int[] poscards = cardspre[volchosen1st-1];
			int[] resultcards= cardspost[volchosen2nd-1];
			boolean cheated = false;
			boolean badmagician = false;
			boolean chosenone = false;
			int actualcard = -1;
			
			for(int x = 0; x<poscards.length; x++)
			{	boolean contains[] = new boolean[4];
				for(int g = 0; g<resultcards.length; g++)
				{
					if(resultcards[g]== poscards[x])
					{
						contains[x] = true;
					}
				}
				
				if(contains[x]  && !chosenone )
				{	
					actualcard = poscards[x];
					chosenone = true;
				}
				else if(contains[x] && chosenone)
				{
					badmagician = true;
				
				}
				else if(!contains[x] && x == poscards.length-1 && actualcard ==-1)
				{
					cheated = true;
					
				}
				
			}
			
			if(badmagician)
			{
				System.out.println("Case #"+i+": Bad magician!");
			}
			if(cheated)
			{
				System.out.println("Case #"+i+": Volunteer cheated!");
			}
			if(!cheated && !badmagician)
			{
				System.out.println("Case #"+i+": "+actualcard);
			}
			
		} 
		
		
	}
}
