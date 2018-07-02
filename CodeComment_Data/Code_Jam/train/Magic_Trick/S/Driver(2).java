package methodEmbedding.Magic_Trick.S.LYD227;

import java.util.Scanner;
import java.io.*;

public class Driver 
{
	public static void main(String[] args)throws IOException
	{
		Scanner input = new Scanner(new FileInputStream("A-small-attempt0.in"));
		PrintWriter output = new PrintWriter("Output.txt", "UTF-8");
		//NOTE might need to change
		// input.nextLine();
		// input.nextLine();
		int nrTests = input.nextInt();
		//System.out.println(nrTests);
		
		for (int i = 0; i<nrTests;i++)// NR of test cases
		{
			int caseNr = i+1;
			int row1 = input.nextInt();
			//System.out.println("Row1 " + row1); //print
			int[] array1 = new int[4];
			
			for (int b=0; b<row1 ; b++)
			{
				input.nextLine();
			}
			
			for (int j = 0;j<4;j++)
			{
				array1[j] = input.nextInt();
			}
			
			for (int k = 0; k <= 4 - row1; k++)
			{
				input.nextLine();
			}
			
			// 2 arrangement ############################
			
			int row2 = input.nextInt();
			//System.out.println("Row2 " + row2);
			int[] array2 = new int[4];
			for (int s=0; s<row2 ; s++)
			{
				input.nextLine();
			}
			
			for (int j = 0;j<4;j++)
			{
				array2[j] = input.nextInt();
			}
			
			for (int k = 0; k <= 4 - row2; k++)
			{
				if (i!=nrTests-1)
					input.nextLine();
			}			
			
			//Now compare the arrays ####################
			// for (int p = 0; p<4; p++)
			// {
				// System.out.println(array1[p]);
			// }
			// for (int q = 0; q< 4; q++)
			// {
				// System.out.println(array2[q]);
			// }
			
			
			
			
			int nrSameCards = 0;
			int theCard = -1;
			
			for (int j = 0; j<4; j++)
			{
				for (int k = 0; k<4 ; k++)
				{
					if (array1[j] == array2[k])
					{
						nrSameCards++;
						theCard = array1[j];
					}
				}
			}
			
			String out = "";
			
			if (nrSameCards==1)
			{
				out = "Case #" + caseNr + ": " + theCard;
				System.out.println(out);
				output.println(out);
			}
			else if (nrSameCards == 0) 
			{
				out = "Case #" + caseNr + ": Volunteer cheated!";
				System.out.println(out);
				output.println(out);
			}
			else
			{
				out = "Case #" + caseNr + ": Bad magician!";
				System.out.println("Case #" + caseNr + ": Bad magician!");
				output.println(out);
			}
			
			
			
		}//nr of test cases
		output.close();
		
		
	}


}
