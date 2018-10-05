package methodEmbedding.Cookie_Clicker_Alpha.S.LYD6;

import java.io.*;
import java.text.DecimalFormat;

public class q2 {

	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new FileReader(args[0]));
			int numCases = Integer.parseInt(in.readLine());
			double cookies = 0.0;
			double time = 0.0;
			double cookieRate = 2.0;
			
			if (numCases <= 0) {
				return;
			} 

			double factor = 1e7;
			for (int i = 1; i <= numCases; i++) {
				cookies = 0.0;
				time = 0.0;
				cookieRate = 2.0;
				System.out.print("Case #" + i + ": ");
				String[] line = in.readLine().split(" ");
				double C = Double.parseDouble(line[0]);
				double F = Double.parseDouble(line[1]);
				double X = Double.parseDouble(line[2]);
				
				while (cookies < X) {
					if ((X-cookies)/cookieRate <= C/cookieRate) {
						time += (X-cookies)/cookieRate;
						cookies = X;
					} else if (cookies >= C) {
						double firstStrategy = (X-cookies)/cookieRate;
						double secondStrategy = (X-(cookies-C))/(cookieRate+F);
						
						if (secondStrategy < firstStrategy) {
							cookieRate += F;
							cookies -= C;
						} else {
							time += (X-cookies)/cookieRate;
							cookies = X; 
						}
					} else {
						time += C/cookieRate;
						cookies += C;
					}
				}
				System.out.println(time);
			}

		} catch (IOException e) {
			return;
		}


	}
}
