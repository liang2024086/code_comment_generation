package methodEmbedding.Cookie_Clicker_Alpha.S.LYD608;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class Main {
 
	public static void main(String[] args) {
 
		BufferedReader br = null;
 
		try {
 
			br = new BufferedReader(new FileReader("B-small-attempt0.in"));
			
			int t = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < t; i++) {
				String[] line = br.readLine().split(" ");
				
				double farmCost = Double.parseDouble(line[0]);
				double farmProd = Double.parseDouble(line[1]);
				double target = Double.parseDouble(line[2]);
				
				double minTime = target / 2;
				
				for (int numOfFarm = 1;; numOfFarm++) {
					double newTime = target / (2 + (numOfFarm * farmProd));
					for (int j = 0; j < numOfFarm; j++) {
						newTime += farmCost / (2 + (j * farmProd));
					}
					
					if (newTime < minTime) {
						minTime = newTime;
					}
					else {
						break;
					}
				}
				
				System.out.println("Case #" + (i+1) + ": " + minTime);
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
