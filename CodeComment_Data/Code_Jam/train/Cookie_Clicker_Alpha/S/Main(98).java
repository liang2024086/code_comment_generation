package methodEmbedding.Cookie_Clicker_Alpha.S.LYD347;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
	private static String ans = "";
	public static void main(String[] args) throws FileNotFoundException{
		File file = new File("testfile");
		Scanner scan = new Scanner(file);
		int numCase = Integer.parseInt(scan.nextLine());
		for(int i =0 ;i < numCase; i ++){
			double farmCost,goalCost,cookieRate = 2.0,extraRate,totalTime = 0;
			String splitStr[] = scan.nextLine().split(" ");
			farmCost = Double.parseDouble(splitStr[0]);
			extraRate = Double.parseDouble(splitStr[1]);
			goalCost = Double.parseDouble(splitStr[2]);
			boolean shouldBuy = true;
			if(totalTime + goalCost/cookieRate < totalTime + goalCost/(cookieRate+extraRate) + farmCost/cookieRate)
				shouldBuy =false;
			while(shouldBuy){
				totalTime += farmCost/cookieRate;
				cookieRate += extraRate;
				if(totalTime + goalCost/cookieRate < totalTime + goalCost/(cookieRate+extraRate) + farmCost/cookieRate)
				{
					shouldBuy = false;
				}
			}
			ans += "Case #"+ (i+1) + ": " + (totalTime + goalCost/cookieRate) + "\n";
		}
		System.out.println(ans);
	}
}
