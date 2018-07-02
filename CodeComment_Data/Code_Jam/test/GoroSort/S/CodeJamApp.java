package method_all.GoroSort.S.LYD40;


import java.util.Scanner;
import java.io.*;

public class CodeJamApp 
{
	public static void main(String[] args)throws Throwable
	{
		if (args.length != 2)
		{
			System.out.println("2 arguments should be passed: an input file and an output file.");
			return;
		}
		
		Scanner in = new Scanner(new File(args[0]));
		PrintStream out = new PrintStream(new File(args[1]));
		
		GoroSort solver = new GoroSort(in);
		
		int t = in.nextInt();
		in.nextLine();
		
		for (int c = 1; c <= t; c++)
		{
			out.print("Case #");
			out.print(c);
			out.print(": ");
			out.println(solver.getSolution());
		}
		
	}
}
