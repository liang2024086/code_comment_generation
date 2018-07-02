package methodEmbedding.Cookie_Clicker_Alpha.S.LYD5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;


public class Question2 
{
	public static void main(String[] args)
	{
		try 
		{
			BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\CodeJam\\Practice\\B-small-attempt0.in"));
			String line;
			boolean firstline = true;
			
			
			File file = new File("C:\\CodeJam\\Practice\\output2.txt");
			 
			// if file doesnt exists, then create it
			if (!file.exists()) 
			{
				file.createNewFile();
			}
			
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			int testCases = Integer.parseInt(bufferedReader.readLine());
			int caseNo = 1;
			while (caseNo<=testCases) 
			{
				
				line = (bufferedReader.readLine());
				StringTokenizer st = new StringTokenizer(line);
				double  c = Double.parseDouble(st.nextToken());
				double  f = Double.parseDouble(st.nextToken());
				double  x = Double.parseDouble(st.nextToken());
				double rate = 2;
				double time = 0;
				
				while(true)
				{
					time = time + c/rate;
					double timetoresult = (x - c)/rate;
					double timetofarm  = x/(rate+f);
					
					if(timetoresult<timetofarm)
					{
						time += timetoresult;
						break; 
					}
					else
					{
						rate = rate + f;
					}
					
				}
				
				bw.write("Case #"+caseNo+": "+time);
				bw.newLine();	
				System.out.println("Case #"+caseNo+": "+time);
					caseNo++;
				
			}
			
			bw.close();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		} 
	}
	
}
