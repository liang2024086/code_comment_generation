package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1100;

import java.text.DecimalFormat;
import java.util.Scanner;


public class CookieClickerAlpha {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	for (int i = 0; i < T; i++) {
	    double C = sc.nextDouble();
	    double F = sc.nextDouble();
	    double X = sc.nextDouble();
	    
	    double cookieRate = 2.0;
	    double timeToReachX = X/cookieRate;
	    double timeToReachXWithAdditionalFarms = (C/cookieRate)+ (X/(cookieRate+F));
	    double timeElapsed = 0;
	    
	    while(timeToReachXWithAdditionalFarms < timeToReachX){
		timeElapsed += C/cookieRate;
		cookieRate+=F;
		timeToReachX = X/cookieRate;
		timeToReachXWithAdditionalFarms = (C/cookieRate)+ (X/(cookieRate+F));
	    }
	    timeElapsed+=timeToReachX;
	    
	    DecimalFormat df = new DecimalFormat("#.0000000");
	    String bestTime = df.format(timeElapsed);
	    
	    System.out.println("Case #" + (i + 1) + ": " + bestTime);
	}
    }
}
