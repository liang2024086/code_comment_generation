package methodEmbedding.Cookie_Clicker_Alpha.S.LYD172;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i = 0 ; i < t ; i++) {
			double c = scan.nextDouble();
			double f = scan.nextDouble();
			double x = scan.nextDouble();
			double ans = 0;
			int numFarms = 0;
			if(x<c) {
				ans = x/2;
			} else {
				ans = c/2;
				while(true) {
					double exp1Time = (x)/(2+f*(numFarms+1));
					double exp2Time = (x-c)/(2+f*numFarms);
					if(exp1Time<exp2Time) {
						ans += c/(2+f*(numFarms+1));
						numFarms++;
					} else {
						ans += (x-c)/(2+f*numFarms);
						break;
					}
				}
			}
			System.out.print("Case #" + (i+1) + ": ");
			System.out.println(ans);
		}
		scan.close();
	}

}
