package methodEmbedding.Magic_Trick.S.LYD460;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class MagicTrick 
{
	public static void main(String[] args) 
	{
		BufferedReader bufferedReader = null;
		Integer noOfTestCases, firstAnswer, secondAnswer;
		String[] rowAsString_A1, rowAsString_A2;
		Integer[] rowAsInteger_A1 = new Integer[4];
		Integer[] rowAsInteger_A2 = new Integer[4];
		try 
		{
			String stringCurrentLine;
			
			bufferedReader = new BufferedReader(new FileReader("/Users/alexandrubogdanradu/Dropbox/Java Projects/GoogleCodeJam/src/input.txt"));
			File outputFile = new File("/Users/alexandrubogdanradu/Dropbox/Java Projects/GoogleCodeJam/src/output.txt");
			if (!outputFile.exists()) 
			{
				outputFile.createNewFile();
			}
			
			FileWriter fileWriter = new FileWriter(outputFile.getAbsoluteFile());
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			
			noOfTestCases = Integer.parseInt(bufferedReader.readLine());
			
			for(int i = 1; i <= noOfTestCases; i++) 
			{
				firstAnswer = Integer.parseInt(bufferedReader.readLine());
				for (int j = 1; j <= 4; j++) 
				{
					stringCurrentLine = bufferedReader.readLine();
					if (j == firstAnswer)
					{
						rowAsString_A1 = stringCurrentLine.split(" ");
						for(int k = 0; k < 4; k++) {
							rowAsInteger_A1[k] = Integer.parseInt(rowAsString_A1[k]);
						}
					}
				}
				
				secondAnswer = Integer.parseInt(bufferedReader.readLine());
				for (int j = 1; j <= 4; j++) 
				{
					stringCurrentLine = bufferedReader.readLine();
					if (j == secondAnswer)
					{
						rowAsString_A2 = stringCurrentLine.split(" ");
						for(int k = 0; k < 4; k++) {
							rowAsInteger_A2[k] = Integer.parseInt(rowAsString_A2[k]);
						}
					}
				}
				
				int counter = 0;
				int magicNumber = 0;
				for (int j = 0; j < 4; j++)
					for (int k = 0; k < 4; k++)
					{
						if (rowAsInteger_A1[j] == rowAsInteger_A2[k]) 
						{
							counter++;
							magicNumber = rowAsInteger_A1[j];
						}
					}
				if (counter == 1) bufferedWriter.write("Case #" + i + ": " + magicNumber + "\n");
				else if (counter == 0) bufferedWriter.write("Case #" + i + ": Volunteer cheated!\n");
				else bufferedWriter.write("Case #" + i + ": Bad magician!\n");
			}		
			
			bufferedWriter.close();
			
		} catch (IOException e) 
		{
			e.printStackTrace();
		} finally 
		{
			try 
			{
				if (bufferedReader != null) bufferedReader.close();	
			} catch (IOException ex) 
			{
				ex.printStackTrace();
			}
		}
	}
}
