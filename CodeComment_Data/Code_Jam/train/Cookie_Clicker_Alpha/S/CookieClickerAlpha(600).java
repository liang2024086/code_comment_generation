package methodEmbedding.Cookie_Clicker_Alpha.S.LYD261;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.StringTokenizer;


public class CookieClickerAlpha {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		BufferedReader is = new BufferedReader(new FileReader("p2a.in"));
		BufferedWriter os = new BufferedWriter(new FileWriter("p2a.out"));
		int n= Integer.parseInt(is.readLine());
		BigDecimal c,f,x,stop,jump,cookie = new BigDecimal("2.0");
		StringTokenizer st; 
		for(int i = 0; i < n; i++)
		{
			cookie = new BigDecimal("2.0");
			st = new StringTokenizer(is.readLine());
			c = new BigDecimal(st.nextToken());
			f = new BigDecimal(st.nextToken());
			x = new BigDecimal(st.nextToken());
			stop = x.divide(cookie,12, RoundingMode.HALF_UP);
			jump = c.divide(cookie,12, RoundingMode.HALF_UP);
			//System.out.println("jump = "+jump.toString());
			cookie = cookie.add(f);
			while(stop.compareTo(x.divide(cookie,12, RoundingMode.HALF_UP).add(jump)) >0)
			{
				stop = x.divide(cookie,12,RoundingMode.HALF_UP).add(jump);
				jump = jump.add(c.divide(cookie,12, RoundingMode.HALF_UP));
				cookie = cookie.add(f);
				//System.out.println("jump = "+jump.toString());
			}
			
			System.out.println("Case #"+(i+1)+": "+stop.toString());
			os.write("Case #"+(i+1)+": "+stop.toString()+"\n");
		}
		is.close();
		os.close();
	}

}
