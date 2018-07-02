package methodEmbedding.Cookie_Clicker_Alpha.S.LYD44;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class CookieClickerAlpha {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader(args[0])))
		{
			PrintWriter writer = new PrintWriter(args[1]);
			
			int numOfTestCases = Integer.parseInt(br.readLine());
			for (int i=1; i<=numOfTestCases; i++){
				String[] line = br.readLine().split(" ");
				double farmCost = Double.parseDouble(line[0]);
				double farmProduction = Double.parseDouble(line[1]);
				double goal = Double.parseDouble(line[2]);
				double productionRate = 2.0;
				double elapsedTime = 0.0;
				while (goal/productionRate > farmCost/productionRate + goal/(productionRate + farmProduction)){
					elapsedTime += farmCost/productionRate;
					productionRate += farmProduction;
				}
				elapsedTime += goal/productionRate;
				writer.println("Case #" + i + ": " + elapsedTime);
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
