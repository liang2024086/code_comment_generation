package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1383;


import java.util.Scanner;

public class Cookie {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		double time = 0f;
		double cokieRate = 2;
		for(int test = 1; test <= testCases ; test++)
		{
			time=0f;
			cokieRate =2;
			double c = in.nextDouble();
			double f = in.nextDouble();
			double x = in.nextDouble();
			
			do
			{
				time = time + c/cokieRate;
				double check1  = (x - c) / cokieRate;
				double check2 =  	x / (cokieRate+f);
			
				if(check1<= check2)
				{
					time = time + check1;
					break;
				}
				else
				{
					cokieRate = cokieRate+ f;
				}
			}while(true);
			System.out.println("Case #"+test+": " + String.format("%.7f", time));
		}
	}
}
