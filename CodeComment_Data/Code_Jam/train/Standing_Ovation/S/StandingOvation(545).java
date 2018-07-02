package methodEmbedding.Standing_Ovation.S.LYD1553;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StandingOvation
{

	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(new File("A-small-attempt1.in"));
		//Scanner in = new Scanner(new File("in1.txt"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"out1.txt")));

		int noOfTests = in.nextInt();
		for (int test = 1; test <= noOfTests; test++)
		{
			int maxShy = in.nextInt();
			String people = in.next();

			int noOfPeople = 0;
			int peopleNeeded = 0;
			// Go through the people
			for (int i = 0; i <= maxShy; i++)
			{
				if (noOfPeople + peopleNeeded < i
						&& people.charAt(i) - '0' != 0)
					peopleNeeded += i - (noOfPeople + peopleNeeded);
				noOfPeople += people.charAt(i) - '0';
			}

			out.println("Case #" + test + ": " + peopleNeeded);
		}
		out.close();
		System.exit(0);
	}
}
