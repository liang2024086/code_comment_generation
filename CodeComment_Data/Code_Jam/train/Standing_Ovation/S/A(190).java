package methodEmbedding.Standing_Ovation.S.LYD73;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class A
{

	public static void main(String[] args) throws IOException
	{
		//Scanner in = new Scanner (System.in);
		Scanner in = new Scanner (new File("A-small-attempt1.in"));
		int nTest = in.nextInt();
		in.nextLine();
		
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"A.out")));
		for (int test = 1; test <= nTest; test++)
		{
		
			String people = in.nextLine();
			int maxShy = people.charAt(0) - '0';
			int stand = people.charAt(2) - '0';
			int peopleAdd = 0;
			for (int s = 1; s<=maxShy; s++)
			{
				int pH = people.charAt(s + 2) - '0';
				if (stand < s)
				{
					while (stand < s)
					{
						peopleAdd++;
						stand++;
					}
				}
				stand+= pH;
			}
			
			out.printf("Case #%d: %d%n", test, peopleAdd);
			System.out.printf("Case #%d: %d%n", test, peopleAdd);
			
			
		}
		out.close();
	}

}
