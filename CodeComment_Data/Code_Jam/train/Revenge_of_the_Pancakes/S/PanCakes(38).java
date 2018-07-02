package methodEmbedding.Revenge_of_the_Pancakes.S.LYD206;

import java.io.*;
public class PanCakes
{
	public static void main(String args[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int count, len, i, j, no = 1;
		String pancakes[];
		pancakes = new String[t];
		for(j=0;j<t;j++){
			pancakes[j] = br.readLine();
		}
		for(j=0;j<t;j++)
		{
			len = pancakes[j].length();
			count = 0;
			for(i=0;i<len-1;i++)
			{
				if(pancakes[j].charAt(i)!= pancakes[j].charAt(i + 1))
					count++;
			}
			if((pancakes[j].charAt(0)== '+' && pancakes[j].charAt(len-1)== '-') || (pancakes[j].charAt(0)== '-' && pancakes[j].charAt(len-1)== '-'))
				count++;	
			System.out.println("Case #"+no+": "+count);
			no++;
		}
	}
}
