package methodEmbedding.Cookie_Clicker_Alpha.S.LYD948;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class CookieClicker {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		File in = new File("D:/Workspace/Cenas/src/codejam/cookies/B-small-attempt0.in");
		File out = new File("D:/Workspace/Cenas/src/codejam/cookies/B-small-attempt0.out");
		PrintWriter p = new PrintWriter(out);
		BufferedReader input = new BufferedReader(new FileReader(in));
		int n = Integer.parseInt(input.readLine());
		for(int l = 1; l <= n; l++){
			String[] numbers = input.readLine().split(" ");
			double cookiesPerSecond = 2.0;
			double farmCost = Double.parseDouble(numbers[0]);
			double farmUpgrade = Double.parseDouble(numbers[1]);
			double wantedCookies = Double.parseDouble(numbers[2]);
			double timeSpent = 0.0;
			double solution = 0.0;
			while(true){
				double timeTilBuy = farmCost / cookiesPerSecond;
				double newTimeSpent = timeSpent + timeTilBuy;
				double newCookiesPerSecond = cookiesPerSecond + farmUpgrade;
				double totalTime1 = newTimeSpent + (wantedCookies/newCookiesPerSecond);
				double totalTime2 = timeSpent + (wantedCookies/cookiesPerSecond);
				if(totalTime1 < totalTime2){
					timeSpent = newTimeSpent;
					cookiesPerSecond = newCookiesPerSecond;
				}else{
					solution = totalTime2;
					break;
				}
			}
			p.write("Case #" + l + ": " + solution + "\n");
		}
		p.close();
		input.close();
	}

}
