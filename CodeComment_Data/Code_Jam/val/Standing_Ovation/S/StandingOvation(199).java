package methodEmbedding.Standing_Ovation.S.LYD1645;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class StandingOvation
{

	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new FileReader("A-small.in"));
		PrintWriter pw = new PrintWriter("A-Small.out");
		
		int t = Integer.parseInt(br.readLine());
		
		for (int test = 0; test < t; test++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			int sMax = Integer.parseInt(st.nextToken());
			int[] shyness = new int[sMax + 1];
			String s = st.nextToken();
			int totalPeople = 0;
			for (int i = 0; i < sMax + 1; i++)
			{
				shyness[i] = s.charAt(i) - '0';
				totalPeople += shyness[i];
			}
			int curStanding = shyness[0];
			int curShyness = 1;
			int added = 0;
			while (curStanding < totalPeople)
			{
				if (curStanding >= curShyness)
				{
					curStanding += shyness[curShyness];
					curShyness++;
				}
				else
				{
					added += curShyness - curStanding;
					totalPeople += curShyness - curStanding;
					curStanding += curShyness - curStanding;
				}
			}
			
			pw.printf("Case #%d: %d%n", test + 1, added);
		}
		br.close();
		pw.close();
	}
}
