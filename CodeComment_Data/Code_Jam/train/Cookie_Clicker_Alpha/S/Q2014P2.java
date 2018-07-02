package methodEmbedding.Cookie_Clicker_Alpha.S.LYD613;

import java.io.*;
import java.util.*;


public class Q2014P2 {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException{
		// TODO Auto-generated method stub
		String INPUT = "B-small-attempt0.in";
		String OUTPUT = "B-small-attempt0.out";
		File file = new File(INPUT);
		PrintWriter writer = new PrintWriter(OUTPUT, "UTF-8");
		Scanner sc = new Scanner(file);
		int test = sc.nextInt();
		double farm;
		double deltaRate;
		double winning;
		double rate;
		double farmBuild;
		double lastTime;
		double newTime;
		for (int testCase=1; testCase <= test; testCase++){
			farm = Double.parseDouble(sc.next());
			deltaRate = Double.parseDouble(sc.next());
			winning = Double.parseDouble(sc.next());
			rate=2;
			farmBuild = 0;
			lastTime = winning/rate;
			farmBuild = farmBuild + farm/rate;
			newTime = winning/(rate+deltaRate) + farmBuild;
			rate += deltaRate;
			while (newTime < lastTime){
				lastTime = newTime;
				farmBuild = farmBuild + farm/rate;
				newTime = winning/(rate+deltaRate) + farmBuild;
				rate += deltaRate;
			}
			writer.println("Case #" + testCase + ": " + lastTime);
		}
		writer.close();
	}
}
