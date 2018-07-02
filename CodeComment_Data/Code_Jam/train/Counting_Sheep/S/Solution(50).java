package methodEmbedding.Counting_Sheep.S.LYD648;

import java.util.*;

public class Solution
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N, k, flag;
		int[] arr;
		String num = "";

		for(int i = 0; i<T; i++)
		{
			k = 1;
			N = sc.nextInt();
			
			arr = new int[10];
			

			while(true)
			{
				num = k*N+"";
				flag = 0;
				for(int j = 0; j<num.length(); j++)
				{
					arr[Integer.parseInt(""+num.charAt(j))]++;
				}
				for(int j = 0; j<10; j++)
				{
					if(arr[j]<=0)
					{
						flag = 1;
						break;
					}
				}
				if(flag == 0)
				{
					System.out.println("Case #"+(i+1)+": "+num);
					
					break;
				}
				k++;
				if(k>300 || N>500000000)
				{
					System.out.println("Case #"+(i+1)+": INSOMNIA");
					break;
				}
			}
		}
	}

}
