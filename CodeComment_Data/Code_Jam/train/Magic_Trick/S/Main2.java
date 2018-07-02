package methodEmbedding.Magic_Trick.S.LYD1499;

import java.io.*;
import java.util.*;


public class Main2 
{
	public static void main(String[] args)
	{
		int first, second, trash;
		int instances = 0;
		int[] row1 = new int[4];
		int[] row2 = new int[4];
		int counter = 0;
		int masterultracounter = 0;
		int possible = 0;
		try
		{
			FileReader file = new FileReader("A-small-attempt3.in");
			Scanner scan = new Scanner(file);
			instances = scan.nextInt();
			
			for (int k = 0; k < instances; k++)
			{
				possible = 0;
				counter = 0;
				first = scan.nextInt();//get first
				for (int i = 0; i < (first-1)*4; i++)//skip to row1
				{
					trash = scan.nextInt();
				}
				for(int i = 0; i < 4; i++)//get row1
				{
					row1[i] = scan.nextInt();
				}
				
				for(int i = 0; i < (4-first)*4; i++)//skip to second
				{
					trash = scan.nextInt();
				}
				second = scan.nextInt();
				for (int i = 0; i < (second-1)*4; i++)//skip to row2
				{
					trash = scan.nextInt();
				}
				for (int i = 0; i < 4; i++)
				{
					row2[i] = scan.nextInt();
				}
				for (int i = 0; i < (4-second)*4; i++)
				{
					trash=scan.nextInt();
				}
				for (int i = 0; i < 4; i++)
				{
					for (int l = 0; l < 4; l++)
					{
						if (row1[i] == row2[l])
						{
							possible += row1[i];
							counter++;
						}
					}
				}
				masterultracounter++;
				switch (counter) {
				case 0: System.out.println("Case #" + masterultracounter + ": Volunteer cheated!");
				break;
				case 1: System.out.println("Case #" + masterultracounter + ": " + possible);
				break;
				default: System.out.println("Case #" + masterultracounter + ": Bad magician!");
				break;
				
			}
			
			}
		
		}
		catch(IOException e){}
	}
	

}
