package methodEmbedding.Magic_Trick.S.LYD1382;

import java.util.*;
import java.io.*;
import java.lang.reflect.Array;

public class A
{
	public static void main(String[] args) throws Exception 
	{
		File infile = new File("C:\\Users\\dq\\workspace\\CJ14Prelim\\src\\A-small-attempt0.in");
		File outfile = new File("C:\\Users\\dq\\workspace\\CJ14Prelim\\src\\A-output.txt");
		BufferedReader br = new BufferedReader(new FileReader(infile));
		BufferedWriter bw = new BufferedWriter(new FileWriter(outfile));
		String s;
		String[] splits;
		int cases = Integer.parseInt(br.readLine());
		for(int i = 0; i < cases; i++)
		{
			bw.write("Case #" + (i+1) + ": ");
			
			int N = Integer.parseInt(br.readLine());
			HashSet<Integer> row1 = new HashSet<Integer>();
			for(int j = 0; j < 4; j++)
			{
				s = br.readLine();
				splits = s.split(" ");
				if(j != N - 1)
					continue;
				for(String str : splits)
				{
					row1.add(Integer.parseInt(str));
				}
			}
			
			N = Integer.parseInt(br.readLine());
			HashSet<Integer> row2 = new HashSet<Integer>();
			for(int j = 0; j < 4; j++)
			{
				s = br.readLine();
				splits = s.split(" ");
				if(j != N - 1)
					continue;
				for(String str : splits)
				{
					row2.add(Integer.parseInt(str));
				}
			}
			
			row1.retainAll(row2);
			
			//WRITE ANSWER HERE
			if(row1.size() == 0)
				bw.write("Volunteer cheated!");
			else if(row1.size() == 1)
				bw.write(row1.toArray()[0].toString());
			else
				bw.write("Bad magician!");
			if((i + 1) < cases)
			{
				bw.write("\n");
			}
		}
		bw.flush();
	}

}
