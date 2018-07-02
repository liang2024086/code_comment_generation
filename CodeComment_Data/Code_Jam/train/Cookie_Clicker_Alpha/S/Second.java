package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1338;

import java.util.*;
import static java.lang.Math.*;

public class Second {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		
		for(int zz = 1; zz <= T;zz++){
			double C = in.nextDouble();
			double F = in.nextDouble();
			double X = in.nextDouble();
			double F0=2;
			double T0=0;
			double result=0;
			if(C<X){
				while(true){
					T0 = T0+C;
					result = result+C/F0;
					double estimate_a = (X-T0)/F0;
					double estimate_b = (X)/(F0+F);
					if(estimate_a > estimate_b ){
						T0=0;
						F0=F0+F;
						//result= result+C/F0;
					}else{
						result= result + estimate_a;
						break;
					}
				}
			}else{
				result = X/F0;
			}
			System.out.format("Case #%d: %f\n", zz, result);
		}
	}
}
