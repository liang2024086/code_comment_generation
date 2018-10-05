package methodEmbedding.Magic_Trick.S.LYD250;

import java.io.*;
import java.util.*;

public class test
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner fileScanner = new Scanner(new File("in.in"));
      PrintWriter printer = new PrintWriter("output.txt");
      int numRun = fileScanner.nextInt();

		for (int k = 0; k < numRun; k++)
		{
			int answer = fileScanner.nextInt(); //gets contestant answer
         
         int[] countlist = new int[17];
			int[][] rows = new int[4][4];

			//load all four lines into rows[][]
			for (int i = 0; i < 4; i++)
            for(int j = 0; j < 4; j++)
   				rows[i][j] = fileScanner.nextInt();

			int[] singleRow = rows[answer-1];

			for (int i = 0; i < 4; i++)
				countlist[singleRow[i]]++;

			answer = fileScanner.nextInt();

			//load all four lines into rows[]
			for (int i = 0; i < 4; i++)
            for(int j = 0; j < 4; j++)
   				rows[i][j] = fileScanner.nextInt();
               
         singleRow = rows[answer-1];      

			for (int i = 0; i < 4; i++)
				countlist[singleRow[i]]++;

			int count = 0;
			int number = 0;
			for (int i = 0; i < countlist.length; i++)
				if (countlist[i] == 2)
				{
					count++;
					number = i;
				}

			if (count == 0) printer.println("Case #" + (k+1) + ": " + "Volunteer cheated!");
			else if (count == 1) printer.println("Case #" + (k+1) + ": " + number);
			else if (count > 1) printer.println("Case #" + (k+1) + ": " + "Bad magician!");
		}
      printer.close();
	}
}
