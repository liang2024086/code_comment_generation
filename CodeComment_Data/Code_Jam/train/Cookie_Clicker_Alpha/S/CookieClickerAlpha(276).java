package methodEmbedding.Cookie_Clicker_Alpha.S.LYD332;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.*; //for BigDecimal  


public class CookieClickerAlpha 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Ani\\Documents\\Workspace\\Java\\src\\input.txt"));
		
		BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Users\\Ani\\Documents\\Workspace\\Java\\src\\output.txt"));
		
		String line;
		String s[];
		int i=0;
		double c, f, x, time = 0.0;
		double r = 2.0;
		
		line = in.readLine();
		
		while((line = in.readLine()) != null)
		{
			s = line.split("[\\s]");
			c = Double.parseDouble(s[0]);
			f = Double.parseDouble(s[1]);
			x = Double.parseDouble(s[2]);
			r = 2.0;
			time = 0.0;
			//System.out.print(" c: "+c+" f: "+f+" x: "+x);
			
			while(true)
			{
				if((c/r)+(x/(r+f)) < x/r)
				{
					//System.out.print(" mr: "+r);
					time = time + (c/r);
					//System.out.print(" t: "+time+"\n");
					r = r + f;
				}
				
				else
				{
					time = time + (x/r);
					break;
				}
			}
			i++;
			BigDecimal b = new BigDecimal(time);  
		    b = b.setScale(7, BigDecimal.ROUND_CEILING); 
			out.write("Case #"+i+": "+b);
			out.newLine();
		}
		out.close();
		in.close();
	}
}
