package methodEmbedding.Cookie_Clicker_Alpha.S.LYD239;


import java.util.Scanner;

public class CookieClickerAlpha
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int tests = sc.nextInt();
		
		double c, f, x;
		for(int test = 1; test <= tests; test ++)
		{
			c = sc.nextDouble();
			f = sc.nextDouble();
			x = sc.nextDouble();
			
			if(c >= x)
			{
				System.out.println("Case #" + test + ": " + x/2.0);
				continue;
			}
			
			double farm_time = 0.0, new_farm_time, t_new, t_old;
			for(int k = 0; ; k++)
			{
				new_farm_time = farm_time + c/(2.0 + k * f);
				t_new = new_farm_time + x/(2.0 + (k+1) * f);
				t_old = farm_time + x/(2.0 + k * f);
				
				if(t_new >= t_old)
				{
					System.out.println("Case #" + test + ": " + t_old);
					break;
				}
				
				farm_time = new_farm_time;
			}
		}
		
		sc.close();
	}

}
