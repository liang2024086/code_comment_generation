package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1295;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CookieClickAlpha {

	public static void main(String[] args) throws FileNotFoundException {
		String pathToFile = "C:/Users/Alex/Dropbox/Programming/Eclipse/Workspace/GoogleCodeJam/Qualification2014/";
		File inFile = new File(pathToFile, "CookieClickerAlpha-small.in");
		Scanner scanner = new Scanner(inFile);
		
		int cases = scanner.nextInt();
		
		for (int i = 1; i <= cases; i ++) {
			double c = scanner.nextDouble();
			double f = scanner.nextDouble();
			double x = scanner.nextDouble();
			
			int maxFarms = (int)Math.ceil(x/c - 1.0 - 2.0/f);
			
//			System.out.println(i + "\t" + maxFarms);
			
			double time = 0;
//			System.out.print("Case #" + i + ": " + maxFarms + " ");
			System.out.print("Case #" + i + ": ");
			if (maxFarms > 0) {
				for (int numFarms = 0; numFarms < maxFarms; numFarms ++) {
					double step = c/(numFarms*f+2.0);
//					System.out.print(step + " ");
					time += c/(numFarms*f+2.0);
					
				}
				time += x/(maxFarms*f+2.0);
//				System.out.println(x/(maxFarms*f+2.0) + " " + time);
				System.out.println(time);
			} else {
				System.out.println(x/2.0);
			}
		}
	}

}
