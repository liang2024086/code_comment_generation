package methodEmbedding.Cookie_Clicker_Alpha.S.LYD20;

import java.util.*;

public class Cookies {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int cases = T;
		while(T-->0)
		{
			double C = sc.nextDouble();
			double F = sc.nextDouble();
			double X = sc.nextDouble();
			double bestTime = X*2;
			double curTime = 0;
			for(int i = 0; i < X*2 + 1; ++i)
			{
				//-x + curTime*thing = 0
				double finTime = X / (2 + i*F);
				bestTime = Math.min((curTime + finTime),bestTime);
				curTime += C / (2+i*F);
			}
			String ans = String.format("%.7f",bestTime);
			System.out.println("Case #"+(cases-T)+": "+ans);
		}
	}

}
