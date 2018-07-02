package methodEmbedding.Magic_Trick.S.LYD1438;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Qual14A {

	public static void main(String[] args) throws Exception {
		BufferedReader inRaw = new BufferedReader(new FileReader("A.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("A.out")));
		int nCases = Integer.parseInt(inRaw.readLine());
		for(int i = 0; i < nCases; i++)
		{
			int row = Integer.parseInt(inRaw.readLine());
			for(int r = 1; r < row; r++) inRaw.readLine();
			StringTokenizer in = new StringTokenizer(inRaw.readLine());
			int[] choices = new int[4];
			for(int j = 0; j < 4; j++) choices[j] = Integer.parseInt(in.nextToken());
			for(int r = row + 1; r <= 4; r++) inRaw.readLine();
			
			row = Integer.parseInt(inRaw.readLine());
			for(int r = 1; r < row; r++) inRaw.readLine();
			in = new StringTokenizer(inRaw.readLine());
			int result = -1;
			for(int j = 0; j < 4; j++)
			{
				int cell = Integer.parseInt(in.nextToken());
				if(choices[0] == cell || choices[1] == cell || choices[2] == cell || choices[3] == cell)
				{
					if(result >= 0) result = 0;
					else result = cell;
				}
			}
			for(int r = row + 1; r <= 4; r++) inRaw.readLine();
			
			out.print("Case #" + (i+1) + ": ");
			if(result > 0) out.println(result);
			else if(result == 0) out.println("Bad magician!");
			else out.println("Volunteer cheated!");
		}
		inRaw.close();
		out.close();
	}
}
