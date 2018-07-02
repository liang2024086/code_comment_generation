package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1125;

import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);


		int tc = scn.nextInt();

		for (int i = 0 ; i < tc ; i++)
		{
			double c = scn.nextDouble();
			double f = scn.nextDouble();
			double x = scn.nextDouble();

			double tt=0;
			double tp = 0;
			double prod=2;
			double cn = 0;


			while(true)
			{
				if ((c/prod+(x/(prod+f)))>(x/prod))
				{
				tt+=x/prod;
				break;
				}
				tt+=c/prod;
				prod+=f;

			}
			System.out.format("Case #%d: %.7f\n",(i+1), tt);
			//System.out.println("Case #"+tc+": "+tt);
		}

	}
}
