package methodEmbedding.Cookie_Clicker_Alpha.S.LYD183;

import java.util.*;
import java.io.*;

public class CookieClickerAlpha {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintStream ps = new PrintStream(new BufferedOutputStream(System.out));
		int cases = sc.nextInt();
		for(int ctr=0; ctr<cases; ctr++){
			double c=sc.nextDouble(), f = sc.nextDouble(), x = sc.nextDouble();
			double time = 0;
			double rate = 2;
			while(true){
				double ttw = x/rate;
				double ttw2 = c/rate + x/(rate+f);
				if(ttw >= ttw2){
					time += c/rate;
					rate += f;
				}else{
					time = time + ttw;
					break;
				}
			}
			ps.printf("Case #%d: %f\n", ctr+1, time);
		}
		ps.flush();
	}
}
