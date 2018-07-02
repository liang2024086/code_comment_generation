package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1158;

import java.util.Scanner;

class Second
{
	public static void main(String[] args)
	{
		Scanner inp = new Scanner(System.in);
		int t = inp.nextInt();
		
		for(int test=1;test<=t;test++)
		{
			String  str = inp.next();
			StringBuffer sb = new StringBuffer(str);
			int len = str.length();
			int count = 0,i,j,k,off=1;
			
				
				for(i=len-1;i>=0;i--)
				{
					if(sb.charAt(i) == '-')
					{
						if(sb.charAt(0) == '+')
						{
							
							for(k=0;sb.charAt(k)=='+';k++)
								sb.setCharAt(k,'-');
							count++;
						}
						String temp = sb.substring(0,i+1);
						for(j=i,k=0;j>=0;j--,k++)
						{
							if(temp.charAt(j) == '-')
								sb.setCharAt(k,'+');
							else
								sb.setCharAt(k,'-');
						}
						if(k!=0)
							count++;
					}
					//System.out.println(sb.toString()+"\n\n");
				}
			
			System.out.println("Case #" + test + ": " + count);
		}
	}
	
}
