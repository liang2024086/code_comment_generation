package methodEmbedding.Cookie_Clicker_Alpha.S.LYD63;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CookieClicker {

	public static void main(String[] args) throws NumberFormatException, IOException {
		String formattedOutputString =  "Case #%d: %.7f";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		double time=0, cookies =0, cps=2, tp1,tp2;
		boolean conditionTested = false;
		String testCase;
		for(int i=1;i<=testCases;i++) {
			time=0;
			cookies=0;
			cps = 2;
			conditionTested = false;
			testCase = br.readLine();
			String[] values = testCase.split(" "); 
			double c = Double.parseDouble(values[0]);
			double f = Double.parseDouble(values[1]);
			double x = Double.parseDouble(values[2]);
			while(!conditionTested) {
				if(cookies==0) {
					time = time + (c/cps);
					cookies=c;
				}
				tp1 = (x - cookies) / cps ;
				tp2 = x / (cps + f) ;
				if(tp1 < tp2) {
					conditionTested = true;
					time = time + tp1;
				} else {
					cps = cps + f;
					cookies = 0;
				}
			}
			System.out.println(String.format(formattedOutputString, i, time));
		}

	}

}
