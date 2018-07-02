package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1142;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;


public class CookieClicker {
	final static double INITIAL_COOKIE_PER_SECOND = 2.0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		try{
			System.setIn(new FileInputStream("src/cookieClickerTest"));
			System.setOut(new PrintStream(new FileOutputStream("src/cookieClickerOut")));
		} catch( Exception e) {
			e.printStackTrace();
		}
		*/
		
		
		BufferedInputStream br = new BufferedInputStream(System.in);
		Scanner snr = new Scanner(br);
		int numberOfTests = Integer.parseInt(snr.nextLine()) +1;
		for(int test=1; test < numberOfTests ; ++test){
			String input = snr.nextLine();
			String[] inputStrings = input.split(" ");
			double cookieFarmCost = Double.parseDouble(inputStrings[0]);
			double extraCookiesPerSecond = Double.parseDouble(inputStrings[1]);
			double targetCookies = Double.parseDouble(inputStrings[2]);

			double currentCPS = INITIAL_COOKIE_PER_SECOND;
			double totalTimeTaken = 0.0;
			boolean buyFarm = true;

			while(buyFarm) {
				double waitTime = targetCookies/currentCPS;
				double timeToBuyFarm = cookieFarmCost/currentCPS;
				double waitTimeIfBoughtFarm = timeToBuyFarm + targetCookies/(currentCPS+extraCookiesPerSecond);

				if(waitTime > waitTimeIfBoughtFarm){
					//Buy farm
					totalTimeTaken += timeToBuyFarm;
					currentCPS += extraCookiesPerSecond;
				} else {
					//Don't buy farm
					totalTimeTaken += waitTime;
					buyFarm = false;
				}
			}
			
			System.out.println("Case #" +test + ": " + totalTimeTaken);

		}
		snr.close();

	}

}
