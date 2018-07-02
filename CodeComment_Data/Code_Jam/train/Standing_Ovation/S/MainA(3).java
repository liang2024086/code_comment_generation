package methodEmbedding.Standing_Ovation.S.LYD2125;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainA
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String[][] contents = new String[T][2];
		
		for(int i=0;i<T;i++)
		{
			contents[i] = br.readLine().split(" ");
		}
		
		for(int i=0;i<T;i++)
		{
			int ans = 0;
			int count = 0;
			int targetLevel = Integer.parseInt(contents[i][0]);
			
			for(int j=0;j<contents[i][1].length();j++)
			{
				int value = Integer.parseInt("" + contents[i][1].charAt(j));
				count += value;
				
				if(count < j + 1)
				{
					ans += (j + 1 - count);
					count = j + 1;
				}
				
				if(j == targetLevel)
					break;
			}
			
			System.out.println("Case #" + (i + 1) + ": " + ans);
		}
	}
}
