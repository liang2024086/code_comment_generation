package methodEmbedding.Cookie_Clicker_Alpha.S.LYD791;

import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int currentCase = 1;
		double cost, increase, currentRate, target, time; 
		for (int cases = sc.nextInt(); cases > 0; --cases, ++currentCase) {
			currentRate = 2;
			cost = sc.nextDouble();
			increase = sc.nextDouble();
			target = sc.nextDouble();
			////////////////////////
			time = 0;
			while (target/currentRate >= (cost/currentRate)+(target/(currentRate+increase))) {
				time += cost/currentRate;
				currentRate += increase;
			}
			time += target/currentRate;
			System.out.println(String.format("Case #%d: %.7f",currentCase, time));
		}
	}
}
