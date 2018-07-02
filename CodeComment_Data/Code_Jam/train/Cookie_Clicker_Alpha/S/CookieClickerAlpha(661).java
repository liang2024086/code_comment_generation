package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1548;

import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;


public class CookieClickerAlpha {

	public static void main(String[] args) throws Exception
	{
		String path = "C:\\Users\\Ziming\\Downloads\\";
		String input = path + "B-small-attempt0.in";
		String output = path + "B.out";
		Scanner scanner = new Scanner(new FileReader(input));
		PrintWriter writer = new PrintWriter(output);
		int T = scanner.nextInt();
		scanner.nextLine();
		for (int i=0;i<T;i++)
		{
			writer.print("Case #" + (i+1) + ": ");
			double C = scanner.nextDouble();
			double F = scanner.nextDouble();
			double X = scanner.nextDouble();
			System.out.println(C + " " + F + " " + X);
			double V = (X-C)*F/C;
			double t = 0;
			if (V<=2)
				t = X / 2;
			else {
				double v = 2;
				while (v<V)
				{
					t += C / v;
					v += F;
				}
				t += X/v;
			}
			writer.print(t);
			writer.println();
		}
		writer.flush();
		writer.close();
		scanner.close();
	}
}
