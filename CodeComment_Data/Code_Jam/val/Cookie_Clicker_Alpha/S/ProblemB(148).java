package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1476;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.util.Scanner;


public class ProblemB {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		
		// Open input and output files
		Scanner scanner = new Scanner(new FileReader ("input/" + args[0]));
		PrintWriter writer = new PrintWriter("output/" +args[1], "UTF-8");
		
		// Variables
		int T; // number of test cases
		double farm; // number of cookies to build farm
		double nfarm; // number of farms
		double rate = 2; // cookies/second
		double extra; // extra cookies;
		double goal; // goal number
		double mintime;
		double time;
		boolean found = false;
		
		// Printing format
		DecimalFormat format = new DecimalFormat("###.#######");
		
		// Solution
		T = scanner.nextInt();
		for(int i = 0; i < T; i++)
		{
			found = false;
			time = 0;
			farm = scanner.nextDouble();
			extra = scanner.nextDouble();
			goal = scanner.nextDouble();
			//System.out.printf("%s, %s, %s\n", format.format(farm), format.format(extra), format.format(goal));
			
			nfarm = 0;
			mintime = goal / rate;
			//System.out.println(format.format(mintime));
			while(!found)
			{
				nfarm++;
				time = 0;
				for(int j = 0; j < nfarm; j++)
				{
					time += farm / (rate + (extra * j));
				}
				time += goal / (rate + (extra * nfarm));
				System.out.println(format.format(time));
				if(mintime > time)
				{
					mintime = time;
				}
				else if(mintime < time)
				{
					found = true;
				}
			}
			
			String output = format.format(mintime);
			writer.printf("Case #%d: %s\n", i+1, output);	
			
			//System.out.println();
		}
		
		// Close input and output file
		scanner.close();
		writer.close();
	}
}
