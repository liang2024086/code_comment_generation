package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1598;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;


public class CookieClicker {
	
	public static void main(String args[]) throws IOException {
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		DecimalFormat df = new DecimalFormat(".#######");
		
		Scanner s = new Scanner(new File(args[0]));
		File out = new File(args[1]);
		if(!out.exists()) {
			out.createNewFile();
		} else {
			out.delete();
			out.createNewFile();
		}
		FileWriter fw = new FileWriter(out);
		
		int numCases = s.nextInt();
		for(int i=1; i<=numCases; i++) {
			double farmCost = s.nextDouble();
			double farmBoost = s.nextDouble();
			double winCondition = s.nextDouble();
			
			double currentFarms = 0;
			double production = 2;
			
			double thisTime = -1;
			double previousTime = -1;
			double previousFarmTime = 0;
			do {
				previousTime = thisTime;
				thisTime = (winCondition/(2+currentFarms*farmBoost)) + previousFarmTime;
				previousFarmTime += (farmCost/(2+currentFarms*farmBoost));
				currentFarms++;
			} while(previousTime < 0 || thisTime < previousTime);
			
			fw.write("Case #"+i+": " + df.format(previousTime)+"\n");
		}
		fw.close();
	}

}
