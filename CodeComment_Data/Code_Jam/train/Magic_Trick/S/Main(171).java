package methodEmbedding.Magic_Trick.S.LYD458;

/*
 * This is the code for my solution to Google Code Jam 2014 Problem A
 * 
 * Note: I'm assuming that the input file is going to be properly formatted
 * so that I don't do any checks that I would normally do :)
 * 
 * Yes, the code is ugly. I started Code Jam about 15 hours late.
 */

import java.io.*;

public class Main {

	public static void main(String[] args) {
		File file = new File("A-small-attempt1.in");
		BufferedReader reader = null;
		
		try
		{
			reader = new BufferedReader(new FileReader(file));
			String text = null;
			int numOfCases, i = 0, index = 0;
			
			numOfCases = Integer.parseInt(reader.readLine()); // This is the first line, i.e. the number of cases
			Case[] cases = new Case[numOfCases];
			
			for (i = 0; i < numOfCases; i++)
			{
				int[] ans = new int[2];
				int[][] firstRows = new int[4][4];
				int[][] secondRows = new int[4][4];
				
				/* This is the first row
				 * that the audience member
				 * picks.
				 */
				ans[0] = Integer.parseInt(reader.readLine());
				
				/* The next four represent
				 * the rows of cards
				 */
				for (int j = 0; j < 4; j++)
				{
					text = reader.readLine();
					firstRows[j][0] = Integer.parseInt(text.split(" ")[0]);
					firstRows[j][1] = Integer.parseInt(text.split(" ")[1]);
					firstRows[j][2] = Integer.parseInt(text.split(" ")[2]);
					firstRows[j][3] = Integer.parseInt(text.split(" ")[3]);
				}
				
				/* This is the second row
				 * that the audience member
				 * picks.
				 */
				ans[1] = Integer.parseInt(reader.readLine());
				
				/*
				 * Now read the next four
				 * lines that represent the row of cards
				 */
				for (int j = 0; j < 4; j++)
				{
					text = reader.readLine();
					secondRows[j][0] = Integer.parseInt(text.split(" ")[0]);
					secondRows[j][1] = Integer.parseInt(text.split(" ")[1]);
					secondRows[j][2] = Integer.parseInt(text.split(" ")[2]);
					secondRows[j][3] = Integer.parseInt(text.split(" ")[3]);					
				}
				
				/*
				 * Now that we've collected all data, 
				 * shove it into a Case object.
				 */
				cases[i] = new Case();
				cases[i].setID(i + 1);
				cases[i].setAns(ans);
				cases[i].setFirstRows(firstRows);
				cases[i].setSecondRows(secondRows);
			}
			
			/* Now that the file's read in and the objects have been created
			 * we can do stuff with it
			 */
			PrintWriter writer = new PrintWriter("solution.txt", "UTF-8");
			for (i = 0; i < numOfCases; i++)
			{
				int counter = 0;
				/* Go through each case
				 * and compare the selected rows' values
				 * to see if we have 0, 1, or more matches
				 *
				 * cases[i].ans[0] and .ans[1] represent the rows
				 */
				int firstRow = cases[i].getAns()[0] - 1;
				int secondRow = cases[i].getAns()[1] - 1;
				for (int j = 0; j < 4; j++)
				{
					for (int k = 0; k < 4; k++)
					{
						int outer = cases[i].getFirstRows()[firstRow][j];
						int inner = cases[i].getSecondRows()[secondRow][k];
						if (outer == inner)
						{
							counter++;
							index = j; /* Where the number can be found in the first row */
						}
					}
				}
				
				if (counter == 0)
				{
					/*
					 * The audience member cheated
					 */
					System.out.println("Case #" + cases[i].getID() + ": Volunteer cheated!");
					writer.println("Case #" + cases[i].getID() + ": Volunteer cheated!");
				}
				else if (counter == 1)
				{
					/*
					 * We got the answer!
					 */
					System.out.println("Case #" + cases[i].getID() + ": " + cases[i].getFirstRows()[firstRow][index]);
					writer.println("Case #" + cases[i].getID() + ": " + cases[i].getFirstRows()[firstRow][index]);
				}
				else if (counter > 1)
				{
					/*
					 * The magician screwed up
					 */
					System.out.println("Case #" + cases[i].getID() + ": Bad magician!");
					writer.println("Case #" + cases[i].getID() + ": Bad magician!");;
				}
			}
			writer.close();
		}
		catch (Exception ex)
		{
			System.out.println("Exception caught while reading file: " + ex.getMessage());
			System.exit(1);
		}
		
		
	}

}
