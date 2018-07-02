package methodEmbedding.Standing_Ovation.S.LYD1265;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;


public class StandingOvation {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String path= "C:/Users/Ahmed-PC/Downloads/A-small-attempt1.in";
		File textFile = new File(path);		
		//readFile1(textFile);
		FileInputStream fis = new FileInputStream(textFile);		 
		//Construct BufferedReader from InputStreamReader
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
	 
		String line = null;
		String strNoOfLines = br.readLine();
		int noOfLines = Integer.parseInt(strNoOfLines);
		String[] result = new String[noOfLines];
		String[] lineSplit = new String[2]	;	
		int sMax;
		String audience;
		int invited;
		int standing;
		int count=0;
		while ((line = br.readLine()) != null) 
		{
			lineSplit = line.split(" ");
			sMax = Integer.parseInt(lineSplit[0]);
			audience = lineSplit[1];
			invited=0;
			standing=0;
			for(int i=0; i<=sMax; i++)
			{
				if(i<=standing)
				{
					standing = standing + Integer.parseInt(String.valueOf(audience.charAt(i)));
				}
				else
				{
					++invited;
					++standing;
					standing = standing + Integer.parseInt(String.valueOf(audience.charAt(i)));
					}
			}
			result[count]= "Case #"+ (count+1) +": "+ invited +"\n";
			++count;
		}
		for(String i : result)
		{
			System.out.println(i);
		}
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
	              new FileOutputStream("A-small-attempt1.out"), "utf-8"))) {
			for(String i : result)
			{
				writer.write(i);
				
			}
		}
	}

}
