package methodEmbedding.Cookie_Clicker_Alpha.S.LYD501;

import java.io.*;
import java.util.*;


public class CookieClicker {

	public static void main(String[] args) {
		Scanner in = null;
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new File("output2.txt"));
			in = new Scanner(new File("B-small-attempt0.in"));
			int caseTotal = in.nextInt();
			in.nextLine();
			int caseNum = 1;
			while (in.hasNextLine()) {
				String line = in.nextLine();
				String[] tokens = line.split(" ");
				double c = Double.parseDouble(tokens[0]);
				double f = Double.parseDouble(tokens[1]);
				double x = Double.parseDouble(tokens[2]);

				double totalTime = 0;
				int numFarm = 0;
				double buildTime = 0;
				boolean done = false;
				while (!done) {
					double time1 = x/(2+f*numFarm)+buildTime;
					buildTime += c/(2+f*numFarm);
					double time2 = x/(2+f*(numFarm+1))+buildTime;
					
					if (time1<=time2)
					{
						totalTime = time1;
						done = true;
					}
					else
					{
						numFarm++;
					}
				}
				//				for(int i=0; i<(int)x/2 && !done; i++) {
				//					cookiePerSec = 2+f*numFarm;
				//					totalCookie += cookiePerSec; 
				//					
				//					double time = x/cookiePerSec > x/(2+f*(numFarm+1))? x/cookiePerSec : x/(2+f*(numFarm+1));
				//					totalTime += time;
				//					if (totalCookie>x) done = true;
				//					else if (totalCookie>c && x/cookiePerSec > x/(2+f*(numFarm+1))) {
				//						numFarm++;
				//						totalCookie -=c;
//					}
//				}
				pw.println("Case #"+caseNum+": "+totalTime);
				caseNum++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally
		{
			in.close();
			pw.close();
		}
	}
}
