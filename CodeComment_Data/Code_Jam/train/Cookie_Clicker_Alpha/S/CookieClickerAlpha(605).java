package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1362;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;

public class CookieClickerAlpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			// TODO: move file open stuff into its own method and just pass a param
			// to it.
			FileReader fr;
			BufferedReader br;
			File file = new File(args[0]);

			fr = new FileReader(file);
			br = new BufferedReader(fr);

			int numOfRounds = Integer.parseInt(br.readLine().trim());
			double numOfSeconds = 0.0, cookiesPerSecond, c, f, x;
			double timeToX, timeToNext, timeToC;
			String readLine;
			String[] row;
			
			DecimalFormat df = new DecimalFormat(".0000000");

			for (int i = 0; i < numOfRounds; i++) {

				cookiesPerSecond = 2.0;
				numOfSeconds = 0.0;
				timeToX = 0.0;
				timeToC = 0.0;

				readLine = br.readLine();
				row = readLine.split(" ");

				c = Double.parseDouble(row[0]);
				f = Double.parseDouble(row[1]);
				x = Double.parseDouble(row[2]);

				while (true) {

					timeToX = x / cookiesPerSecond;
					timeToNext = c / cookiesPerSecond + (x / (cookiesPerSecond + f));
					timeToC = c / cookiesPerSecond;

					if (timeToX < timeToNext) {
						break;
					}
					numOfSeconds += timeToC;
					cookiesPerSecond += f;
				}
				timeToX = x / cookiesPerSecond;
				numOfSeconds += timeToX;

				System.out.println("Case #" + (i + 1) + ": " + df.format(numOfSeconds));
			}

			br.close();
		} catch (FileNotFoundException e) {
			// File not found
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
