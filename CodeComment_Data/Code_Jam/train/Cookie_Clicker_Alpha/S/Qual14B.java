package methodEmbedding.Cookie_Clicker_Alpha.S.LYD596;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Qual14B {

	public static void main(String[] args) throws Exception {
		BufferedReader inRaw = new BufferedReader(new FileReader("B.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("B.out")));
		int nCases = Integer.parseInt(inRaw.readLine());
		for(int i = 0; i < nCases; i++)
		{
			StringTokenizer in = new StringTokenizer(inRaw.readLine());
			double farmCost = Double.parseDouble(in.nextToken()), farmGain = Double.parseDouble(in.nextToken()), goal = Double.parseDouble(in.nextToken());
			double time = 0, rate = 2d;
			while(true)
			{
				if(goal / rate <= farmCost / rate + goal / (rate + farmGain))
				{
					time += goal / rate;
					break;
				}else
				{
					time += farmCost / rate;
					rate += farmGain;
				}
			}
			out.println("Case #" + (i+1) + ": " + time);
		}
		inRaw.close();
		out.close();
	}
}
