package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1038;


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class cookieclicker
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader f = new BufferedReader(new FileReader("cookieclicker.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("cookieclicker.out")));
		int t = Integer.parseInt(f.readLine());
		for(int cas = 0;cas<t;cas++){
			double time = 0;
			double rate = 2;
			StringTokenizer st = new StringTokenizer(f.readLine());
			double c = Double.parseDouble(st.nextToken());
			double ff = Double.parseDouble(st.nextToken());
			double x = Double.parseDouble(st.nextToken());
			while(x/rate>c/rate+x/(rate+ff)){
				time+=c/rate;
				rate+=ff;
			}
			time+=x/rate;
			out.print("Case #" + (cas+1) + ": ");
			out.println(time);
		}
		out.close();
		System.exit(0);
	}
}
//for the record I don't know how to code
