package methodEmbedding.Magic_Trick.S.LYD53;

import java.util.ArrayList;
import java.util.Scanner;


public class magic 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int numCases = in.nextInt();
		
		for(int caseIndex = 1; caseIndex<=numCases; caseIndex++)
		{
			int firstRow = in.nextInt()-1;
			ArrayList<Integer> firstChoices = new ArrayList<Integer>();
			
			//find every option in row the first time
			for(int i=0; i<16; i++)
			{
				if (i/4 == firstRow)
				{
					firstChoices.add(in.nextInt());
				}
				else
				{
					in.nextInt();
				}
			}
			
			int secondRow = in.nextInt()-1;
			ArrayList<Integer> answers = new ArrayList<Integer>();
			
			for(int i=0; i<16; i++)
			{
				if (i/4 == secondRow)
				{
					int temp = in.nextInt();
					if (firstChoices.contains(temp))
					{
						answers.add(temp);
					}
				}
				else
				{
					in.nextInt();
				}
			}
			
			if (answers.size() == 0)
			{
				System.out.println("Case #" + caseIndex +": Volunteer cheated!");
			}
			else if (answers.size() == 1)
			{
				System.out.println("Case #" + caseIndex +": " + answers.get(0));
			}
			else 
			{
				System.out.println("Case #" + caseIndex +": Bad magician!");
			}
			
		}

	}

}
