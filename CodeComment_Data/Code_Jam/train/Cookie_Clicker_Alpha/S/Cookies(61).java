package methodEmbedding.Cookie_Clicker_Alpha.S.LYD83;

import java.io.*;
import java.util.*;
import java.text.*;

public class Cookies {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numCases = -1;
		double farmCost, farmProduces, cookiesToWin;
		double timeToWin;
		double timeToNextFarm;
		double timeToWinWithNextFarm;
		double currentCookiesPerSecond;
		double timeSpent;
		double cookiesLeftOver;
		int currentCase = 1;

		try {
			String line = br.readLine();

			while (line != null) {
				if (numCases == -1) {
					numCases = Integer.parseInt(line);
				} else {
					timeSpent = 0d;
					currentCookiesPerSecond = 2d;
					cookiesLeftOver = 0d;
					String[] split = line.split(" ");

					farmCost = Double.parseDouble(split[0]);
					farmProduces = Double.parseDouble(split[1]);
					cookiesToWin = Double.parseDouble(split[2]);

					timeToWin = cookiesToWin / currentCookiesPerSecond;
					timeToNextFarm = farmCost / currentCookiesPerSecond;
					timeToWinWithNextFarm = timeToNextFarm + (cookiesToWin / (currentCookiesPerSecond + farmProduces));

					while (timeToWin > timeToWinWithNextFarm) {
						cookiesLeftOver += (currentCookiesPerSecond * timeToNextFarm) - farmCost;

						timeSpent += timeToNextFarm;
						currentCookiesPerSecond += farmProduces;

						timeToWin = (cookiesToWin - cookiesLeftOver) / currentCookiesPerSecond;
						timeToNextFarm = farmCost / currentCookiesPerSecond;
						timeToWinWithNextFarm = timeToNextFarm + ((cookiesToWin - cookiesLeftOver) / (currentCookiesPerSecond + farmProduces));
					}

					DecimalFormat df = new DecimalFormat();
					df.setMaximumFractionDigits(7);
					df.setMinimumFractionDigits(7);

					System.out.println("Case #" + (currentCase++) + ": " + df.format(timeToWin + timeSpent));
				}

				line = br.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
