package methodEmbedding.Cookie_Clicker_Alpha.S.LYD490;

import java.util.*;
import java.io.*;
import java.text.*;
public class CookieClicker {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder output = new StringBuilder();
		int T = in.nextInt();
		double C,F,X;
		int num = 0;
		while(num++ < T) {
			C = in.nextDouble();
			F = in.nextDouble();
			X = in.nextDouble();

			double farm_cost = 0;
			double cookie = 2;

			double time = X / cookie;

			while(true) {
				farm_cost+= C / cookie;
				cookie += F;
				if(farm_cost + (X / cookie) < time) {
					time = farm_cost + (X / cookie);
				}
				else {
					break;
				}
			}
			DecimalFormat df = new DecimalFormat("#.0000000");
			output.append("Case #" + num + ": ");
			output.append(df.format(time) + "\n");
		}
		System.out.print(output.toString());
	}
}
