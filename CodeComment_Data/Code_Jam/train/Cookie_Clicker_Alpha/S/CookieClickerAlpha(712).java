package methodEmbedding.Cookie_Clicker_Alpha.S.LYD856;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class CookieClickerAlpha {
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(new File("b.txt"));
			PrintStream out = new PrintStream("b-out-small.txt");
			int n = in.nextInt();
			for (int i=0; i<n; i++) {
				//Solve problem here
				double c = in.nextDouble(); //price of the farm 
				double f = in.nextDouble(); //increase after 1 farm
				double x = in.nextDouble(); //goal
				double timeLast = x/2;
				int numFarm = 1;
				while (true) {
					//System.out.println("total time: " + timeLast);
					double totalTime = 0;
					for (int j=0; j<numFarm; j++) {
						totalTime += c / (2+f*j);
					}
					totalTime += x / (2+(f*numFarm));
					if (totalTime >= timeLast) {
						break;
					} else {
						timeLast = totalTime;
						numFarm++;
					}
				}
				out.print(String.format("Case #%s: ", i+1));
				out.println(String.format("%.7f",timeLast));
				out.flush();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
