package methodEmbedding.Cookie_Clicker_Alpha.S.LYD45;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Problem
{
	public static void main(String[] args) throws IOException
	{
		Scanner scan = new Scanner(new File("test.in"));
		int numCases = scan.nextInt();
		scan.nextLine();
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File("test.out")));
		
		for(int caseN = 1; caseN <= numCases; caseN++)
		{
			double farm = scan.nextDouble(), rf = scan.nextDouble(), x = scan.nextDouble(), rate = 2;
			int n = (int) Math.ceil((x * rf / farm - rate) / rf - 1);
			double time = x / (rate + Math.max(0, n) * rf);
			for(int i = 0; i < n; i++) time += farm / (rate + i * rf);
			
			writer.write("Case #" + caseN + ": " + time + "\n");
		}
		
		scan.close();
		writer.close();
	}
}
