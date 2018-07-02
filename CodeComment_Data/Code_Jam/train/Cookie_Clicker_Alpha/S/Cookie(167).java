package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1135;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Cookie
{

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException
	{
		Scanner scan = new Scanner(new File("B-small-attempt0.in"));
		BufferedWriter out = new BufferedWriter(new FileWriter("q2.txt"));
		
		int t = scan.nextInt();

		for (int i = 0; i < t; i++)
		{
		 double c = scan.nextDouble();
		 double f = scan.nextDouble();
		 double x = scan.nextDouble();
		 
		
		 int k = 0;
		 double time ;
		 double newTime= x/(2+ k*f);
		 
		do
		{
			
			time= newTime;
			k++;
		newTime = x/(2+k*f);
		
		for (int j = 0; j < k; j++)
		{
			newTime += c/(2+j*f);
		}
		
		}
		while (newTime < time);
		

		out.write(String.format("Case #" + (i+1)+ ": %.7f%n", time));
		}

		out.close();
	}
}
