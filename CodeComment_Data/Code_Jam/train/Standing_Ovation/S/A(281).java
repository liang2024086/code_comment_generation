package methodEmbedding.Standing_Ovation.S.LYD1341;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class A
{
	public static void main(String[] args) throws IOException
	{
		Scanner scan = new Scanner(new File("test.in"));
		int numCases = scan.nextInt();
		scan.nextLine();
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File("test.out")));
		
		for(int caseN = 1; caseN <= numCases; caseN++)
		{
			scan.nextInt();
			String in = scan.next();
			scan.nextLine();
			
			int sum = 0, needed = 0;
			for(int i = 0; i < in.length(); i++)
			{
				if(sum < i)
				{
					needed += i - sum;
					sum = i;
				}
				sum += in.charAt(i) - '0';
			}
			
			writer.write("Case #" + caseN + ": " + needed + "\n");
		}
		
		scan.close();
		writer.close();
	}
}
