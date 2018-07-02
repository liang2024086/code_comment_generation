package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1458;

import java.io.*;
import java.math.BigDecimal;

public class CookieClicker {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("B-small-attempt0.in"));

			int numberOfCases = Integer.parseInt(br.readLine());
			String finalOutput = "";
			for (int iii = 0; iii < numberOfCases; iii++) {
				BigDecimal cookiesPerSecond = new BigDecimal("2.0");
				String [] line = br.readLine().split(" ");
				BigDecimal costForFarm = new BigDecimal(line[0]);
				BigDecimal extraCookiesPerSecond = new BigDecimal(line[1]);
				BigDecimal cookiesToWin = new BigDecimal(line[2]);
				BigDecimal time = new BigDecimal("0.0");

				while ((((costForFarm.divide(cookiesPerSecond, 7, BigDecimal.ROUND_HALF_UP)).add(cookiesToWin.divide(cookiesPerSecond.add(extraCookiesPerSecond), 7, BigDecimal.ROUND_HALF_UP)).compareTo(cookiesToWin.divide(cookiesPerSecond, 7, BigDecimal.ROUND_HALF_UP)))) == -1) {
					time = time.add(costForFarm.divide(cookiesPerSecond, 7, BigDecimal.ROUND_HALF_UP));
					cookiesPerSecond = cookiesPerSecond.add(extraCookiesPerSecond);
				}

				time = time.add(cookiesToWin.divide(cookiesPerSecond, 7, BigDecimal.ROUND_HALF_UP));
				finalOutput += "Case #" + (iii + 1) + ": " + time + "\n";
			}
			File file = new File("output.txt");
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			PrintWriter pw = new PrintWriter(fw);
			pw.write(finalOutput);
			pw.close();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
