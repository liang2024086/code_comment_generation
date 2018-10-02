package methodEmbedding.Cookie_Clicker_Alpha.S.LYD489;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class cookie {

	
	public static void main(String[] args)throws IOException
	{
		BufferedReader ds = new BufferedReader(new InputStreamReader(System.in)) ;
		PrintWriter out = new PrintWriter(new FileWriter("out.txt"));
		int t = Integer.parseInt(ds.readLine()) ;
		int ct = 1 ;
		StringTokenizer st ;
		while(t-->0)
		{
			out.print("Case #"+ct+": ");
			ct++;
			st = new StringTokenizer(ds.readLine()) ;
			double c = Double.parseDouble(st.nextToken());
			double f = Double.parseDouble(st.nextToken());
			double x = Double.parseDouble(st.nextToken());
			double rate = 2.0 ;
			double buy = 0 , now = 0;
			double min = x/rate ;
		
			while(true)
			{
				buy += c/rate ;
				
				rate += f ;
				
				now = buy + (x/rate) ;
				
				//System.out.println(now) ;
				
				if( now > min )
					break;
				else
					min = now ;
			}
			out.format("%.7f\n",min);
		}
		out.close();
	}

}
