package methodEmbedding.Cookie_Clicker_Alpha.S.LYD701;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


public class Cookie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("C:/Users/Jon PC/Documents/CS/javarevision/src/cookie_test.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return;
		}
		try {
			int numOfTests = Integer.parseInt(reader.readLine());
			for (int i = 0; i < numOfTests; i++){
				String[] arg = reader.readLine().split(" ");
				Double C_farmCost = Double.parseDouble(arg[0]);
				Double F_farmPayoff = Double.parseDouble(arg[1]);
				Double X_winCondition = Double.parseDouble(arg[2]);
				
				int myCookies = 0;
				int numberOfFarms = 0;
				double myCookiesPerSecond = 2d;
				double seconds = 0d;
				while (myCookies < X_winCondition)
				{
					double timeUntilNextFarm = (C_farmCost-myCookies) / myCookiesPerSecond;
					double timeUntilWinWithoutNewFarm = (X_winCondition-myCookies) / myCookiesPerSecond;
					double timeUntilWinWithNewFarm = timeUntilNextFarm + ((X_winCondition-myCookies) / (myCookiesPerSecond + F_farmPayoff));
//					System.out.println("---------------------------");
//					System.out.println(seconds + "s");
//					System.out.println(timeUntilNextFarm);
//					System.out.println(timeUntilWinWithoutNewFarm);
//					System.out.println(timeUntilWinWithNewFarm);
					
					
					if (timeUntilWinWithNewFarm < timeUntilWinWithoutNewFarm){
						//buy the farm
						seconds += timeUntilNextFarm;
						numberOfFarms ++;
						myCookiesPerSecond += F_farmPayoff;
					}
					else{
						// don't buy the farm
						seconds += timeUntilWinWithoutNewFarm;
						myCookies += X_winCondition;
						break;
					}
				}
				System.out.println("Case #" +(i+1)+ ": " + (double)Math.round(seconds*1e7)/1e7);
//				System.out.println(numberOfFarms + " farms");
				
				
			}
				
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
