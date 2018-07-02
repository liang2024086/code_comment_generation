package methodEmbedding.Cookie_Clicker_Alpha.S.LYD142;

import java.util.*;
public class CookieClickerAlpha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=0;t<T;t++){
			double C = sc.nextDouble();
			double F = sc.nextDouble();
			double X = sc.nextDouble();
			double min = X/2;
			for(int i=1;i<(int)X/C;i++){
				double sum = 0.0;
				double fn = 2.0;
				for(int j=0;j<i;j++){
					sum +=C/fn;
					fn+=F;
				}
				sum += X/fn;
				if (sum < min) min = sum;
			}
			System.out.printf("Case #%d: %.7f\n",t+1,min);
		}
		sc.close();
	}

}
