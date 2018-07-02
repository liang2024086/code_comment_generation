package methodEmbedding.Cookie_Clicker_Alpha.S.LYD541;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;


public class CookieClickerAlpha {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
        	String outputBuf = "";
			String nstr = reader.readLine();
			int n = Integer.parseInt(nstr);
			
			for(int ca=1; ca<=n; ca++) {
				outputBuf = outputBuf + "Case #" + Integer.toString(ca) + ": ";
				
				String[] caseInputs = reader.readLine().split(" ");
				
				double c = Double.parseDouble(caseInputs[0]);
				double f = Double.parseDouble(caseInputs[1]);
				double x = Double.parseDouble(caseInputs[2]);

				double prevSecondToWin = x / 2;
				double prevSecondToFarm = 0;
				
				for(int farmCnt=1; farmCnt<=x; farmCnt++) {
//					System.out.println(Integer.toString(farmCnt));
					double prevCookiePerSecond = (farmCnt - 1) * f + 2;
					double cookiePerSecond = farmCnt * f + 2;
//					System.out.println(Double.toString(cookiePerSecond));
					double secondToFarm = prevSecondToFarm + (c / prevCookiePerSecond);
//					System.out.println(Double.toString(secondToFarm));
					double secondToWin = secondToFarm + (x / cookiePerSecond);
//					System.out.println(Double.toString(secondToWin));
					if( prevSecondToWin < secondToWin ) {
						break;
					}
					prevSecondToWin = secondToWin;
					prevSecondToFarm = secondToFarm;
				}
				
				DecimalFormat df = new DecimalFormat("#.0000000");
				
				String result = df.format(prevSecondToWin);
				outputBuf = outputBuf + result;
				
				outputBuf = outputBuf + "\n";
			}
			
			System.out.println(outputBuf);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
