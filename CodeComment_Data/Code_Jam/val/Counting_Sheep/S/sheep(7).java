package methodEmbedding.Counting_Sheep.S.LYD1146;


import java.util.List;
import java.util.ArrayList;
import java.io.*;
import java.util.Map;
import java.util.HashMap;


public class sheep {
	public static void main(String[] args)
	{
		
		try
		{
			BufferedWriter bw = new BufferedWriter(new FileWriter("test.out"));
			BufferedReader br = new BufferedReader(new FileReader("test1.in"));
			
			int T, N;
			boolean[] digitSeen;
			T = Integer.parseInt(br.readLine());
			
			for (int i= 1; i <= T; i++)
			{
				N = Integer.parseInt(br.readLine());
				int saveN = N;
				digitSeen = new boolean[10];
				
				if(N == 0)
				{
					bw.write("Case #" + i+ ": INSOMNIA");
					if(i != T)
						bw.newLine();
					continue;
				}
				int g = 1;
				while(true)
				{
				
					while(N > 0)
					{
						int digit = N % 10;
						if(!digitSeen[digit])
							digitSeen[digit] = true;
						
						N = (N - N % 10) / 10;
					}
					
					boolean flag = true;
					
					for(int k = 0; k < 10; k++)
					{
						if(!digitSeen[k])
						{
							flag = false;
							break;
						}
					}
					
					if(flag)
						break;
					g++;
					N = saveN * g;
				}
				
				
				bw.write("Case #"+ i + ": " + saveN * g);
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
