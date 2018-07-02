package methodEmbedding.Magic_Trick.S.LYD1727;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class MagicTrick
{

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException
	{
		
		Scanner inFile = new Scanner(new File("trick.in"));
		PrintWriter printWrite = new PrintWriter(new File("trick.out"));
		
		
		int numCase = inFile.nextInt();
		
		for (int cases = 0; cases < numCase; cases++)
		{
			int guess1 = inFile.nextInt();
			inFile.nextLine();
		
			String first = inFile.nextLine() + " " + inFile.nextLine() + " " + inFile.nextLine() + " " + inFile.nextLine();

			int guess2 = inFile.nextInt();
			inFile.nextLine();
			
			String second = inFile.nextLine() + " " + inFile.nextLine() + " " + inFile.nextLine() + " " + inFile.nextLine();
			
			List<String> gridNums1 = Arrays.asList(first.split(" "));
			List<String> gridNums2 = Arrays.asList(second.split(" "));
			
			//System.out.println(gridNums1);
			//System.out.println(gridNums2);
			
			List <String> row1 = gridNums1.subList((guess1-1)*4, (guess1)*4);
			List <String> row2 = gridNums2.subList((guess2-1)*4, (guess2)*4);
			
			
			//System.out.println(row1);
			//System.out.println(row2);
			
			
			List<String> posNums = new ArrayList<String>();
			for (String check: row2)
			{
				
				if (row1.contains(check))
					posNums.add(check);
			}
			
			//System.out.println(posNums);
			
			if (posNums.size() == 1)
			{
				printWrite.println("Case #" + (cases+1) + ": " + posNums.get(0));
				//System.out.println("Case #1: " + posNums.get(0));
			}
			else if (posNums.size() < 1)
			{
				printWrite.println("Case #" + (cases+1) + ": Volunteer cheated!");
				//System.out.println("Case #3: Volunteer cheated!");
			}
			else
			{
				printWrite.println("Case #" + (cases+1) + ": Bad magician!");
				//System.out.println("Case #2: Bad magician!");
			}
			
			//System.out.println(row2.retainAll(row1));
			
			
		}

		printWrite.close();
		
	}

}
