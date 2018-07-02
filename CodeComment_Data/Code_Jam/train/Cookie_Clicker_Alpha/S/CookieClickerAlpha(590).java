package methodEmbedding.Cookie_Clicker_Alpha.S.LYD251;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class CookieClickerAlpha {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cases = Integer.parseInt(br.readLine());
		double C,F,X,R,worst;
		
		for(int c = 1; c <= cases; c++) {
			String[] pieces = br.readLine().split(" ");
			C = Double.parseDouble(pieces[0]);
			F = Double.parseDouble(pieces[1]);
			X = Double.parseDouble(pieces[2]);
			R = 2.0;
			
			worst = X / R;
			double rate = R;
			double current = 0;
			int attempts = 0;
			
			while(true) {
				double time = C / rate;
				current += time;
				rate += F;
				
				if(worst > current + (X / rate))
					worst = current + (X / rate);
				else if(attempts < 100000)
					attempts++;
				else
					break;
				
			}
			
			System.out.println("Case #"+c+": "+worst);
		}
	}
}
