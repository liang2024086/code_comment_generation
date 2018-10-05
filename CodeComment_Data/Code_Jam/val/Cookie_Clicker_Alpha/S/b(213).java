package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1408;

import java.util.*;

public class b {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double cases = sc.nextDouble();
		
		for (int i = 0; i < cases; i++){
			double time = 0.0;
			double c = sc.nextDouble();
			double f = sc.nextDouble();
			double x = sc.nextDouble();
			double rate = 2;
			while(true){
				if (x/rate > (c/rate + (x)/(f+rate))) {
					time += c/rate;
					rate += f;
				} else {
					time += x/rate;
					break;
				}
			}
			System.out.println("Case #" + (i + 1) + ": " + time);
		}
	}
}
