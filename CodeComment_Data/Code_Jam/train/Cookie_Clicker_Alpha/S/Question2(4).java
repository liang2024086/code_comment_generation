package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1609;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File(System.getProperty("user.dir")+"/"+"B-small-attempt0.in"));
		int tests = input.nextInt();
		for (int i = 1; i <= tests; i++) { 
			double c = input.nextDouble(); 
			double f = input.nextDouble(); 
			double x = input.nextDouble(); 
			
			double cookieRate = 2.0;
			double time = x/cookieRate; 
			double timeNext = c/cookieRate + x/(cookieRate + f);
			double totalTime = 0.0;
			
			while (time > timeNext) {
				totalTime += c/cookieRate; 
				cookieRate += f; 
				time = x/cookieRate; 
				timeNext = c/cookieRate + x/(cookieRate + f);
			}
			totalTime += time; 
			
			System.out.format("Case #%d: %.7f\n", i, totalTime);
		}
	}

}
