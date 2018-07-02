package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1511;

import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int a = 1; a <= t; ++a)
		{
			double c = scan.nextDouble(); //farm cost
			double f = scan.nextDouble(); //CPS differential of 1 farm
			double x = scan.nextDouble(); //get x to win
			double ans = 0;
			double currate = 2;
			while(true)
			{
				double stay = x/currate;
				double getnew = c/currate + x/(currate + f);
				//System.out.println(a + " " + ans + " " + stay + " " + getnew);
				if(stay < getnew)
				{
					ans += stay;
					break;
				}
				else
				{
					ans += c/currate;
					currate += f;
				}
			}
			System.out.println("Case #" + a + ": " + ans);
		}
	}
}
