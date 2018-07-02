package methodEmbedding.Cookie_Clicker_Alpha.S.LYD204;


import java.io.BufferedInputStream;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;


public class Cookies {
	
	private static final double COOKIE_PER_SEC = 2.0;
	

	public static void main(String[] args) {
		
		double farmCost = 0;
		double farmCookieRate = 0;
		double cookieGoal = 0;
		
		BufferedInputStream inputFile = (BufferedInputStream) Cookies.class.getClassLoader().getResourceAsStream("cookieInput.txt");
		
        Scanner scanner = new Scanner(inputFile);
        
        int caseCount = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0 ; i < caseCount ; i++){
        	
        	String line = scanner.nextLine();
        	String[] doublesStr = line.split(" ");
        	
	        farmCost = Double.parseDouble(doublesStr[0]);
	        farmCookieRate = Double.parseDouble(doublesStr[1]);
	        cookieGoal = Double.parseDouble(doublesStr[2]);
        
        	double prev = (double) cookieGoal / COOKIE_PER_SEC;;
        	double currRate = COOKIE_PER_SEC;
        	double timeToWaitForFarms = 0.0;
        	
        	while(true)
        	{        		
        		timeToWaitForFarms += (double) farmCost / currRate;
        		currRate += farmCookieRate;
        		double newTimeToFinish = (double) cookieGoal / currRate;
        		newTimeToFinish += timeToWaitForFarms;
        		
        		if(newTimeToFinish < prev){
        			prev = newTimeToFinish;
        			continue;
        		}else{
        			break;	
        		}
        	}
        	
        	System.out.printf("Case #%d: %.7f\n", (i + 1) ,prev);
        }


        scanner.close();
	}
	


}
