package methodEmbedding.Standing_Ovation.S.LYD1999;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class StandingOvation {

	
	static String[] results;
	
	public static void main(String[] args) throws IOException
	{	
		File f = new File("C:/Users/Noxob/Desktop/at.in");
		BufferedReader sc = new BufferedReader(new FileReader(f));
		String DELIMETER = " ";
		int caseNum = Integer.parseInt(sc.readLine());
		
		results = new String[caseNum];
		
		for(int i = 0; i < caseNum; i++)
		{
			String name = "Case #" + (i+1) +":";
			String input = sc.readLine();
			String[] parameter = input.split(DELIMETER);
			int sMax = Integer.parseInt(parameter[0]);
			String aud = parameter[1];
			Audience a = new Audience(name,aud,sMax);
			results[i] = a.getCaseName() + " " + a.getClaps();
			
		}
		
		for(int x=0; x < results.length; x++)
		{
			System.out.println(results[x]);
		}
	}
}
