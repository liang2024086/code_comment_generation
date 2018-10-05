package methodEmbedding.Cookie_Clicker_Alpha.S.LYD874;

import java.io.*;
import java.util.*;

class cookies
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));
		int test,cas=0;
		double c,f,x,max,rate=2.0,elapsed,time;
		test = Integer.parseInt(br.readLine());
		while(test > 0)
		{
			elapsed = 0.0;
			rate = 2.0;
			test--;
			cas++;
			StringTokenizer st = new StringTokenizer(br.readLine());
			c = Double.parseDouble(st.nextToken());
			f = Double.parseDouble(st.nextToken());
			x = Double.parseDouble(st.nextToken());
			max = x/rate;
			while(true)
			{
				//System.out.println(max + " " + elapsed);
				elapsed = elapsed + c/rate;
				rate = rate+f;
				time = elapsed+x/rate;
				if(max > time)
				{
					max = time;
				}
				else
				{
					pw.println("Case #"+cas+": "+max);
					pw.flush();
					break;
				}
			}
		}
	}
}	
