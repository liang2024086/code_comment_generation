package methodEmbedding.Cookie_Clicker_Alpha.S.LYD764;

import java.util.Scanner;

public class CookieClickerAlpha {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
//		double n = 2.00000010000000004;
//		System.out.println(n);
		double C,F,X;
		double wait_farm,reach_x,without_farm,production,time; 
		boolean build_farm;
		
		for (int i = 1; i <= t; i++) {
			C = in.nextDouble(); F = in.nextDouble(); X = in.nextDouble();
			time = 0.0;
			production = 2.0;
			build_farm = true;
			while (build_farm) {
				wait_farm = C/production;
				reach_x = X/(production + F);
				
				without_farm = X/production;
				
				if (wait_farm + reach_x < without_farm) {
					time += wait_farm;
					production += F;
				} else {
					time += without_farm;
					build_farm = false;
				}
			}
			
			System.out.println("Case #" + i + ": " + String.format("%.7f",time));
			
		}

	}

}
