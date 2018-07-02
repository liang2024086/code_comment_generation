package methodEmbedding.Cookie_Clicker_Alpha.S.LYD35;

import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;
public class CookieClicker {
	public static void main(String[] args) throws IOException {
		File file = new File("TestCode.txt");
		Scanner keyboard = new Scanner(file);
		File output = new File("Solutions.txt");
		FileWriter fw = new FileWriter(output);
		int a = keyboard.nextInt();
		for(int i = 0; i < a; i++) {
			double c = keyboard.nextDouble();
			double f = keyboard.nextDouble();
			double x = keyboard.nextDouble();
			double currRate = 2.0;
			double timeElapsed = 0;
			boolean shouldContinue = true;
			do {
				shouldContinue = true;
				double timeToNext = c / currRate;
				double timeTogoal = (x / currRate);
				double betterTime = timeToNext + (x / (currRate + f));
				if (betterTime < timeTogoal) {
					currRate = currRate + f;
					timeElapsed += timeToNext;
				} else {
					timeElapsed += timeTogoal;
					shouldContinue = false;
				}
				
			} while(shouldContinue);
			DecimalFormat df = new DecimalFormat("#.0000000");
			fw.write("Case #" + (i+1) + ": " + df.format(timeElapsed) + "\n");
		}
		keyboard.close();
		fw.close();
	}
}
