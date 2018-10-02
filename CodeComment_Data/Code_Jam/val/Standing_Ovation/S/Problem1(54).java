package methodEmbedding.Standing_Ovation.S.LYD1709;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;


public class Problem1 {
	public static void main(String [] args) throws IOException
	{
		Scanner s = new Scanner(new File("input.txt"));
		PrintStream p = new PrintStream(new File("output.txt"));

		int T = Integer.parseInt(s.nextLine());
		for(int i = 0; i < T; i++)
		{
			String line = s.nextLine();
			String[] values = line.split("\\s+");
			int smax = Integer.parseInt(values[0]);
			String smaxp1 = values[1];
			
			int numPeople=0;
			int count = 0;
			for(int j=0; j<=smax;j++)
			{
				int si = Character.getNumericValue(smaxp1.charAt(j));
				if(j<=numPeople)
					numPeople+=si;
				else
				{
					int inc = j-numPeople;
					count+=inc;
					numPeople+=inc+si;
				}
			}
			String output = "Case #"+(i+1)+": "+count;
			System.out.println(output);
			p.println(output);
		}
		s.close();
		p.flush();
		p.close();
	}
}
