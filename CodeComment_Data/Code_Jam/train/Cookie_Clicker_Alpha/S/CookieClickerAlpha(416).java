package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1332;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class CookieClickerAlpha {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("input"));
		
		int t = Integer.parseInt(br.readLine());
		
		int kase = 0;
		
		while(kase++ < t) {
			String [] temp = br.readLine().split("[ ]+");
			double farmCost = Double.parseDouble(temp[0]);
			double farmProduction = Double.parseDouble(temp[1]);
			double target = Double.parseDouble(temp[2]);
			

			double rate = 2;
			double totalTime = 0;
			
			while(true) {
				totalTime += farmCost / (double) rate;
				double tempCount = farmCost;
				
				double eta1 = (target - tempCount) / rate;
				double eta2 = (target) / (rate + farmProduction);
				
				if (eta2 < eta1) {
					rate += farmProduction;
				}
				else {
					totalTime += eta1;
					break;
				}
			}
			System.out.print("Case #" + kase + ": ");
			System.out.printf("%.7f", totalTime);
			System.out.println();
		}
	}

}
