package methodEmbedding.Cookie_Clicker_Alpha.S.LYD264;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class tester {

	public static void main(String[] args) {

		double multiplier = 0.02;
		double farm = 500.0;
		double rate = 4.0;
		double win = 2000.0;
		int counter = 1;
		int instances = 0;
		double time1 = 0;
		double time2 = 0;
		double var = 0;
		
		try
		{
			FileReader file = new FileReader("B-small-attempt3.in");
			Scanner input = new Scanner(file);
			instances = input.nextInt();
			
			for (int i = 0; i < instances; i++)
			{
				farm = input.nextDouble();
				rate = input.nextDouble()/100;
				win = input.nextDouble();
				
				time1 = win/multiplier;
				for (;;)
				{
					var = var + (farm/multiplier);
					time2=var+(win/(multiplier+rate));
					
					if (time2 < time1)
					{
						time1 = time2;
						multiplier+=rate;
					}
					else break;
				}
				
				time1=time1/100;
				time1 = (double)Math.round(time1 * 10000000)/10000000;
				System.out.print("Case #" + counter + ": " +time1 +"\n");
				counter++;
				
				var = 0;
				time1=0;
				time2=0;
				multiplier=0.02;
			}
		}
		catch (IOException e) {}
	}
}
