package methodEmbedding.Magic_Trick.S.LYD1040;


import java.io.BufferedReader;
import java.io.IOException;

import lib.IO;

public class MagicTrick {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		IO io = new IO("/home/preetam/workspace/CodeJam/files/year2014/qualification/problem_a/A-small-attempt1.in");
		int t = Integer.parseInt(io.read());
		for(int i = 1; i <= t; i++)
		{
			int r1 = Integer.parseInt(io.read());
			String case1[] = null, case2[] = null;
			for(int j = 1; j <= 4; j++)
			{
				if(j == r1)
				{
					case1 = io.read().split(" "); 
				}
				else io.read();				
			}
			int r2 = Integer.parseInt(io.read());
			for(int j = 1; j <= 4; j++)
			{
				if(j == r2)
				{
					case2 = io.read().split(" "); 
				}
				else io.read();				
			}
			int count = 0;
			String match="";
			for(int j = 0; j < 4; j++)
			{
				for(int k = 0; k < 4; k++)
				{
					if(case1[j].equals(case2[k]))
					{
					
						match = case1[j];
						count++;
		//				System.out.println(case1[j]+" "+case2[j]+" "+match+" "+count+" "+i);
					}
				}
			}
			if(count == 0)
				io.write(i, "Volunteer cheated!"+"\n");
			else if(count == 1)	
				io.write(i, match+"\n");
			else
				io.write(i, "Bad magician!"+"\n");
		}
		io.close();
	}

}
