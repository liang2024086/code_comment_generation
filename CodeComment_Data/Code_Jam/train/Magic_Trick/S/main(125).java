package methodEmbedding.Magic_Trick.S.LYD298;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;


public class main {

	public static void main(String[] args) {
		
		int[][] cards = new int[4][4];
		Scanner scan = new Scanner( System.in);
		
		
		ArrayList numbers = new ArrayList();
		
		int thatNumber = 0;
		int count = 0;
		int numberOfTimes = scan.nextInt();
		for( int m = 0; m < numberOfTimes; m++)
		{
			for( int times = 0; times < 2; times++)
			{
				int whichRow = scan.nextInt();
				for( int i = 0; i < 4; i++)
				{
					for( int a = 0; a < 4; a++)
					{
						cards[i][a] = scan.nextInt();
					}
				}
				
				for( int c = 0; c < 4; c++)
				{
					numbers.add( cards[whichRow-1][c]);
				}
			}
		
			for( int i = 0; i < 4; i++)
			{
				for( int a = 4; a < 8; a++)
				{
					if( numbers.get(i) == numbers.get(a))
					{
						count++;
						thatNumber = (int) numbers.get(i);
					}
				}
			}
		
		
		 
			for( int i = 0; i < 8; i++)
			{
				numbers.remove(0);
			}
			
			if( count == 1)
			{
				System.out.println( "Case #" + (m + 1) + ": " + thatNumber);
			}
			else if( count > 1)
			{
				System.out.println( "Case #" + (m + 1) + ": " + "Bad magician!");
			}
			else
			{
				System.out.println( "Case #" + (m + 1) + ": " + "Volunteer cheated!");
			}
		
			count = 0;
			thatNumber = 0;
		}
	}
}
