package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1467;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

public class CookieClicker {

	public static void main(String[] args) throws Exception {
		String infile = args[0];
		String outfile = args[1];
		BufferedReader in = new BufferedReader(new FileReader(new File(infile)));
		PrintStream ps = new PrintStream(outfile);
		int T = Integer.parseInt(in.readLine());
		for (int t = 0; t < T; t++) {
			String[] caseStr = in.readLine().split(" ");
			float C = Float.parseFloat(caseStr[0]);
			float F = Float.parseFloat(caseStr[1]);
			float X = Float.parseFloat(caseStr[2]);
			
			boolean done = false;
			
			int numberOfFarms = 0;
			
			BigDecimal totalSeconds = new BigDecimal(0);
			
			BigInteger numerator = BigInteger.ZERO;
			BigInteger denominator = BigInteger.ONE;
			
			while (!done) {
				float rate = (numberOfFarms * F) + 2;
				
				// Time to get to target at current rate
				BigDecimal timeToTgt = new BigDecimal(X).divide(new BigDecimal(rate), 100, RoundingMode.HALF_UP);
				
				// Time to buy a new farm
				BigDecimal timeToFarm = new BigDecimal(C).divide(new BigDecimal(rate), 100, RoundingMode.HALF_UP);
				
				float newRate = ((numberOfFarms + 1) * F) + 2;
				
				// Time to get to target at new rate
				BigDecimal timeToTgtNewRate = new BigDecimal(X).divide(new BigDecimal(newRate), 100, RoundingMode.HALF_UP).add(timeToFarm);
				
				if (timeToTgt.compareTo(timeToTgtNewRate) < 0) {
					// Just wait for the target
					totalSeconds = totalSeconds.add(timeToTgt);
					done = true;
				} else {
					numberOfFarms += 1;
					totalSeconds = totalSeconds.add(timeToFarm);
				}
				
			}
			
			ps.println("Case #" + (t+1) + ": " + totalSeconds.setScale(7, RoundingMode.HALF_UP).toString());	
		}
		
		in.close();
		ps.close();
		
	}
	
}
