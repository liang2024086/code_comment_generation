package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1466;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Jam2 {

	
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		FileWriter fstream = new FileWriter("out.txt");
		BufferedWriter out = new BufferedWriter(fstream);
		
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(7);
		
		
		int T = scan.nextInt();
		
		for (int k = 0; k < T; k++) {
			double c = scan.nextDouble();
			double f = scan.nextDouble();
			double x = scan.nextDouble();
			
			double rate = 2.0;
			double duration = 0.0;
			double collected = 0.0;
			
			while(collected <= x) {
				double timeToFinish = (x - collected) / rate;
				double timeToBuy = ((c - collected) / rate);
				double timeToBuyFinish = timeToBuy + (x / (rate + f));
				if(timeToFinish <= timeToBuyFinish) {
					duration = duration + timeToFinish;
					break;
				}
				else {
					duration = duration + timeToBuy;
					collected = 0.0;
					rate = rate + f;
				}
			}
			
			out.write("Case #" + (k+1) + ": ");
			out.write(df.format(duration));
			out.newLine();
		}
		out.close();

	}

}
