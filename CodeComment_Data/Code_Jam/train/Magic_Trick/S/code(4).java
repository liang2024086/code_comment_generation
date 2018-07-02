package methodEmbedding.Magic_Trick.S.LYD425;

/***********************************************************************
* Google Code Jam - Qualification Round 2014
* Problem A. Magic Trick
* Name        : MicCarino
* Date        : 12 / 04 / 2014
***********************************************************************/

import java.io.*;
import java.util.*;

class code
{

	public static void main(String[] args) throws Exception
	{
		int gridA[][] = new int[4][4];
		int gridB[][] = new int[4][4];
		int rowA, rowB;
		int cases;
		String lineIn;
		int found = 0;
		int chosen = 0;

		/* Get input from file */
		Scanner loadFile = new Scanner(new File("input.in"));
        loadFile.useDelimiter("\n");

        //create output file
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));

        //find out how many cases there are
        String tempStr = loadFile.next();
        cases = Integer.parseInt(tempStr.trim());

        // go through each case
        for (int rounds = 0; rounds < cases; rounds++) 
        {
            //get the first row tip
            tempStr = loadFile.next().trim();
            rowA = Integer.parseInt(tempStr);
            rowA -=1;
            
            // break the rows into their pieces
            for (int i = 0; i < 4; i++) 
            {
                // move the next line into somewhere to break it down
                lineIn = loadFile.next();
                //System.out.println(lineIn); //for testing
                StringTokenizer st = new StringTokenizer(lineIn, " ");

            	for (int j = 0; j<4; j++) 
            	{
            		gridA[i][j] = Integer.parseInt(st.nextToken().trim());
            	}
            }
            //get the second row tip
            tempStr = loadFile.next().trim();
            rowB = Integer.parseInt(tempStr);
            rowB -=1;

            for (int i = 0; i < 4; i++) 
            {
            	// move the next line into somewhere to break it down
                lineIn = loadFile.next();
                //System.out.println(lineIn); //for testing
                StringTokenizer st = new StringTokenizer(lineIn, " ");

            	for (int j = 0; j<4; j++) 
            	{
            		gridB[i][j] = Integer.parseInt(st.nextToken().trim());
            	}
            }


			/* compare the two chosen lines */
			for (int i=0;i<4;i++) 
			{
				for (int j=0; j<4; j++) 
				{
					if (gridA[rowA][i] == gridB[rowB][j]) 
					{
						found++;
						chosen = gridA[rowA][i];
						//System.out.println(i + " " +  j);	
					} else {
						//System.out.println(gridA[rowA][i] + " " + gridB[rowB][j]);						
					}
				}
				
			}

		/* output based on what was found */
		pw.print("Case #" + (rounds+1) + ": ");
		if (found == 0) 
		{
			pw.println("Volunteer cheated!");		
		} else if (found == 1) 
		{
			pw.println(chosen);
		}else {
			pw.println("Bad magician!");
		}
		//pw.println(chosen);

		// clear values for next round 
		found = 0;
		chosen = 0;
		rowA = 0;
		rowB = 0;
            
        }

        pw.close();
        loadFile.close();
	}
}
