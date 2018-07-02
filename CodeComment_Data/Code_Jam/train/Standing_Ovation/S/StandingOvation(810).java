package methodEmbedding.Standing_Ovation.S.LYD1063;

import java.util.Scanner;


public class StandingOvation 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int numberTestCases = sc.nextInt();
		int i = 1,count = 0,total;
		while(i <= numberTestCases)
		{
			int shynessLevel = sc.nextInt();
			count = 0;total = 0;
			String str = sc.next();
			int[] ppl = new int[shynessLevel+1];
			for(int j = 0; j <= shynessLevel; j++)
			{
					ppl[j] = Integer.valueOf(str.charAt(j)+"");
			}
			for(int j = 0; j < ppl.length; j++)
			{
				total = 0;
				if(ppl[j] != 0)
				{
					for(int k = 0; k < j; k++)
						total = ppl[k] + total;
	 				if(j  > total + count)
					{
						count = count + (j - (total+count)); 
					}
				}
			}
			System.out.println("Case #"+i+": "+count);
			i++;
		}
	}

}
