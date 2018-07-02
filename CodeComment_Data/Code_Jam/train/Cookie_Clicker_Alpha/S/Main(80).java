package methodEmbedding.Cookie_Clicker_Alpha.S.LYD594;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in, "UTF-8");
		int nTestCases = Integer.parseInt(s.nextLine());
		
		for (int i = 0; i < nTestCases; i ++) {
			StringBuffer sb = new StringBuffer("Case #").append(i + 1).append(": ");
			String[] data = s.nextLine().split(" ");
			
			double cps = 2d;
			double c = Double.parseDouble(data[0]);
			double f = Double.parseDouble(data[1]);
			double x = Double.parseDouble(data[2]);
			double tt = 0d;
			
			while (true) {
				tt += c / cps;
				
				if (x / (cps + f) < (x - c) / cps) {
					cps += f;
				} else {
					tt += ((float) (x - c)) / cps;
					break;
				}
			}
			
			sb.append(tt);
			System.out.println(sb.toString());
		}
	}
}
