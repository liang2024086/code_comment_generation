package methodEmbedding.Magic_Trick.S.LYD1764;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class QualificationRoundProblem1
{
	public static void main(String[] args)
	{
		int selection1[][] = new int[10][10];
		int selection2[][] = new int[10][10];
		
		try
		{
			FileInputStream fstream = new FileInputStream("pr1_2014_input.txt");
			DataInputStream in      = new DataInputStream(fstream);
			BufferedReader  br      = new BufferedReader(new InputStreamReader(in));
			
			FileWriter fout = new FileWriter("output.txt");
			BufferedWriter out = new BufferedWriter(fout);
			
			int iCases = Integer.parseInt(br.readLine());
			for (int iStep = 0; iStep < iCases; iStep++)
			{
				int iRow1 = Integer.parseInt(br.readLine());

				for (int jStep = 0; jStep < 4; jStep++)
				{
					String strLine = br.readLine();
					String[] numbers = strLine.split(" ");
					
					selection1[jStep][0] = Integer.valueOf(numbers[0]).intValue();
					selection1[jStep][1] = Integer.valueOf(numbers[1]).intValue();
					selection1[jStep][2] = Integer.valueOf(numbers[2]).intValue();
					selection1[jStep][3] = Integer.valueOf(numbers[3]).intValue();
				}
				
				int iRow2 = Integer.parseInt(br.readLine());
				
				for (int jStep = 0; jStep < 4; jStep++)
				{
					String strLine = br.readLine();
					String[] numbers = strLine.split(" ");
					
					selection2[jStep][0] = Integer.valueOf(numbers[0]).intValue();
					selection2[jStep][1] = Integer.valueOf(numbers[1]).intValue();
					selection2[jStep][2] = Integer.valueOf(numbers[2]).intValue();
					selection2[jStep][3] = Integer.valueOf(numbers[3]).intValue();
				}
				
				//< compare lines
				int iFoundNumbers = 0;
				int iFoundNumber = 0;
				
				for (int jStep = 0; jStep < 4; jStep++)
				{
					for (int kStep = 0; kStep < 4; kStep++)
					{
						int iNumber1 = selection1[iRow1 - 1][jStep];
						int iNumber2 = selection2[iRow2 - 1][kStep];
						if ((selection1[iRow1 - 1][jStep] == selection2[iRow2 - 1][kStep]) && (selection1[iRow1 - 1][jStep] != 0))
						{
							iFoundNumbers++;
							iFoundNumber = selection1[iRow1 - 1][jStep];
							selection1[iRow1 - 1][jStep] = 0;
							selection2[iRow2 - 1][kStep] = 0;
						}
					}
				}
				
				if (1 == iFoundNumbers)
				{
					out.write(String.format("Case #%d: %d\n", iStep + 1, iFoundNumber));
				}
				else
				{
					if (0 == iFoundNumbers)
					{
						out.write(String.format("Case #%d: Volunteer cheated!\n", iStep + 1, iFoundNumber));
					}	
					else
					{
						out.write(String.format("Case #%d: Bad magician!\n", iStep + 1, iFoundNumber));
					}
				}
			}
			
			in.close();
			out.close();
		}
		catch (Exception e)
		{
			  System.err.println("Error: " + e.getMessage());
		}
	}
}
