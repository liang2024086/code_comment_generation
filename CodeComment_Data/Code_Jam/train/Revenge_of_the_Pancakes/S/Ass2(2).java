package methodEmbedding.Revenge_of_the_Pancakes.S.LYD855;

import java.io.*;
public class Ass2
{
	public static void main(String [] args)throws Exception 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int len,count,i,j;
		String str;
		for(int test=1 ; test<=t ; test++)
		{
			count = 0;
			str = br.readLine();
			len = str.length()-1;
			for(i=len ; i>=0 ; i--)
			{
				String str1 = "";
				if(str.contains("-"))
				{
					if(str.charAt(i) == '-')
					{
						for(j=0 ; j<=i; j++)
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
				}
			}
			System.out.println("Case #"+test+": "+count);
		}
	}
}
