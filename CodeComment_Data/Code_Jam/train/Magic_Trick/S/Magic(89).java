package methodEmbedding.Magic_Trick.S.LYD1875;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;


public class Magic
{
	public static void main(String[] args) throws IOException 
	{
		my_file_reader r = new my_file_reader("inp.in");
		my_file_writer w = new my_file_writer("out");
		
		
		int testCases = Integer.parseInt(r.getFirstLine());
		for (int i = 0; i < testCases; i++) 
		{
			int ans1 = Integer.parseInt(r.readLine());
			int[][] grid1 = new int[4][4];

			for (int j = 0; j < 4; j++) 
			{
				String temp = r.readLine();
				String[] tempInt = temp.split(" ");
				for (int k = 0; k < 4; k++) 
				{
					grid1[j][k] = Integer.parseInt(tempInt[k]);
				}
			}
			
			
			int ans2 = Integer.parseInt(r.readLine());
			int[][] grid2 = new int[4][4];

			
			for (int j = 0; j < 4; j++) 
			{
				String temp = r.readLine();
				String[] tempInt = temp.split(" ");
				for (int k = 0; k < 4; k++) 
				{
					grid2[j][k] = Integer.parseInt(tempInt[k]);
				}
			}
			String finalAns = "";
			
			
			ArrayList<Integer> tempList  = new ArrayList<>();
			for (int j = 0; j < 4; j++) 
			{
				tempList.add(grid1[ans1-1][j]);
			}
			
			int matchCount = 0;
			
			for (int j = 0; j < 4; j++)
			{
				if(  tempList.contains(grid2[ans2-1][j]))
				{
					matchCount++;
				}
			}
			
			if(matchCount == 0)
			{
				finalAns = "Volunteer cheated!";
			}
			else if(matchCount == 1)
			{
				finalAns = matchCount+"";
			}
			else
			{
				finalAns = "Bad magician!";
			}
			
			w.writeLine("Case #" + i  + ": " + finalAns + "\n");
		}
		
		r.close();
		w.close();
	}
}
