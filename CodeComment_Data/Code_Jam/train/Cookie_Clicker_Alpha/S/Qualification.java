package methodEmbedding.Cookie_Clicker_Alpha.S.LYD404;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


@SuppressWarnings("unused")
public class Qualification
{

	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner in = new Scanner(new File("B-small-attempt0.in"));
		PrintWriter out = new PrintWriter("B-small-attempt0.out");
		
		int T = in.nextInt();
		
		for (int i = 1; i <= T; i++)
		{
			out.print("Case #"+ i +": ");
			
			double totalTime = 0;
			double cookieRate = 2;
			
			double C, F, X;
			
			C = Double.parseDouble(in.next());//nextDouble doesn't work
			F = Double.parseDouble(in.next());
			X = Double.parseDouble(in.next());
			
			do
			{
				if (C/cookieRate + X/(cookieRate+F) > X/cookieRate)
				{
					totalTime += X/cookieRate;
					break;
				}
				else
				{
					totalTime += C/cookieRate;
					cookieRate += F;
				}
			}while (true);
			
			out.println(String.format("%.7f", totalTime));
		}
		
		in.close();
		out.close();
	}

}
