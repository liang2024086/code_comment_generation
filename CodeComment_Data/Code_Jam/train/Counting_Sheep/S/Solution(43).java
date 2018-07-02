package methodEmbedding.Counting_Sheep.S.LYD1659;

import java.io.*;  

public class Solution
{
	public static void main(String []args)throws Exception 
	{
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(read.readLine());
		
		
		
		long test = 1;
		for(int k=0; k<t; k++)
		{
			int [] arr = new int[10];
		
			String line = read.readLine();
			long n = Integer.parseInt(line);
				

			boolean flag=false;
			long last = 0;
			long val;
			for(int i=1 ; i<101 ; i++)
			{
				val = i * n;
				String str = val+"";
				for(int p=0 ; p<str.length() ; p++)
				{
					arr[(int)str.charAt(p)-48]++;
				}
				
				int count=0;
				for(int p=0 ; p<10 ; p++)
				{
					if(arr[p]>0)
					{
						count++;
					}	
					
				}
			
				if(count == 10)
				{
					last = val;
					flag=true;
					break;
				}
			}
			
			if(flag)
			{
				System.out.println("Case #"+test+": "+last);
			}
			else
			{
				System.out.println("Case #"+test+": INSOMNIA");
			}
			test++;
		}
	}
}
