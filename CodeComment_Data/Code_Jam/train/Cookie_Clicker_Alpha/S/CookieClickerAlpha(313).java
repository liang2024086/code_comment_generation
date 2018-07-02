package methodEmbedding.Cookie_Clicker_Alpha.S.LYD364;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CookieClickerAlpha {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("./B-small-attempt0.in"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("./B-small-attempt0.out"));

			String outputFormat = "Case #%d: %.07f";
			int numOfTestCase = Integer.parseInt(br.readLine());
			String row;
			for (int i = 0; i < numOfTestCase; i++) {
				row = br.readLine();
				String[] cfx = row.split(" ");
				double c = Double.parseDouble(cfx[0]);
				double f = Double.parseDouble(cfx[1]);
				double x = Double.parseDouble(cfx[2]);
				double currentCPS = 2; // cookies per seconds
				double spentTime = 0.0;
				boolean isTerminate = false;
				double prevTotalTime = 0.0;
				while (!isTerminate) {
					double nextGainFarmSeconds = c / currentCPS;
					double endSeconds = x / currentCPS;
					if (nextGainFarmSeconds >= endSeconds) {
						spentTime += endSeconds;
						bw.write(String.format(outputFormat, i + 1, spentTime) + "\n");
						isTerminate = true;
					} else {
						if (prevTotalTime != 0.0 && prevTotalTime < (spentTime + endSeconds)) {
							bw.write(String.format(outputFormat, i + 1, prevTotalTime) + "\n");
							isTerminate = true;
						} else {
							prevTotalTime = spentTime + endSeconds;
							spentTime += nextGainFarmSeconds;
							currentCPS += f;
						}
					}
				}
			}
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
