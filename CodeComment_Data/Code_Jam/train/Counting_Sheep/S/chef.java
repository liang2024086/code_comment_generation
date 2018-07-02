package methodEmbedding.Counting_Sheep.S.LYD1013;

import java.io.*;
import java.util.*;
class O
{
	
	public static void main(String args[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=1;i<=t;i++)
		{
			int n = Integer.parseInt(br.readLine());
			if(n==0)
				System.out.println("Case #"+i+": INSOMNIA");
			else{
				
				int o1=0,o2=0,o3=0,o4=0,o5=0,o6=0,o7=0,o8=0,o9=0,o0=0;
				boolean flag=true;
				long lastNumber=0;
				int count=1;
				
				while(flag)
				{
					long l = n*count;
					String z = ""+l;
					if(z.contains("1"))
						o1=1;
					if(z.contains("2"))
						o2=1;
					if(z.contains("3"))
						o3=1;
					if(z.contains("4"))
						o4=1;
					if(z.contains("5"))
						o5=1;
					if(z.contains("6"))
						o6=1;
					if(z.contains("7"))
						o7=1;
					if(z.contains("8"))
						o8=1;
					if(z.contains("9"))
						o9=1;
					if(z.contains("0"))
						o0=1;
					
					int sum = o1+o2+o3+o4+o5+o6+o7+o8+o9+o0;
					
					if(sum==10)
					{
						flag=false;
						lastNumber=l;
					}
	
					count++;
					
				}
				
				System.out.println("Case #"+i+": "+lastNumber);
				
			}
		}
	}
}
