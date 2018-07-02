package methodEmbedding.Counting_Sheep.S.LYD274;

import java.util.HashSet;
import java.util.Scanner;


public class Main
{
	
		
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int cases=1;cases<=T;cases++)
		{
			int n = sc.nextInt();
			if(n==0)
			{
				System.out.println("Case #"+cases+": INSOMNIA");
				continue;
			}
			HashSet<Long> list = new HashSet<Long>();
			
			
			for(int i=1;;i++)
			{
				long t = n*i;
				long out = t;
				list.add(t%10);
				while(t>=10)
				{
					t /= 10;
					list.add(t%10);
				}
				//System.out.println(list);
				if(list.size()==10)
				{
					System.out.println("Case #"+cases+": "+out);
					break;
				}
				
			}
			
			
			
		}
		
	}

}
