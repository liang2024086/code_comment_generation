package methodEmbedding.Cookie_Clicker_Alpha.S.LYD405;

/***********************************************************************
* Google Code Jam - Qualification Round 2014
* Problem B. Cookie Clicker Alpha
* Name        : MicCarino
* Date        : 13 / 04 / 2014
***********************************************************************/

import java.io.*;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;

class code
{

	public static void main(String[] args) throws Exception
	{
		int farmCount = 0;
		double farmExtra = 0, farmCost = 0;
		double cookiePerSec = 2;
		double timePast = 0, timeNext = 0;
		double target = 0;
		int cases = 0;
		String lineIn;
		Boolean checkAgain = true;


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
            // move the next line into somewhere to break it down
            lineIn = loadFile.next();
            //System.out.println(lineIn); //for testing
            StringTokenizer st = new StringTokenizer(lineIn, " ");

            farmCost = Double.parseDouble(st.nextToken().trim());
            farmExtra = Double.parseDouble(st.nextToken().trim());
            target = Double.parseDouble(st.nextToken().trim());

			//test a bunch of possible numbers of farms, to find the best
			do{
				//reset vaLues from last round
				cookiePerSec = 2;
				timeNext = 0;

				for (int i =0; i<farmCount; i++) 
				{
					timeNext += farmCost / cookiePerSec;
					cookiePerSec += farmExtra;
				}

				timeNext += target / cookiePerSec;
				//System.out.println(farmCount);

				if (farmCount == 0) 
				{
					farmCount +=1;
					timePast = timeNext;
				} else if (timePast <= timeNext) 
				{
					checkAgain = false;
				} else {
					farmCount +=1;
					timePast = timeNext;
				}

			} while (checkAgain);


		/* output based on what was found */
		pw.print("Case #" + (rounds+1) + ": ");
		pw.printf("%7f", timePast); 
		pw.println();

		// clear values for next round 
		farmExtra = 0;
		farmCost = 0;
		farmCount = 0;
		target = 0;
		timePast = 0;
		timeNext = 0;
		checkAgain = true;            
        }

        pw.close();
        loadFile.close();
	}
}
