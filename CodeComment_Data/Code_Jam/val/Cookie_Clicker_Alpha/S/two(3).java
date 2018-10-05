package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1542;



import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class two {
	public static void main(String[] args) {
		try {
			
			FileWriter writer = new FileWriter(new File(args[0] + "result"));
			Scanner scanner = new Scanner(new File(args[0]));
			int numberTests = scanner.nextInt();

			double currentRate, farmProdRate, currentTime, currentCookies,cost, targetCookies;

			for (int test = 0; test < numberTests; test++) {
				currentRate = 2.000000;
				currentTime = 0.000000;
				currentCookies = 0.000000;
				cost = Double.valueOf(scanner.next());
				farmProdRate = Double.valueOf(scanner.next());
				targetCookies = Double.valueOf(scanner.next());

				while ((targetCookies - currentCookies) > cost) {
					currentCookies = currentCookies + cost;
					currentTime = currentTime + (cost / currentRate);
					if (((targetCookies - currentCookies) / currentRate) > ((targetCookies - (currentCookies - cost)) / (currentRate + farmProdRate))) {
						currentCookies = currentCookies - cost;
						currentRate = currentRate + farmProdRate;
					} 
				}

				currentTime = currentTime + ((targetCookies - currentCookies) / currentRate);
				
				writer.write("Case #" + (test + 1) + ": " + (currentTime) + "\n");
			}
			writer.close();
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
