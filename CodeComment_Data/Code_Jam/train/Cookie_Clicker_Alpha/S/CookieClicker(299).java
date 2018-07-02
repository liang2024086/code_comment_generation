package methodEmbedding.Cookie_Clicker_Alpha.S.LYD766;

import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class CookieClicker{
	static PrintStream ps;
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		ps = new PrintStream(new BufferedOutputStream(out));
		StringTokenizer st;
		
		int t = Integer.valueOf(br.readLine());
		for(int tt=1; tt<=t; tt++){
			ps.printf("Case #%d: ", tt);
			String[] ss = br.readLine().trim().split("\\s+");
			double C = Double.valueOf(ss[0]);
			double F = Double.valueOf(ss[1]);
			double X = Double.valueOf(ss[2]);
			double rate = 2.0;
			double time = 0.0;
			while(true){
				double t1 = X/rate;
				double t2 = C/rate + X/(rate+F);
				if(t1<t2){
					time += t1;
					break;
				}else{
					time += C/rate;
					rate += F;
				}
			}
			ps.printf("%.7f\n", time);
		}
		
		ps.flush();
	}
}
