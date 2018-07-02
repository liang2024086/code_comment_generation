package methodEmbedding.Magic_Trick.S.LYD914;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Magic 
{	
	public static void main(String[] args) 
	{
		File inputFile = new File("E:\\codejam\\attempt4.txt");
		Scanner in = null;
		try 
		{
			in = new Scanner(inputFile);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		int tests = in.nextInt();
		for (int i = 0; i < tests; i++)//goes through amount of tests
		{
			//System.out.println("loop 1: " + i);
			int choice;
			int[][] cardArray = new int[4][4];
			ArrayList<Integer> intsPoss = new ArrayList<Integer>();
			ArrayList<Integer> intsPoss2 = new ArrayList<Integer>();
			for (int j = 0; j < 2; j++)//2 sets
			{
				//System.out.println("loop 2: " + j);
				choice = in.nextInt();
				//System.out.println("choice = " + choice);
				for (int k = 0; k < 4; k++)//rows
				{
					//System.out.println("loop 3: " + k);
					for (int m = 0; m < 4; m++)//columns
					{
						//System.out.println("loop 4: " + m);
						cardArray[k][m] = in.nextInt();
						if (j == 0)
						{
							if (k == (choice - 1))
							{
								intsPoss.addAll(new ArrayList<Integer>());
								intsPoss.add(cardArray[k][m]);
								
							}
						}
						else
						{
							if (k == (choice - 1))
							{
								intsPoss.addAll(new ArrayList<Integer>());
								intsPoss2.add(cardArray[k][m]);
							}
						}
					}
				}
			}
			int x;
			ArrayList<Integer> total = new ArrayList<Integer>();
			for (x = 0; x < intsPoss.size(); x++)
			{
				for (int y = 0; y < intsPoss2.size(); y++)
				{
					if (intsPoss.get(x) == intsPoss2.get(y))
					{
						total.addAll(new ArrayList<Integer>());
						total.add(intsPoss.get(x));
						//System.out.println(intsPoss.get(x));
					}
				}
			}
			if (total.size() == 1)
			{
				System.out.println("Case #" + (i + 1) + ": " + total.get(0));
			}
			else if (total.size() > 1)
			{
				System.out.println("Case #" + (i + 1) + ": Bad magician!");
			}
			else
			{
				System.out.println("Case #" + (i + 1) + ": Volunteer cheated!");
			}
		}
	}

}

