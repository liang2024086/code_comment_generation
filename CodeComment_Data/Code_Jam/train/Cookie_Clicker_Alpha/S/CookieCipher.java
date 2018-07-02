package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1617;

import java.text.DecimalFormat;
import java.util.Scanner;


public class CookieCipher {

	public static void main(String args[])
	{

		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		double C=0,F=0,X=0;
		int case_no=1;
		double orig_time =0;
		double new_time =0;
		double gen_rate =2;
		double time_spent = 0;
		DecimalFormat final_op = new DecimalFormat("#0.0000000");
		while(t>0)
		{
						
			gen_rate =2;
			time_spent = 0;
			C=in.nextFloat();
			F=in.nextFloat();
			X=in.nextFloat();
			orig_time=X/gen_rate;
			
			while(true)
			{
				new_time=C/gen_rate;
				gen_rate+=F;
				if ((new_time+X/gen_rate+time_spent) <orig_time)
				{
					orig_time = new_time+X/gen_rate+time_spent;					
					time_spent += new_time;
				}
				else
				{
					break;
				}
				
			}
			System.out.println("Case #"+case_no+": "+final_op.format(orig_time));
			t--;
			case_no++;
			
		}

	}



}

