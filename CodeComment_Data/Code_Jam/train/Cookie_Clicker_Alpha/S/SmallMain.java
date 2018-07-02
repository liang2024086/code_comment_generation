package methodEmbedding.Cookie_Clicker_Alpha.S.LYD846;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;


public class SmallMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		int caseno = 1;
		NumberFormat nf = new DecimalFormat();
		nf.setMinimumFractionDigits(7);
		while(testCases > 0){
			double farmCookies = scanner.nextDouble(),
						freq = scanner.nextDouble(),
						target = scanner.nextDouble(),
						currentCookieRate = 2.0,
						timeTaken = 0.0,
						nextCookieRate = 0.0,
						nextTimeTaken = 0.0,
						totalTimeTaken = 0.0;
			while(true){
				nextCookieRate = currentCookieRate + freq;
				timeTaken = target/currentCookieRate;
				nextTimeTaken = target/nextCookieRate;
				nextTimeTaken = farmCookies/currentCookieRate + nextTimeTaken;
				int compareRes = timeTaken == nextTimeTaken ? 0 : (timeTaken > nextTimeTaken ? 1 : -1); 
				if(compareRes == 0){
					totalTimeTaken+=timeTaken;
					break;
				} else if(compareRes > 0){
					totalTimeTaken+=farmCookies/currentCookieRate;
					currentCookieRate+=freq;
				} else {
					totalTimeTaken+=timeTaken;
					break;
				}
			}
			
			System.out.println("Case #"+caseno+": "+nf.format(Math.round( totalTimeTaken * 10000000.0 ) / 10000000.0));
			++caseno;
			--testCases;
		}
	}
}
