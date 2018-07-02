package methodEmbedding.Standing_Ovation.S.LYD1693;


import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Standing_Ovation
{
	public static void main(String[] args) throws Exception
	{
		long start = System.nanoTime();
		Scanner in = new Scanner(new File("input.in"));
		PrintWriter outputFile = new PrintWriter(new FileWriter("output.out"));
		int testcases = Integer.parseInt(in.nextLine());
		for (int a = 0; a < testcases; a++)
		{
			String[] t = in.nextLine().split(" ");
			t = Arrays.copyOfRange(t[1].split(""), 1, t[1].length() + 1);
			int totalOvation = 0;
			int toAdd = 0;
			for (int b = 0; b < t.length; b++)
			{
				totalOvation += Integer.parseInt(t[b]);
				if (totalOvation < b + 1)
				{
					toAdd++;
					totalOvation++;
				}		
			}
			outputFile.println("Case #" + (a + 1) + ": " + toAdd);
		}
		
		outputFile.close();
		in.close();
		long end = System.nanoTime();
		System.out.println((double) (end - start) / 1E9);
		
	}
}
