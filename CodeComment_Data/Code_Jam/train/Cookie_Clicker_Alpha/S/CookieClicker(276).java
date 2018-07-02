package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1636;

import java.util.Scanner;


public class CookieClicker {
	public static void main(String[] args)
	{
		Scanner k = new Scanner(System.in);
		int num_cases = k.nextInt();
		for(int a = 0; a<num_cases; a++)
		{
			double current_prod_rate = 2;
			double c = k.nextDouble();
			double f = k.nextDouble();
			double x = k.nextDouble();
			int flag = 0; 
			double total_time = 0;
			while(true && flag==0)
			{
				double farm_time = c/current_prod_rate;
				
				double goal_time = x/current_prod_rate;
				double after_farm_time = farm_time +  (x/(current_prod_rate + f));
				
				if(after_farm_time < goal_time)
				{
					total_time = total_time + farm_time;
					current_prod_rate = current_prod_rate +f;
				}
				else
				{
					total_time = total_time + goal_time;
					flag =1;
				}
			}
			System.out.println("Case #" + (a+1) + ": " + total_time);
		}
		
	}

}
