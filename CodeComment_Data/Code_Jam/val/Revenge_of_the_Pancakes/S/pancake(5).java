package methodEmbedding.Revenge_of_the_Pancakes.S.LYD907;


import java.util.List;
import java.util.ArrayList;
import java.io.*;
import java.util.Map;
import java.util.HashMap;


public class pancake {
	public static void main(String[] args)
	{
		
		try
		{
			BufferedWriter bw = new BufferedWriter(new FileWriter("test.out"));
			BufferedReader br = new BufferedReader(new FileReader("test3.in"));
			
			int T;
			T = Integer.parseInt(br.readLine());
			
			for (int i= 1; i <= T; i++)
			{
				String line = br.readLine();
				char special = line.charAt(line.length() - 1);
				char prev = special;
				int flipCount = 0;
				if(special == '-')
					flipCount++;
				for(int j = line.length() - 2; j >= 0; j--)
				{
					if(line.charAt(j) == prev)
						continue;
					flipCount++;
					prev = line.charAt(j);
				}
				
				
				bw.write("Case #"+ i + ": " + flipCount);
				if(i != T)
					bw.newLine();
				
			}
			bw.close();
			br.close();
			
		}
		catch (Exception ex) 
		{
			System.out.println(ex.getMessage());
		}
	}
}
