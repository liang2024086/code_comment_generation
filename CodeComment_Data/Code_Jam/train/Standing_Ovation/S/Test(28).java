package methodEmbedding.Standing_Ovation.S.LYD517;

import java.io.*;
class Test
{
	public static void main(String [] args)throws Exception
	{
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in)) ;
		int t = Integer.parseInt(read.readLine()) ;
		int index = 1 ;
		while(index <= t)
		{
			String readline = read.readLine() ;
			String [] readL = readline.split(" ") ;
			int Smax = Integer.parseInt(readL[0]) ;
			String line = readL[1] ;
			if(line.length() == (Smax+1))
			{
				int req = 0 , stand = Integer.parseInt(""+line.charAt(0));
				for(int i = 1 ; i <= Smax ; i++ )
				{
					if(stand < i )
					{
						req ++ ;
						stand ++ ;
					}
					stand += Integer.parseInt(""+line.charAt(i)) ;
			
				}
				System.out.println("Case #" + index++ +":" + " " + req);
			}
		}
	}
}
