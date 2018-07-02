package methodEmbedding.Cookie_Clicker_Alpha.S.LYD253;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CookieClickerAlpha
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(in.readLine());
		
		for(int i=0;i<T;i++)
		{
			String[] r = in.readLine().split(" ");
			double c = Double.parseDouble(r[0]);
			double f = Double.parseDouble(r[1]);
			double x = Double.parseDouble(r[2]);
			double start = 2;
			double t1 = 0, t2 = 0;
			double y = 0.0;
			
			while(true)
			{
				t1 = x/start;
				t2 = c/start + (x/(start + f));
				
				if(t1 < t2)
				{
					y += t1;
					break;
				}
				else
				{
					y += c/start;
					start += f;
				}
			
			}
			
			System.out.println("Case #" + (i+1) + ": " + String.format("%.7f",y));
		}
	}

}
