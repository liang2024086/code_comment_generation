package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1346;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class CookieCutterAlpha {

	public static void main(String[] args) {
		Scanner input =null;

		try {
			input = new Scanner(new File("input.in"));

			int T = input.nextInt();

			for (int i=1;i<=T;i++)
			{
				System.out.print("Case #"+i+":");
				double C = input.nextDouble();
				double F = input.nextDouble();
				double X = input.nextDouble();

				double timeTaken = 0;

				double currRate = 2;//start rate

				while (true)
				{
					double timeToBuy = C/currRate;
					double timeToReachXWith = timeToBuy + X/(currRate+F);
					if (timeToReachXWith>(X/currRate))
					{
						timeTaken+=X/currRate;
						break;
					}
					else//We buy a new farm
					{
						timeTaken+=timeToBuy;
						currRate+=F;
					}
				}
				System.out.println(" "+timeTaken);

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
