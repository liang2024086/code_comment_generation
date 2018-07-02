package methodEmbedding.Cookie_Clicker_Alpha.S.LYD383;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CookieClicker {

	public CookieClicker(String filename){
		Scanner s=null;
		try {
			s = new Scanner(new File(filename));
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}

		String output = "";
		
		int testCases = s.nextInt();
		for (int t = 1; t <= testCases; t++){
			
			double cookieRate = 2;
			double farmCost = s.nextDouble();
			double farmRate = s.nextDouble();
			double goalCookies = s.nextDouble();
			
			double timeLeftNoFarms;
			double timeNextFarm;
			double timeLeftExtraFarm;
			
			double timeTaken = 0;
			
			do {
				
				timeLeftNoFarms = goalCookies / cookieRate;
				timeNextFarm = farmCost / cookieRate;
				timeLeftExtraFarm = timeNextFarm + (goalCookies / (cookieRate + farmRate));
				
				if (timeLeftExtraFarm < timeLeftNoFarms){
					cookieRate += farmRate;
					timeTaken += timeNextFarm;
				}
				else {
					timeTaken += timeLeftNoFarms;
				}
				
			} while (timeLeftExtraFarm < timeLeftNoFarms);
			
			output += String.format("Case #%d: %.7f\n", t, timeTaken);
		}
		
		System.out.println(output);
	}
	
	public static void main(String[] args){
		String path = "res/cookie/";
		String filename = path+"B-small-attempt0.in";
		new CookieClicker(filename);
	}
	
}
