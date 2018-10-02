package methodEmbedding.Standing_Ovation.S.LYD979;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 @Author : CHIMA VICTOR
 *
 */

public class StandingOvation 
{

	public final static String PROBLEM_NAME = "StandingOvation";
	public final static String WORK_DIR = "D:\\COMPETITIONS\\CodeJam\\" + PROBLEM_NAME + "\\";
	
	public static void main(String[] args) throws IOException 
	{

		Scanner sc = new Scanner(new FileReader(WORK_DIR + "A-small-attempt0.in"));
		PrintWriter pw = new PrintWriter(new FileWriter(WORK_DIR + "output.out"));
		
		int nbTestCases = sc.nextInt();
		for (int i = 1; i <= nbTestCases; i++) 
		{
			int smax = sc.nextInt(), minNbFriends = 0;
			String shyness = sc.next();
			int n = Integer.valueOf(shyness.charAt(0) + ""), x = 0;
			for (int j = 1; j <= smax; j++)
			{
				x = j - n;
				if (x > 0)
				{
					minNbFriends += x;
					n += x;
				}
				n += Integer.valueOf(shyness.charAt(j) + "");
			}
			pw.println("Case #" + i + ": " + minNbFriends);
		}
		pw.flush();
		pw.close();
		sc.close();
	}

}
