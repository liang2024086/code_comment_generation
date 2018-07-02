package methodEmbedding.Cookie_Clicker_Alpha.S.LYD25;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Main1
{

public static void main(String args[]) throws IOException
	{

BufferedReader br = new BufferedReader(new FileReader("input.txt"));

int T = Integer.parseInt(br.readLine());

File file = new File("output.txt");
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
		
		for(int t=1;t<=T;t++)
		{
	
		
		
		String str[] = br.readLine().split(" ");
		
		double c = Double.parseDouble(str[0]);
		double f = Double.parseDouble(str[1]);
		double x = Double.parseDouble(str[2]);
		

		double cbest = x/2.0;
		double rate = 2;
		double tt = 0;

		while(true)
			{
			double time = (c/rate) + (x/(rate+f)) + tt;
			if(time<=cbest)
				{
				cbest = time;
				tt = tt + (c/rate);
				rate = rate + f;
				}
			else
				break;
			}

		bw.write("Case #"+t+": "+String.format("%.7f",cbest));
		
		bw.newLine();

		}

	bw.close();

	}

}
