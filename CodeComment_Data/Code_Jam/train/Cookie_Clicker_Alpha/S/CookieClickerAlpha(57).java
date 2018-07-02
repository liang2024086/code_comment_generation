package methodEmbedding.Cookie_Clicker_Alpha.S.LYD453;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CookieClickerAlpha {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader buffReader = new BufferedReader(new FileReader("resource/cookieClickerAlpha.txt"));
		int T = Integer.parseInt(buffReader.readLine());
		int testCaseNumber = 1;
		String line = null;
		double C = 0.0, F = 0.0, X = 0.0, currentTime = 0.0, lastTime = 0.0, tempTime = 0.0, factor = 2.0;
		String[] rowElements = null;
		while ((line = buffReader.readLine()) != null) {
			rowElements = line.split(" ");
			C = Double.valueOf(rowElements[0]);
			F = Double.valueOf(rowElements[1]);
			X = Double.valueOf(rowElements[2]);
			currentTime = (X/2D);
			lastTime = currentTime + 1D;
			tempTime = 0.0;
			factor = 2.0;
			if (C >= X) {
				System.out.println("Case #"+testCaseNumber+": "+currentTime);
			} else {
				while (currentTime < lastTime) {
					lastTime = currentTime;
					tempTime = tempTime + (C/factor);
					factor = factor + F;
					currentTime = tempTime + (X/factor);
				}
				System.out.println("Case #"+testCaseNumber+": "+lastTime);
			}
			testCaseNumber++;
		}		
		
		buffReader.close();
	}
}
