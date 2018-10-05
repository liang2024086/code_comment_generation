package methodEmbedding.Standing_Ovation.S.LYD1897;

import java.io.*;
import java.util.ArrayList;

public class StandingOvation 
{

	public static void main(String[] args) 
	{

		String file = "A-small-attempt0.in";
		String line = null;
		ArrayList<String> lines = new ArrayList<String>();
		
		try
		{
			FileReader fReader = new FileReader(file);
			BufferedReader bReader = new BufferedReader(fReader);
			
			while((line = bReader.readLine()) != null)
			{
				lines.add((String)line);
			}
			for(int i = 1; i < lines.size(); i++)
			{
				String lineInText = lines.get(i);
				int maxShyness = Integer.parseInt(lineInText.substring(0, 1));
				String numberOfPeople = lineInText.substring(2, lineInText.length());
				int numOfPeople = 0;
				while(maxShyness > 0)
				{
					int count = 0;
					for(int j = 0; j < maxShyness; j++)
					{
						count += Integer.parseInt(numberOfPeople.substring(j, j + 1));
					}
					if((maxShyness - count) > 0)
					{
						int increment = maxShyness - count;
						numberOfPeople = String.valueOf(Integer.parseInt(numberOfPeople.substring(0, 1)) + increment) + numberOfPeople.substring(1, numberOfPeople.length());
						numOfPeople += increment;
					}
					maxShyness--;
				}
				System.out.println("Case #" + i +": " + numOfPeople);
			}
			bReader.close();
		}
		catch(FileNotFoundException exception)
		{
			System.out.println("Unable to find file");
		}
		catch(IOException exception)
		{
			exception.printStackTrace();
		}
	}

}
