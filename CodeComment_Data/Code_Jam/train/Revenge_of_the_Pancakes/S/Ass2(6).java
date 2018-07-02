package methodEmbedding.Revenge_of_the_Pancakes.S.LYD697;

import java.io.*;

public class Ass2
{
	public static void main(String [] args)throws Exception 
	{
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(read.readLine());
		
		for(int test=1 ; test<=t ; test++)
		{
			int count = 0;
			String str = read.readLine();
			
			
			int len = str.length()-1;
			for(int i=len ; i>=0 ; i--)
			{
				String str1 = "";
				if(str.contains("-"))
				{
					if(str.charAt(i) == '-')
					{
						for(int j=0 ; j<=i; j++)
						{
							
							if(str.charAt(j) == '-')
								str1 += "+";
							else
								str1 += "-";
						}
						str1 += str.substring(i,len);
						str = str1;
						count++;
						len--;
					}
					//System.out.println(str);
				}
			}
			System.out.println("Case #"+test+": "+count);

		}
	}
}
