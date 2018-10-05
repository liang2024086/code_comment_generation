package methodEmbedding.Cookie_Clicker_Alpha.S.LYD708;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProblemB {
	public static void main(String[] args) {
		String input = "B-small-attempt2.in";
		
		try {
			Scanner sc = new Scanner(new File(input));

			int numOfQuestion = sc.nextInt();
			for(int i = 0; i < numOfQuestion; i++) {
				double costOfFarm = sc.nextDouble();
				double prodOfFarm = sc.nextDouble();
				double targetOfCookies = sc.nextDouble();

				double prevResult = targetOfCookies / 2.0;
				int numOfFarms = 1;
				
				while(true) {
					double result = 0.0;
					double currentProdVolume = 2.0;
					
					for(int n = 0; n < numOfFarms; n++) {
						result += costOfFarm / currentProdVolume; 
						currentProdVolume += prodOfFarm;
					}
					result += targetOfCookies / currentProdVolume;
					
					if(result > prevResult) {
						break;
					}
					prevResult = result;
					numOfFarms++;
				}
				System.out.printf("Case #%d: %.7f\n", i+1, prevResult);
			}
		
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
