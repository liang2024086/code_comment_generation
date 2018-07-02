package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1197;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;


public class CookieClickerAlpha {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int noOfTestcases = Integer.parseInt(br.readLine());
		for(int i=0; i<noOfTestcases; i++) {

			double noOfCookiesToGetFarm = 0, additionInCookieProductionRate = 0, target = 0;
					
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<3; j++) {
				if(j==0) {
					noOfCookiesToGetFarm = Double.parseDouble(st.nextToken());
				} else if(j == 1) {
					additionInCookieProductionRate = Double.parseDouble(st.nextToken());
				} else if(j == 2) {
					target = Double.parseDouble(st.nextToken());
				}
			}

			double currentCookieProductionRate = 2, totalTime = 0.0, timeToGetFarm = 0.0, timeToGetCookies = 0.0, timeToGetCookiesAfterThat = 0.0;
			while(true) { 

				timeToGetFarm = noOfCookiesToGetFarm/currentCookieProductionRate;
				timeToGetCookiesAfterThat = target/(currentCookieProductionRate + additionInCookieProductionRate);

				timeToGetCookies = target/currentCookieProductionRate;

				if((timeToGetFarm  + timeToGetCookiesAfterThat) < timeToGetCookies) {
					currentCookieProductionRate += additionInCookieProductionRate;
					totalTime += timeToGetFarm;
				} else {
					totalTime += timeToGetCookies;
					break;
				}
			}

			System.out.println("Case #" + (i+1) + ": " + new DecimalFormat(".#######").format(totalTime));
		}
	}
}
