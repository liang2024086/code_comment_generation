package methodEmbedding.Cookie_Clicker_Alpha.S.LYD718;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;


public class CookieClickerAlpha 
{
	public static void main(String[] args) 
	{
		BufferedReader bufferedReader = null;
		Integer noOfTestCases;
		String[] rowAsString;
		DecimalFormat decimalFormat = new DecimalFormat("#.0000000");
		
		try
		{
			bufferedReader = new BufferedReader(new FileReader("/Users/alexandrubogdanradu/Dropbox/Java Projects/GoogleCodeJam/src/input.txt"));
			
			File outputFile = new File("/Users/alexandrubogdanradu/Dropbox/Java Projects/GoogleCodeJam/src/output.txt");
			if (!outputFile.exists()) 
			{
				outputFile.createNewFile();
			}
			
			FileWriter fileWriter = new FileWriter(outputFile.getAbsoluteFile());
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			
			noOfTestCases = Integer.parseInt(bufferedReader.readLine());
			String stringCurrentLine;
			
			for(int i = 1; i <= noOfTestCases; i++) 
			{
				Double farmCost, extraSpeed, objective, totalTime = 0.0, speed = 2.0;	
				
				stringCurrentLine = bufferedReader.readLine();
				rowAsString = stringCurrentLine.split(" ");
				farmCost = Double.parseDouble(rowAsString[0]);
				extraSpeed = Double.parseDouble(rowAsString[1]);
				objective = Double.parseDouble(rowAsString[2]);
								
				while (objective/speed > (farmCost/speed + objective/(speed + extraSpeed)))
				{
					totalTime += farmCost/speed;
					speed += extraSpeed;				
				}
				totalTime += objective/speed;
				bufferedWriter.write("Case #" + i + ": " + decimalFormat.format(totalTime) + "\n");
			
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
