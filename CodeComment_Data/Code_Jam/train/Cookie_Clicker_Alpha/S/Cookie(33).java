package methodEmbedding.Cookie_Clicker_Alpha.S.LYD342;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Cookie {
	static Scanner sc;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new FileReader(args[0]));
		int T = Integer.parseInt(in.readLine());
		//int T = 1;
		for(int t = 1; t<=T;t++)
		{
			String line = in.readLine();
			//String line = "500.0 4.0 2000.0";
			String[] token = line.split("\\s");
			double C = Double.parseDouble(token[0]);
			double F = Double.parseDouble(token[1]);
			double X = Double.parseDouble(token[2]);
			double time = 0;
			double cookie = 0;
			double rate = 2;
			int i =1;
			double timePrev = 0;
			double minTime = 0;
			do
			{
				time = 0;
				rate = 2;
				for(int j = 0; j<X/C - i;j++)
				{
					time = time + C/rate;
					rate = rate + F;
				}
				time = time + X/rate;
				if(minTime==0 || time < minTime)
				{
					minTime = time;
				}
				else
				{
					break;
				}
				//System.out.println(time);

				i++;
			}while(i<X/C+1);
			String op = String.valueOf(minTime);
			System.out.println("Case #"+t+": "+op);
		}
	}
}
