package methodEmbedding.Cookie_Clicker_Alpha.S.LYD92;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class CookieClickerAlpha {
	
	static String fn = "B-small-attempt0";

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File(fn+".in"));
		FileWriter out = new FileWriter(fn+".out");
		
		int T = in.nextInt();
		
		for(int t = 1; t <= T; t++) {
			double C = in.nextDouble();
			double F = in.nextDouble();
			double X = in.nextDouble();
			
			System.out.println(String.format("Case #%d", t));
			System.out.println(String.format("C:%.2f F:%.2f X:%.2f", C,F,X));
			
			int farms = 0;
			double h = (2*C / F) + C;
			while(h < X) {
				h += C;
				farms++;
			}
			System.out.println(farms);
			
			double ans = X / (2 + farms*F);
			for(int i = 0; i < farms; i++) {
				ans += C / (2 + i*F);
			}
			
			out.write(String.format("Case #%d: %.7f\n", t, ans));
			System.out.println(String.format("Case #%d: %.7f", t, ans));
		}

		out.close();
		in.close();
	}

}
