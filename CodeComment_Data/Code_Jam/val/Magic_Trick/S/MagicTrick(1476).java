package methodEmbedding.Magic_Trick.S.LYD962;

import java.util.Set;
import java.util.HashSet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MagicTrick
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(in.readLine());
		
		for(int i=0;i<T;i++)
		{
			int rowNum = Integer.parseInt(in.readLine());

			String[] r1 = null;

			for(int j=0;j<4;j++)
			{	
				if(rowNum == j+1)
				{
					r1 = in.readLine().split(" ");
				}
				else
					in.readLine();
			}
			
			Set<String> s = new HashSet<String>();
			
			for(int k=0;k<r1.length;k++)
			{
				s.add(r1[k]);
			}
			
			int rowNum2 = Integer.parseInt(in.readLine());

			String[] r2 = null;

			for(int j=0;j<4;j++)
			{	
				if(rowNum2 == j+1)
				{
					r2 = in.readLine().split(" ");
				}
				else
					in.readLine();
			}
			
			int states = 0;

			int ans = -1;			
			
			for(int k=0;k<r2.length;k++)
			{
				if(s.contains(r2[k]) && states == 1)
				{
					states = 2;
					System.out.println("Case #" + (i+1) + ": Bad magician!");
					break;
				}
				else if(s.contains(r2[k]))
				{
					states = 1;
					ans = Integer.parseInt(r2[k]); 
				}
			}
			
			if(states == 0)
				System.out.println("Case #" + (i+1) + ": Volunteer cheated!");
			else if(states == 1)
				System.out.println("Case #" + (i+1) + ": " + ans);
		}
	}
}
