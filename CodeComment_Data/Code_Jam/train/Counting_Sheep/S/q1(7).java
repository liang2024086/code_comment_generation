package methodEmbedding.Counting_Sheep.S.LYD852;

import java.util.*;
class q1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int i =0;
		for(i =1;i<n+1;i++)
		{	
			int arr[] = new int[10];
			int j = 0;
			for(j = 0;j<10;j++)
			{
				arr[j] = 0;
			}
	
			int k;
			boolean map = true;
			boolean complete = false;
			k = sc.nextInt();
			if(k == 0)
			{
				System.out.println("Case #"+i+": INSOMNIA");
			}
			
			
			else
			{	
				int m = 1;
				int t = k;
				int w = 0;
				while(complete==false)
				{
					m++;
					int r;
 
  				 while (t != 0)
   					{
      					r=t%10;
					arr[r] = 1;
      					t= t/10;
   					}
					
				
				for(int kk=0;kk<10;kk++)
				{
					if(arr[kk] == 0)
					{
						map = false;	
						break;
					}
					if(arr[kk] == 1)
					{
						map = true;
					}
						

				}	
					if(map == true)
					{
						complete = true;
						break;
					}
					else
					{
					t=m*k;
					w = t;
					}		
				}
			System.out.println("Case #"+i+": "+w);
			}
			
		}
	

	}
}














