package methodEmbedding.Cookie_Clicker_Alpha.S.LYD220;

import java.io.*;
import java.util.*;

public class p2{
	
	public static void main(String []args)throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String inp;

		int k = Integer.parseInt(in.readLine());
		for(int z = 0; z < k; z++){
			StringTokenizer tok = new StringTokenizer(in.readLine());
			double c = Double.parseDouble(tok.nextToken());
			double f = Double.parseDouble(tok.nextToken());
			double x = Double.parseDouble(tok.nextToken());

			double cps = 2;
			double tot = 0;
			while(true){
				double next = c/cps;
				if(tot + next + x/(cps+f) < tot + x/cps){
					tot += next;
					cps+=f;
				}
				else{
					System.out.printf("Case #%d: %.7f\n", z+1, tot+(x/cps));
					break;
				}
			}
		}
	}

}
