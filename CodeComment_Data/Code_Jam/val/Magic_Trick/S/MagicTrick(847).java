package methodEmbedding.Magic_Trick.S.LYD831;

/**	Java competition problem template
 *	Use for input/output problems
 */

import java.io.*;
import java.util.*;

public class MagicTrick {
	public static void main(String[] args) throws IOException
	{
		// Handling IO
		String inputFileName = "A-small-attempt0.in";
		Scanner scan = new Scanner(new File(inputFileName));
		// Trim off file name for use as output file name
		inputFileName = inputFileName.substring(0, inputFileName.indexOf(".")); 
		FileWriter fstream = new FileWriter(inputFileName + ".out");
		BufferedWriter output = new BufferedWriter(fstream);
		
		// Problems with multiple cases
		int numCases = scan.nextInt();
		for (int currentCase = 0; currentCase < numCases; currentCase++)
		{
			int row1 = scan.nextInt();
			ArrayList<Integer> possible1 = new ArrayList<>();
			for (int i = 1; i <= 4; i++)
			{
				if (row1 == i)
				{
					for (int j = 1; j <= 4; j++)
						possible1.add(scan.nextInt());
				}
				else
					for (int j = 1; j <= 4; j++)
						scan.nextInt();
			}
			
			int row2 = scan.nextInt();
			ArrayList<Integer> possible2 = new ArrayList<>();
			for (int i = 1; i <= 4; i++)
			{
				if (row2 == i)
				{
					for (int j = 1; j <= 4; j++)
						possible2.add(scan.nextInt());
				}
				else
					for (int j = 1; j <= 4; j++)
						scan.nextInt();
			}
			
			possible1.retainAll(possible2);
			
			if (possible1.size() == 0)
				output.write("Case #" + (currentCase + 1) + ": Volunteer cheated!\n");
			else if (possible1.size() == 1)
				output.write("Case #" + (currentCase + 1) + ": " + possible1.get(0) + "\n");
			else
				output.write("Case #" + (currentCase + 1) + ": Bad magician!\n");
			
		
		}
		output.close(); // End output
	}

}
