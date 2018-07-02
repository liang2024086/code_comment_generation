package methodEmbedding.Standing_Ovation.S.LYD219;

import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
public class CodeJam2015A {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		Scanner read = new Scanner(new File("input.txt"));
		PrintWriter write = new PrintWriter("output.txt");
		int itterations = Integer.parseInt(read.nextLine());
		
		for (int i = 0; i < itterations; i++) 
		{
			int casesOfShyness = read.nextInt() + 1;
			String input = read.next();
			int friends = 0;
			int acumuSum = (int) input.charAt(0) - 48;
			
			for (int j = 1; j < casesOfShyness; j++) 
			{
				int currentS = (int) input.charAt(j) - 48;
				if(acumuSum >= j)
				{
					acumuSum += currentS;
				}
				else
				{
					int temp = j - acumuSum;
					acumuSum += temp;
					friends += temp;
					acumuSum += currentS;
				}
			}
			write.println("Case #" + (i+1) + ": " + friends);
		}
		write.close();
		read.close();
	}
}
//I am using a few of the Java standard libraries - including java.io and java.util
