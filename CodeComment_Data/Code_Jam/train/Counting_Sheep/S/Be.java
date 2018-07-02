package methodEmbedding.Counting_Sheep.S.LYD1093;

import java.io.*;
class Be{
	public static void main(String [] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		int n ;
		int j = 1 ;
		while(j <= t)
		{
			boolean flag = true ;
			String ans = new String() ;
			n = Integer.parseInt(br.readLine());
			int check[] = new int[10];
			int m = n ;
			int count = 0;
			
			if(n == 0)
			{
				System.out.println("Case #"+j+": INSOMNIA");
			}
			else
			while(flag)
			{
				
				ans += m +"";
				int i = 0;
				while(ans.length() > i)
				{
					int index = ans.charAt(i)-48 ;
					if(check[index] == 0)
					{
						check[index] = 1 ;
						count ++ ;
						
					}
					if(count == 10)
					{
						flag = false ;
						break;
					}
					i++;
					
				}
				
				m +=n; ;
				
			}
			if(count == 10)
			{
				System.out.println("Case #"+j+": "+(m-n));
			}
			j ++ ;
		}
	}
}
