package methodEmbedding.Cookie_Clicker_Alpha.S.LYD43;


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int numCases;
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		numCases = Integer.parseInt(b.readLine());
		String[] constants = new String[3];
		for (int i = 0; i < numCases; i++)
		{
			int caseNumber = i + 1;
			constants = (b.readLine()).split(" ");
			double C = Double.parseDouble(constants[0]);
			double F = Double.parseDouble(constants[1]);
			double X = Double.parseDouble(constants[2]);
			
			double XF = X * F;
			double tC = 2 * C;
			double FC = F * C;
			
			double topHalf = XF - tC;
			
			double n = Math.ceil((topHalf / FC) - 1);
			if (n < 0)
				n = 0;
			double time = 0;
			for (int count = 0; count < n; count++)
			{
				double addToTime = C / (2 + count * F);
				time += addToTime;
			}
			
			time += X / (2 + n * F);
			
			System.out.print("Case #" + caseNumber + ": ");
			System.out.format("%.7f%n", time);
		}
	}
}
