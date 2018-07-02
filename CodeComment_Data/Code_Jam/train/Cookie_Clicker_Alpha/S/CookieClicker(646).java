package methodEmbedding.Cookie_Clicker_Alpha.S.LYD216;

import java.util.*;
import static java.lang.Math.*;

public class CookieClicker {
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int zz = 1; zz <= T; zz++) {

			double C = in.nextDouble();
			double F = in.nextDouble();
			double X = in.nextDouble();
			
			double prevValue = X/2;
			double initial = C/2;
			int i=0;
			double nextValue = initial + (X / (2+F));
			double finalAns = prevValue;
			i++;
			
			while(prevValue > nextValue)
			{
				
				initial = initial + (C / (2+(i*F)));
				i++;
				
				prevValue = nextValue;
				nextValue = initial + (X / (2+(i*F))); 
			}
			
		   	System.out.format("Case #%d: %.7f\n", zz, prevValue);
		    
		}
	}

	



}
