package methodEmbedding.Standing_Ovation.S.LYD1728;

import java.util.*;
public class TRIALS
{
	static Scanner sc=new Scanner (System.in);
	public static void main (String[]args)
	{
		int T=sc.nextInt();
		for (int i=0;i<T;i++)
		{
			int Smax=sc.nextInt();
			String in=sc.next();
			int friends=0;
			int audience=0;
			for (int j=0;j<=Smax;j++)
			{
				int a=in.charAt(j)-48;
				while (audience<j&&a!=0)
				{
					friends++;
					audience++;
				}
				audience+=a;
			}
			System.out.println("Case #"+(i+1)+": "+friends);
		}
	}
}
