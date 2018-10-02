package methodEmbedding.Cookie_Clicker_Alpha.S.LYD689;

import java.util.*;
class two
{
	public static void main(String args[])
	{
		int t;
		Scanner input = new Scanner(System.in);
		t = input.nextInt();
		for (int i = 0 ; i < t ; i++)
		{
			double base,incr,house,let;
			base = input.nextFloat();
			incr = input.nextFloat();
			house = input.nextFloat();
			double r = 2.0f;
			double seconds = 0.0f;
			double tim,dif,totalt;
			seconds = house/r;
			//let=base;
			tim = 0.0f;
			while ( true )
			{
				tim += base/r ;
				r += incr ;
				dif = house/r ;
				totalt = tim + dif ;
				if ( totalt < seconds )
					seconds = totalt ;
				else
					break ;
			}
			System.out.println("Case #"+(i+1)+": "+seconds);
		}
	}
}
