package methodEmbedding.Revenge_of_the_Pancakes.S.LYD738;

import java.io.*;
class codejam3
{
	public static void main(String a[])throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int t= Integer.parseInt(br.readLine());
		int i=1;
		while(i<=t)
		{
			int sum=0,x=0;
			String s=br.readLine();
			String str[]=s.split("[+]+");
			//System.out.println(str.length);
			if(s.charAt(0)=='+' && str.length>0)
				x=str.length-1;
			else
				x=str.length;
			if(s.charAt(0)=='-')
				sum=1 + 2*(x-1);
			else
				sum=2*(x);
			System.out.println("Case #"+i+": "+sum);
			i++;
		}
	}
}
		
