package methodEmbedding.Cookie_Clicker_Alpha.S.LYD793;

import java.util.*;
public class Cookie {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		scanner.nextLine();
		double cost; double extra; double cRate; double target; double cookies;
		double time;
		for (int j = 0; j < i; j++) {
			cRate = 2;
			cookies = 0;
			time = 0;
			cost = scanner.nextDouble();
			extra = scanner.nextDouble();
			target = scanner.nextDouble();
			scanner.nextLine();
			if (target <= cost) {
					time = target/cRate; 
			} else {		
				while(true) {
					if (((target-cookies)/(cRate)) > ((cost - cookies)/(cRate) +  target/(cRate+extra))) {
						time = time + (cost - cookies)/cRate;
						cRate = cRate + extra;
					} else {
						time = time + (target/cRate);
						break;
					}

				}
			}
			System.out.println("Case #" + (j+1)+ ": " + time);
		}




	}
}
