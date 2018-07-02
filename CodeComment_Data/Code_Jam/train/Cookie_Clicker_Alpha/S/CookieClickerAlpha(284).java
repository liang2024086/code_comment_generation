package methodEmbedding.Cookie_Clicker_Alpha.S.LYD912;

import java.io.File;
import java.util.Scanner;


public class CookieClickerAlpha {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner input = new Scanner(new File("B-small-attempt0.in"));
		int numCases = Integer.parseInt(input.nextLine());
		
		for (int i = 1; i <= numCases; i++){
			double c = input.nextDouble();
			double f = input.nextDouble();
			double x = input.nextDouble();
			double prod = 2.0;
			double time = 0.0;
			boolean done = false;
			while(!done){
				if( (x/prod) > (c/prod) + x/(prod+f)) {
					//buy a farm
					//System.out.println(c/prod);
					time+=c/prod;
					prod+=f;
				} else {
					time+=x/prod;
					done = true;
				}
			}
			System.out.printf("Case #%d: %.7f\n", i, time);	
		}
		input.close();
	}
}
