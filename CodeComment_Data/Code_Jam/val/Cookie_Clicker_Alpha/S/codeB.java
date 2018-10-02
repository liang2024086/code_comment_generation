package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1428;

import java.util.*;

public class codeB{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int ca = 1; ca <= T; ca++){
			double C = sc.nextDouble();
			double F = sc.nextDouble();
			double X = sc.nextDouble();

			double curr = 2;
			double cost = 0;
			double min = X/2;
			for(int i = 0; i < 4000000; i++){
				double wait = cost + X/curr;
				min = Math.min(wait,min);
				cost += C/curr;
				curr += F;
			}
			System.out.printf("Case #%d: %.7f\n",ca,min);
		}
	}
}
