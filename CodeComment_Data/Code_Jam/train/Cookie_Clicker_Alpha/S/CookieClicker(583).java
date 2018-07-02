package methodEmbedding.Cookie_Clicker_Alpha.S.LYD789;


import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CookieClicker {
	
	public static void main(String[] args) throws FileNotFoundException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Taghi\\Downloads\\B-small-attempt0.in");
		DataInputStream in2 = new DataInputStream(file);
		Scanner in = new Scanner(new InputStreamReader(in2));
		int numberOfTestCases = in.nextInt();
		for (int i=0;i<numberOfTestCases; i++)
		{
			double c = in.nextDouble();
			double f = in.nextDouble();
			double x = in.nextDouble();
			double startCookie = 0.0;
			// We have to compute expected time steps for both first and second rates and see if it makes sense to open the factory
			double firstRate = 2.0;
			double secondRate = 2.0 + f;
			double first = 0.0;
			double second = 0.0;
			boolean decision = true;
			int hits = 0;
			while (decision)
			{
				first = 0.0;
				second = 0.0;
				// Computations
				for (double k=2;k<firstRate;k+=f)
				{
					first += c/k;
					second += c/k;
				}
				second += c/(secondRate - f);
				
				first += x/firstRate;
				second += x/secondRate;
				
				if (first < second)
				{
					decision = false;
				}
				else
				{
					firstRate = secondRate;
					secondRate += f;
				}
			}
			System.out.println("Case #" + (i+1) + ": " +first);
		}
	}

}
