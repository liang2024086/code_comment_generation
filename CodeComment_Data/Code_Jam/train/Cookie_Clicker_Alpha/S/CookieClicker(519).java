package methodEmbedding.Cookie_Clicker_Alpha.S.LYD657;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class CookieClicker {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(new File("in.txt"));
		
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File("out.txt")));

		int t = s.nextInt();
		
		for (int i = 0; i < t; i++){
			double c = s.nextDouble();
			double f = s.nextDouble();
			double x = s.nextDouble();
			
			double timeUsed = 0;
			double rate = 2;
			
			while(true) {
				// case 1: wait until reach X
				double timeToX = x / rate;
				
				// case 2: buy a farm, and wait until reach X
				double timeToC = (c / rate);
				double newTimeToX = (x / (rate + f));
				
				if (timeToX < (timeToC + newTimeToX)){
					// not worth to buy a new farm
					timeUsed += timeToX;
					break;
				}else{
					timeUsed += timeToC;
					rate += f;
				}
			}
			
			writer.write("Case #" + (i + 1) + ": " + String.format("%.7f", timeUsed) + "\n");
		}
		
		writer.close();
	}

}
