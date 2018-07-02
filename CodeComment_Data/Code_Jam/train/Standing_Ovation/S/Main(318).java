package methodEmbedding.Standing_Ovation.S.LYD43;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main 
{
	public static void main(String[] args)
	{
		BufferedReader br = null;
		try
		{
			String currentLine = "";
			
			br = new BufferedReader(new FileReader(System.getProperty("user.dir")+"\\Input\\input.in"));
			while ((currentLine = br.readLine()) != null) {
				int number = Integer.parseInt(currentLine);
				int caseNumber = 1;
				if(number>0)
				{
					File file = new File(System.getProperty("user.dir")+"\\Output\\output.in");
					if (!file.exists()) {
						file.createNewFile();
					}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					while(number>0)
					{
						//create array
						String[] caso = br.readLine().split(" ");						 
						int[] audience = new int[Integer.parseInt(caso[0])+1];
						for (int i = 0; i < caso[1].length(); i++) 
						{
							audience[i]=Character.getNumericValue(caso[1].charAt(i));							
						}
						int friendsCount =0;
						int audienceCount =0;
						
						for (int i = 0; i < audience.length; i++) 
						{
							if(audienceCount<i)
							{
								int sumatoria = i-audienceCount;
								friendsCount+=sumatoria;
								audienceCount+=sumatoria+audience[i];
							}
							else
							{
								audienceCount+=audience[i];
							}
						}
						bw.write("Case #"+caseNumber+": "+friendsCount+"\n");
						number--;
						caseNumber++;
					}
					bw.close();
				}
			}
		}
		catch (Exception e)
		{
			System.out.println("exception: "+ e.getMessage());
		}
		System.out.println("finnished");

	}

}
