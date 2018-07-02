package methodEmbedding.Cookie_Clicker_Alpha.S.LYD957;

import java.io.*;

class Cookies
{
	public static void main(String args[])throws IOException
	{
		double C, F, X, time, rate;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int t= Integer.parseInt(br.readLine());
		int c = 0;
		while(t-->0)
		{
			c++;
			String input[] = br.readLine().split(" ");
			C = Double.parseDouble(input[0]);
			F = Double.parseDouble(input[1]);
			X = Double.parseDouble(input[2]);
			//System.out.println(C+" "+F+" "+X);
			time = 0;
			rate = 2;
			double store=X/2, TTD, TWC, TAC;
			for(;;)
			{
				TTD = C/rate;
				TWC = (X-C)/rate;
				TAC = X/(rate+F);
				if(TWC>=TAC)
					time+=TTD;
				else
				{
					time+=store;
					break;
				}
				//System.out.println(time+" "+rate+" "+TTD+" "+TWC+" "+TAC+" "+store);
				store=TAC;
				rate=rate+F;
			}
			System.out.println("Case #"+c+": "+time);
		}
	}
}
