package methodEmbedding.Counting_Sheep.S.LYD1519;

import java.util.*;
public class sheep
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		for (int k=1;k<=t ;k++ ) 
		{
			int j = 1;
			int ans=0;
			int num = in.nextInt();
			int N = num;
			int[]arr = {0,0,0,0,0,0,0,0,0,0};
			if (num==0) 
			{
				System.out.println("Case #"+k+": INSOMNIA");	
			}
			else
			{
				while(true)
				{
					boolean flag = false;
					int check = N;	
					while(check!=0)
					{
						int tmp = check%10;
						arr[tmp]++;
						check = check/10;
					}
					for (int i=0;i<10 ;i++ ) 
					{
						if (arr[i]==0) 
						{
							flag = true;
							break;		
						}	
					}
					if (flag == true) 
					{
						N = (j+1)*num;
						j++; 
					}
					else if (flag ==false) 
					{
						//success.
						System.out.println("Case #"+k+": "+N);	
						break;
					}
				}
				
			}
		}			
	}	
}
