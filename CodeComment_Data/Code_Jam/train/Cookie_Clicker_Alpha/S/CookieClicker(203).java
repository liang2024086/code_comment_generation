package methodEmbedding.Cookie_Clicker_Alpha.S.LYD509;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


/**
 * Author: eeroglu
 * Date: 12 Nis 2014 10:35:26
 * Package: 
 *
 */
public class CookieClicker {

	public static void main(String[] args) throws IOException {
//		final String inputFile = "resources/cookieclicker/input_test.txt";
//		final String outputFile = "resources/cookieclicker/output_test.txt";
		
		final String inputFile = "resources/cookieclicker/B-small-attempt1.in";		
		final String outputFile = "resources/cookieclicker/B-small-attempt1.out";
		
		Scanner reader = new Scanner(new File(inputFile));
		reader.useLocale(Locale.US);
		BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
		
		int numberOfCases = reader.nextInt();
		for(int i = 0; i < numberOfCases; i++) {
			double currentSpeed = 2.0;
			double currentTime = 0.0;
			double cost = reader.nextDouble();
			double delta = reader.nextDouble();
			double remaining = reader.nextDouble();
			
			boolean done = false;
			while(!done) {
				if(remaining < cost) {
					currentTime += (remaining / currentSpeed);
					done = true;
				}
				else {
					double newFactoryTime = (cost / currentSpeed);
					double waitTime = (remaining / currentSpeed);
					double newSpeed = currentSpeed + delta;
					if(waitTime <= (newFactoryTime + (remaining / newSpeed))) {
						currentTime += waitTime;
						done = true;
					}
					else {
						currentTime += newFactoryTime;
						currentSpeed = newSpeed;						
					}
				}				
			}
						
			writer.write("Case #" + (i + 1) + ": " + currentTime + "\n");
		}
		
		reader.close();
		writer.close();
	}

}
