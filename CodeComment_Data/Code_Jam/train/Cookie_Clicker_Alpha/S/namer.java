package methodEmbedding.Cookie_Clicker_Alpha.S.LYD46;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class namer {
	public static int examples;
	public static double c; // to buy a farm
	public static double f; // farm produced cookies
	public static double x; // to win

	// first calculate how long it takes to buy a farm to the decimal place
	// every time you have enough cookies to buy a farm,
	// compare the time costs of buying a farm vs just waiting it out
	
	// statically produce 2 cookies a second
	// need to clear cookie counter every time you buy a farm
	public static void main(String[] args) {
		try {
			String strLine1;
			BufferedReader in1 = new BufferedReader(new FileReader("B-small-attempt0.in"));

			strLine1 = in1.readLine();
			examples = Integer.parseInt(strLine1);

			for (int ex = 0; ex < examples; ex++) { // go through examples
				strLine1 = in1.readLine();
				String[] line = (strLine1.trim()).split("\\s+");
				c = Double.parseDouble(line[0]);
				f = Double.parseDouble(line[1]);
				x = Double.parseDouble(line[2]);
				
				double crate = 2.0; // default 2 cookies per second
				double ccookies = 0; // current cookies
				double ftime = 0; // farm time
				double wtime = 0; // waiting time
				double time = 0; // time passed
				
				boolean flag = true;
				
				while (flag) { // infinite loop
					// if cookies to win < cost to buy a farm, break;
					if (x < c) {
						time += x/crate;
						flag = false;
					}
					else {
						// add enough time to get cookies to buy a farm
						time += c/crate;
						ccookies = c;
						
						// SHOULD I BUY A FARM OR NOT? compare waiting time with farm time
						wtime = (x - ccookies)/crate;
						ftime = (x - ccookies + c)/(crate + f);
						
						if (wtime < ftime) {
							time += wtime; // add this waiting time and break out of the loop
							flag = false;
						}
						else { // loop back, remove cookies and buy farm
							crate += f;
						}
					}
				}
				
				System.out.printf ("Case #%d: %.7f\n", (ex+1), time);


			}
			in1.close();
		} catch (Exception e) {
			System.err.println ("1. Error occurred. " + e.getMessage());
		}

	}

}

