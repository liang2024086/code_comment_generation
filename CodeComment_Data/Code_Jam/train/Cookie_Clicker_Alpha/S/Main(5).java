package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1020;

import java.awt.Point;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		int n = sc.nextInt();
		for(int T = 1 ; T <= n ; T++){
			double cost = sc.nextDouble();
			double gain = sc.nextDouble();
			double goal = sc.nextDouble();
			
			double t = 0;
			double prod = 2;
			
			double m = Double.POSITIVE_INFINITY;
			
			while(t < m){
				//System.out.printf("min(%f) t(%f) prod(%f)\n", m,t,prod);
				m = Math.min(m, t+goal/prod);
				
				double addTime = cost/prod;
				
				prod += gain;
				t+= addTime;
			}
			
			System.out.println("Case #"+T+": " +m);
		}
	}

}
