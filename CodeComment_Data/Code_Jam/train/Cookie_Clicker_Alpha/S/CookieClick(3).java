package methodEmbedding.Cookie_Clicker_Alpha.S.LYD860;

import java.text.DecimalFormat;
import java.util.Scanner;
public class CookieClick {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inputs = scan.nextInt();
		DecimalFormat df = new DecimalFormat("#.0000000");
		for(int i = 0; i < inputs; i++)
		{
			double time = 0;
			double cost = scan.nextFloat();
			double farm = scan.nextFloat();
			double goal = scan.nextFloat();
			double currRate = 2;
			while(cost/currRate + goal/(currRate+farm) < goal/currRate)
			{
				time += cost/currRate;
				currRate += farm;
			}
			time += goal/currRate;
			System.out.println("Case #" + (i + 1) + ": " + df.format(time));
		}
	}
}
