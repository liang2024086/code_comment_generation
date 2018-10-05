package methodEmbedding.Magic_Trick.S.LYD1112;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;




public class MagicTrick {
	public static void main(String[] args)
	{
		File file = new File("/Users/unicornherder/Documents/workspace/MagicTrick/src/input.txt");
		try
		{
			Scanner in = new Scanner(file);
			HashMap<Integer, Integer> hm; 
			
			
			// Scanner in = new Scanner(System.in);
			
			// test cases
			int T = in.nextInt();
			for (int i=1; i<=T;i++)
			{
					
				hm = new HashMap<Integer, Integer>();
				for (int turns=1; turns<=2; turns++)
				{
					// rows
					int rowAnswer = in.nextInt();
					//System.out.println("rowAnswer = " + rowAnswer);
					for (int row=1; row<=4; row++)
					{
						// columns
						for (int column=1; column<=4; column++)
						{
							int columnValue = in.nextInt();
							if (row == rowAnswer)
							{
								int count = hm.containsKey(columnValue) ? hm.get(columnValue) : 0;
								hm.put(columnValue, count+1);
								
								//System.out.println(columnValue);
							}
						}
					}
				}
				//System.out.println(hm);
				//System.out.println("TEST CASE "+i);
				int answer = -1;
				boolean hasOneAnswer = false;
				boolean hasTwoAnswers = false;
				
				for (Integer key : hm.keySet())
				{
					if (hm.get(key) == 2)
					{
						answer = key;
						if (hasOneAnswer==false)
						{
							// great, we got the first answer
							hasOneAnswer=true;
						}
						else
						{
							// has two answers, bad magician
							hasTwoAnswers = true;
						}
						
						
					}
					
				}
				
				if (hasOneAnswer == true && hasTwoAnswers == false && answer!=-1)
				{
					System.out.println("Case #" + i + ": " + answer);
				}
				
				if (hasOneAnswer == true && hasTwoAnswers == true && answer !=-1)
				{
					System.out.println("Case #" + i + ": " + "Bad magician!");
				}
				
				if (answer == -1)
				{
					System.out.println("Case #" + i + ": " + "Volunteer cheated!");
				}
				
				/*
				
				// reset hash map
				hm = new HashMap<Integer, Integer>();
				
				// turns
				for (int turns=1; turns<=2; turns++)
				{
					// rows
					int rowAnswer = in.nextInt();
					//System.out.println("rowAnswer = " + rowAnswer);
					for (int row=1; row<=4; row++)
					{
						// columns
						for (int column=1; column<=4; column++)
						{
							int columnValue = in.nextInt();
							if (row == rowAnswer)
							{
								int count = hm.containsKey(columnValue) ? hm.get(columnValue) : 0;
								hm.put(columnValue, count+1);
								
								//System.out.println(columnValue);
							}
						}
					}
				}
				
				// analyze
				//System.out.println(hm);
				
				int answer = -1;
				boolean hasOneAnswer = false;
				boolean hasTwoAnswers = false;
				
				for (Integer key : hm.keySet())
				{
					if (hm.get(key) == 2)
					{
						answer = key;
						if (hasOneAnswer==false)
						{
							// great, we got the first answer
							hasOneAnswer=true;
						}
						else
						{
							// has two answers, bad magician
							hasTwoAnswers = true;
						}
						
						
					}
					
				}
				
				if (hasOneAnswer == true && hasTwoAnswers == false && answer!=-1)
				{
					System.out.println("Case #" + i + ": " + answer);
				}
				
				if (hasOneAnswer == true && hasTwoAnswers == false && answer !=-1)
				{
					System.out.println("Case #" + i + ": " + "Bad magician!");
				}
				
				if (answer == -1)
				{
					System.out.println("Case #" + i + ": " + "Volunteer cheated!");
				}
				*/
			}







		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
