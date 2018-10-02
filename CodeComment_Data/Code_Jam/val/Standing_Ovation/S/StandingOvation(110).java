package methodEmbedding.Standing_Ovation.S.LYD789;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;




public class StandingOvation {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner inFile = new Scanner (new File("A-small-attempt2.in"));
		PrintStream ps = new PrintStream(new File("out.txt"));
		int noOfCases = inFile.nextInt();
		inFile.nextLine();

		for (int caseNo = 1; caseNo <= noOfCases; caseNo++)
		{
			int maxShyness = inFile.nextInt();
			String audience = inFile.next();
			int newMembers = 0;
			int totalMembers = 0;


			for (int pos = 0; pos < maxShyness; pos++)
			{
				int noOfMembers = audience.charAt(pos);
				noOfMembers = (int)noOfMembers-48;
				totalMembers += noOfMembers;
				while (totalMembers < pos+1 && audience.charAt(pos+1)!= 0)
				{
					totalMembers++;
					newMembers++;
				}

			}


			

			ps.println("Case #"+caseNo+": "+newMembers);


		}

	}


}


