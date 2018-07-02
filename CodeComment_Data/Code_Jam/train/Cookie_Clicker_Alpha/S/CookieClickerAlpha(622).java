package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1415;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class CookieClickerAlpha {
	public static void main(String[] args) {
		//String inFile = "./src/cj2014/b/B-small-attempt0.in";
		String inFile = "./src/cj2014/b/B-small-attempt1.in";
		String outFile = inFile.replace(".in", ".out");

		try {
			BufferedReader br = new BufferedReader(new FileReader(inFile));
			BufferedWriter bw = new BufferedWriter(new FileWriter(outFile));
			int cases = Integer.parseInt(br.readLine());

			for (int i = 0; i < cases; i++) {
				// no. of input lines
				String[] params = br.readLine().split(" ");
				Double c = Double.parseDouble(params[0]);
				Double f = Double.parseDouble(params[1]);
				Double x = Double.parseDouble(params[2]);
				
				List<Double> seconds = new ArrayList<Double>();

				DecimalFormat df = new DecimalFormat("#.0000000");

				double cookiesRate = 2.0;
				while (true) {
					double directBuy = x / cookiesRate;

					double farmBuy = c / cookiesRate;
					farmBuy += (x / (cookiesRate + f));
					if (farmBuy < directBuy) {
						seconds.add( c / cookiesRate);
						cookiesRate += f;
					} else {
						// seconds.add(x/cookiesRate);
						seconds.add(directBuy);
						break;
					}
				}
				
				Double sum = new Double(0.0);
				for (Double sec : seconds) {
					sum += new Double(sec);
				}
				//System.out.println("sum: " + sum);
				bw.write("Case #" + (i + 1) + ": " + df.format(sum) + "\n");
				bw.flush();
			}

			br.close();
			bw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
