package methodEmbedding.Cookie_Clicker_Alpha.S.LYD319;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Cookie {
	public static void main(String [] args){
		try{
			BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
			DecimalFormat df = new DecimalFormat("#.0000000");
			int cases = Integer.parseInt(in.readLine());
			for (int x = 0; x < cases; x++){
				String[] row = in.readLine().split("\\s");
				
				double C = Double.parseDouble(row[0]);
				double F = Double.parseDouble(row[1]);
				double X = Double.parseDouble(row[2]);
				double max = X/C;
				double minTime = X/2;

				for (int i = 0; i < max; i++) {
					double time = 0;
					double rate = 2;

					for (int j = 0; j < i; j++) {
						time += C/rate;
						rate += F;
					}

					time += X/rate;
					if (time < minTime) {
						minTime = time;
					}
				}
				
				System.out.println("Case #" + (x+1) + ": " + df.format(minTime));
			}
		} catch (IOException e){
			System.out.println(e);
		}
	}
}
