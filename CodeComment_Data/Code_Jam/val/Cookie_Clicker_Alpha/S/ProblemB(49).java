package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1350;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class ProblemB {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("test.in"));
		PrintWriter printer = new PrintWriter("output.txt");
		double c = 0, f = 0, x = 0;
		
		int testCasesCount = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < testCasesCount; i++)
		{
			c = Double.parseDouble(sc.next());
			f = Double.parseDouble(sc.next());
			x = Double.parseDouble(sc.next());
			
			double timeFarm = 0;
			double currentTime = Double.MAX_VALUE;
			boolean stop = false;
			
			// We increment the number of farms
			for (int n = 0; !stop; n++)
			{
				if (n > 0)
					timeFarm += c / (2 + (n-1) * f);
				
				double testTime = timeFarm + (x / (2 + n * f));
				stop = testTime > currentTime;
				if (!stop)
					currentTime = testTime;
			}
			
			printer.println("Case #" + (i+1) + ": " + currentTime);
		}
		printer.close();
	}
}
