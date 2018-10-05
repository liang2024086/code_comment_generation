package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1012;

import java.util.*;
class code1
{
	public static void main(String args[])
	{
		int t;
		Scanner cin = new Scanner(System.in);
		t = cin.nextInt();
		for (int i = 0 ; i < t ; i++)
		{
			double c,f,x,cc;
			c= cin.nextFloat();
			f= cin.nextFloat();
			x= cin.nextFloat();
			double r = 2.0f;
			double time = 0.0f;
			double tim,dif,ttime;
			time = x/r;
			//cc=c;
			tim = 0.0f;
			while ( true )
			{
				tim += c/r ;
				r += f ;
				dif = x/r ;
				ttime = tim + dif ;
				if ( ttime < time )
					time = ttime ;
				else
					break ;
			}
			System.out.println("Case #"+(i+1)+": "+time);
		}
	}
}
