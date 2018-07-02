package methodEmbedding.Cookie_Clicker_Alpha.S.LYD191;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


public class CookieClickerAlpha {

	public static void main(String[] args) {
		File inputFile =  new File ("B-small-attempt0.in");
		File outputFile = new File ("B-small-attempt0.out");
		
		int N,i;
		double farmCost, f, x, actualTime, futureTime, avgProduction, totalTime;
		boolean meta;
		String dataInput;
		
		try {
			
			FileReader inputReader = new FileReader(inputFile);
			FileWriter outputWriter = new FileWriter(outputFile);
			BufferedReader inputBuff = new BufferedReader(inputReader);
			BufferedWriter outputBuff = new BufferedWriter(outputWriter);
			
			N = Integer.parseInt(inputBuff.readLine());
//			System.out.println(N);
			for( i = 1; i <= N; i++) {
				
				dataInput = inputBuff.readLine();
//				System.out.println(dataInput);
				
				farmCost = Double.parseDouble(dataInput.split(" ")[0]);
				f =  Double.parseDouble(dataInput.split(" ")[1]);
				x =  Double.parseDouble(dataInput.split(" ")[2]);
				
//				System.out.println(farmCost);
//				System.out.println(f);
//				System.out.println(x);
//				
				avgProduction = 2;
				totalTime = 0;
				meta = false;
				
				while(!meta) {
				// Avalia??o
					actualTime = x / avgProduction;
					futureTime = (farmCost / avgProduction) + (x / (avgProduction + f));
					
					if(actualTime < futureTime) {
						totalTime = totalTime + actualTime;
//						System.out.printf("%.7f",totalTime);
						if(i == 1) {
							outputBuff.write("Case #" + i + ": " +totalTime);
						} else {
							outputBuff.newLine();
							outputBuff.write("Case #" + i + ": " +totalTime);
						}
						
						meta=true;
					} else {
						totalTime = totalTime + farmCost/avgProduction;
						avgProduction= avgProduction + f;
					}
				
				}
	//			System.out.println(actualTime);
	//			System.out.println(futureTime);
			}
			
			inputBuff.close();
			outputBuff.close();
		} catch (Exception e) {
			
		}
	}
}
